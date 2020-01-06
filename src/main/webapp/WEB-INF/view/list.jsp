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
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js"></script>
</head>
<body>
<form action="list" method="post">

	id:<input type="text" name="id" value="${id}">
	关键字:<input type="text" name="gjs" value="${gjz}" >
	描述:<input type="text" name="ms" value="${ms}" >
	公司名称:<input type="text" name="gsname" value="${gsname}" >
	主营产品:<input type="text" name="cp" value="${cp}" >
	地址:<input type="text" name="address" value="${address}" >
	 注册资本:<input type="text" name="zb" value="${zb}" >
	 成立时间:<input type="text" name="clsj" value="${clsj}" >
	年检日期:<input type="text" name="njsj" value="${njsj}" >
	年检日期1:<input type="text" name="njrq1" value="${njrq1}" >---<input type="text" name="njrq2" value="${njrq2}" >
	<input type="submit" value="搜索"> 
</form>
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
				<td>
					<input type="button" value="编辑" onclick="xg(${f.id})">
				</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="50">
					当前是${info.pageNum}/${info.pages}页,共${info.total}条数据
					<a href="list?pageNum=1">首页</a>
					<a href="list?pageNum=${info.prePage}">上一页</a>
					<a href="list?pageNum=${info.nextPage}">下一页</a>
					<a href="list?pageNum=${info.pages}">尾页</a>
				</td>
			</tr>
	  </table>
</div>
</body>
<script type="text/javascript">

	function xg(id){
		alert(id)
		location="xg?id="+id;
	}

</script>
</html>