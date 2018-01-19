<%@ page 
	language="java" 
	pageEncoding="UTF-8" 
	import="java.util.*"
	import="tpJavaEE.*"
	errorPage="error.jsp"
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ho Ana signifie famille</title>
</head>
<body>

<% 
	Famille f = new Famille("Semoule");
%>

<%
	f.addMembres(new Pere("Pascal"));
	f.addMembres(new Mere("Jeanine"));
	f.addMembres(new Frere("Enfant non voulu 1"));
	f.addMembres(new Soeur("Enfant non voulu 2"));
%>

<ul>
	<% for ( Personne p : f.getMembres()){ %>
	<li><%= p %></li>
	<% } %>
</ul>
	
</body>
</html>