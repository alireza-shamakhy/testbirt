<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%-- <html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html> --%>

<html>
<head>
</head>
<body>
<h1>BIRT Report</h1>
<p>
<a href="http://localhost:8080/springandbirt/reports?ReportName=TopNPercent.rptdesign">click here to run BIRT Report</a><br>
<a href="http://localhost:8080/springandbirt/reports?ReportName=SampleSpring.rptdesign">click here to run BIRT Report that calls a Spring Bean</a>
</p>
<%= new java.util.Date() %>
</body>
</html>
