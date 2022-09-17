<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST ERROR</title>
</head>
<body>
<script type="text/javascript">
	alert("허용되지않은 접근입니다.");
	location.href="${pageContext.request.contextPath}/login";
</script>
</body>
</html>