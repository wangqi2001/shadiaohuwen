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
<h1>胡文是沙雕</h1>
<table>
<tr><td>编号</td><td>书名</td><td>作者</td><td>类型</td><td>操作</td></tr>
<c:if test="${li!=null}">
<c:forEach items="${li}" var="ps">
<tr><td>${ps.mid}</td><td>${ps.namee}</td><td><a href="/hibernate_web/good/xiugai_cha.action?mid=${ps.mid}">${ps.authore}</a></td><td><c:if test="${ps.typee==1}">学习</c:if>
<c:if test="${ps.typee==2}">其他</c:if>
</td><td><a href="/hibernate_web/good/sanchu.action?mid=${ps.mid}">删除</a></td></tr>
</c:forEach>
</c:if>
</table>
</body>
</html>