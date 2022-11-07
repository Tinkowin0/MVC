package com.jdc.security.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import com.jdc.security.service.model.AccessInfo;
import com.jdc.security.service.model.AccessInfo.Type;

@Service
public class AccessInfoService {

	public RowMapper<AccessInfo> row;

	public AccessInfoService() {
		row = new BeanPropertyRowMapper<>(AccessInfo.class);
	}

	@Autowired
	private SimpleJdbcInsert accessInsert;

	public void create(String username, Type logout) {
		if (!"admin".equals(username)) {
			accessInsert.execute(Map.of("login_id", username, 
					"type", logout.name()));
		}
	}

	public List<AccessInfo> getAll(String loginId){
		return accessInsert.getJdbcTemplate()
				.query("""
				select a.id , a.login_id , u.name , a.type, a.access_time time from
				access_info a join user u on u.login = a.login_id where a.login_id = ?
				order by a.access_time desc
						""", 
				stmt ->{ stmt.setString(1, loginId);}, row
//				(rs , index) ->{
//					var list = new AccessInfo();
//					list.setId(rs.getInt("id"));
//					list.setLoginId(rs.getString("login_id"));
//					list.setUserName(rs.getString("name"));
//					list.setType(Type.valueOf(rs.getString("type")));
//					list.setTime(rs.getTimestamp("time").toLocalDateTime());
//					return list;
//				}
				);
	}
	public List<AccessInfo> getAll(){
		return accessInsert.getJdbcTemplate()
				.query("""
				select a.id , a.login_id , u.name userName, a.type, a.access_time time from
				access_info a join user u on u.login = a.login_id
				order by a.id desc		
						""",  row);
	}
}
