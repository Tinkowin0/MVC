<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>

<%@ attribute name="value" required="true" type="java.time.LocalDateTime" %>


<sp:eval expression="T(java.time.format.DateTimeFormatter).ofPattern('yyyy-MM-dd  HH:mm:ss').format(value)"></sp:eval>

