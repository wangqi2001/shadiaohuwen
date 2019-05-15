<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>修改图书信息</h1>
<c:if test="${li!=null}">
<c:forEach items="${li}" var="ps">
<form action="/hibernate_web/good/xiugai_gai.action?mid=${ps.mid}" method="post">
书名：<input type="text" value="${ps.namee}" name="shuming"><br/>
作者：<input type="text" value="${ps.authore}" name="zuozhe"><br/>
类型：<input type="text" value="${ps.typee}" name="leixing"><br/>
<input type="submit" value="修改">
</form>
</c:forEach>
</c:if>
</body>
</html>