<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>${board.bno }번 글 수정페이지입니다.</h1>
   <form action="/boardUpdate" method="post">
   <input type="hidden" value="${board.bno }" name="bno" />
     제목 :  <input type="text" name="title" value="${board.title }"></br>
     글쓴이 : <input type="text" name="writer" value="${board.writer }"></br>
     본문 :  <textarea name="content" name="content" rows="20" cols="100">${board.title }</textarea><br/>
            <input type="submit" value="수정완료"><input type="reset" value="초기화"> 
    </form>       
            


</body>
</html>