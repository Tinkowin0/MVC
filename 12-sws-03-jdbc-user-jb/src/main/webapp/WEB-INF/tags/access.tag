<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="list" required="true" type="java.util.List" %>



<%@ taglib prefix="app" tagdir="/WEB-INF/tags"%>
<div class="card pt-4">
	<div class="card-header">
		<h2>Access LOg</h2>
	</div>
	<div class="card-body">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>LoginId</th>
					<th>UserName</th>
					<th>AccessType</th>
					<th>AccessTime</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="item" items="${list }">
					<tr>
						<td>${item.id }</td>
						<td>${item.loginId }</td>
						<td>${item.userName }</td>
						<td>${item.type }</td>
						<td>
						<app:dateTime value="${item.time }"></app:dateTime>
						</td>
					</tr>
				</c:forEach>

			</tbody>

		</table>

	</div>
	</div>