<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/boardInsert" method="post">
     이름 : <input type="text" name="name"> 
     주소 : <input type="text" name="address">
     학교 : <input type="text" name="university">
     전공 : <input type="text" name="major">
    <input type="submit" value="회원등록"><input type="reset" value="초기화"> 
  
</form>

</body>
</html>