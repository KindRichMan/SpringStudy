<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
	<div class="container">
	  <h1>게시물 목록</h1>
	  <table border="1" class="table table">
	      <thead >
	         <tr>
	            <th>글번호</th>
	            <th>글제목</th>
	            <th>글쓴이</th>
	            <th>쓴날짜</th>
	            <th>수정날짜</th>
	         </tr>
	      </thead>
	      <tbody>
	          <c:forEach var="board" items="${boardList }">
	              <tr> 
		             <td>${board.bno }</td>
		             <td><a href="/boardDetail/${board.bno}">${board.title }</td>
		             <td>${board.writer }</td>
		             <td>${board.regdate }</td>
		             <td>${board.updatedate }</td>
	              </tr> 
	          </c:forEach>
	      </tbody>
	  </table>
	     <form action="/boardInsert" method="Get">
	         <input type="submit" value="글쓰기" class="btn btn-success">
	     </form>
	     ${pageMaker }
	     
	     <!--// 페이지 네이션  -->
	     
	 <ul class="pagination justify-content-center" >
		   <c:if test="${pageMaker.prev }">
		    	<li class="page-item"><a class="page-link" href="boardList?pageNum=${pageMaker.startPage -1 }">Previous</a></li>
		   </c:if> 
		   
		   <!-- 밑에 깔아줄 버튼들 -->
		   <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
		    	<li class="page-item ${pageMaker.cri.pageNum eq idx ? 'active' :'' }"><a class="page-link" href="/boardList?pageNum=${idx }">${idx }</a></li>
		   </c:forEach> 	
		  <!-- 마지막 페이지  -->
		   <c:if test="${pageMaker.next && pageMaker.endPage > 0 }">
		   	 <li class="page-item"><a class="page-link" href="/boardList?pageNum=${pageMaker.endPage +1 }">Next</a></li>
		   </c:if>	 
     </ul>
	 </div>      
</body>
</html>