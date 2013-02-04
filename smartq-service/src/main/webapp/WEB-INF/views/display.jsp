<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SmartQ Service</title>
</head>
<body>
	<div>
	    <h1>Smart Queue</h1>
	    	    
		<h4>${rightNowTime}</h4>
	</div>
	<div>Current Number = ${currentQueueNumber}</div>
	<div>Waiting = ${waitingInQueue}</div>

	<hr>

	<form method="POST" action="/smartq-service/addQueue">
		<input type="submit" value="Add Queue" />
	</form>

	<hr>

	<form method="POST" action="/smartq-service/pollQueue">
		<input type="submit" value="Poll Queue" />
	</form>

</body>
</html>