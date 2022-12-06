<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


     <form action="/boardUpdate" method="post">
     <input type="hidden" name="bno" value="${board.bno }"/>
     이름 : <input type="text" name="name" value="${board.name }"> 
     주소 : <input type="text" name="address" value="${board.address }">
     학교 : <input type="text" name="university" value="${board.university }">
     전공 : <input type="text" name="major" value="${board.major }">
    <input type="submit" value="수정"><input type="reset" value="초기화"> 
    </form>
</body>
</html>