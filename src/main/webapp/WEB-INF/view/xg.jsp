<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
   <%@  taglib  prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--日期插件--><script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
<!--bootstrap的css,js -->
<link rel="stylesheet" href="/resource/css/index3.css"/>
<link rel="stylesheet" href="/resource/bootstrap-4.3.1/css/bootstrap.css"/> 
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script> 
</head>
<body>
	
				#:<input type="text" value="${gs.id}"><br>
				关键字:<input type="text" value="${gs.gjz}"><br>
				描述:<input type="text" value="${gs.ms}"><br>
				公司名字:<input type="text" value="${gs.gsname}"><br>
				产品:<input type="text" value="${gs.cp}"><br>
				地址:<input type="text" value="${gs.address}"><br>
				资本<input type="text" value="${gs.zb}"><br>
				成立时间<input type="text" value="${gs.clsj}"><br>
				年检时间<input type="text" value="${gs.njsj}"><br>
				
				年检状态<input type="text" value="${gs.nzzt}">	
						<c:if test="${f.nzzt==0}">通过</c:if>
						<c:if test="${f.nzzt==1}">未通过</c:if>
						<c:if test="${f.nzzt==2}">待定</c:if><br>
				备注<input type="text" value="${gs.bz}"><br>
			<a href="list">首页</a>
	
</body>
</html>