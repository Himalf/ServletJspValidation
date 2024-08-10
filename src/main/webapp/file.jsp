<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body>
    <h1>User Information</h1>
    <p>Name: <c:out value="${name}"/></p>
    <p>Age: <c:out value="${age}"/></p>
</body>
</html>
