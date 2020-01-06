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
	
	<div class="table-responsive-xl">
	  <table class="table">
			<tr>
				<td>#</td>
				<td>关键字</td>
				<td>描述</td>
				<td>公司名字</td>
				<td>产品</td>
				<td>地址</td>
				<td>资本</td>
				<td>成立时间</td>
				<td>年检时间</td>
				<td>年检状态</td>
				<td>备注</td>
				<td>
				
				</td>
			</tr>	  	
			<c:forEach items="${list}" var="f">
			<tr>
				<td>${f.id}</td>
				<td>${f.gjz}</td>
				<td>${f.ms}</td>
				<td>${f.gsname}</td>
				<td>${f.cp}</td>
				<td>${f.address}</td>
				<td>${f.zb}</td>
				<td>${f.clsj}</td>
				<td>${f.njsj}</td>
				<td>
					<c:if test="${f.nzzt==0}">通过</c:if>
					<c:if test="${f.nzzt==1}">未通过</c:if>
					<c:if test="${f.nzzt==2}">待定</c:if>
				</td>
				<td>${f.bz}</td>
			</tr>
			</c:forEach>
	  </table>
</div>
	
</body>
</html>