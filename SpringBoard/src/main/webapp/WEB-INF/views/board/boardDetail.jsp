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

  
   <div class="container">
     <h1 class="text text-primary">${board.bno }번 글 조회중</h1>
     <div class="row">
	     <div class="col-md-9">
	     	<input type="text" class="form-control" value="제목 : ${board.title }">
	     </div>
	     <div class="col-md-3">
	        <input type="text" class="form-control" value="글쓴이 :${board.writer }">
	     </div>   
	  </div>   
     <textarea rows="10" class="form-control">${board.content }</textarea>
     <div class="row">
        <div class="col-md-3">쓴날짜 :</div>
        <div class="col-md-3">${board.regdate }</div>
        <div class="col-md-3">수정 날짜 :</div>
        <div class="col-md-3">${board.updatedate }</div>
     </div>
     <div class="row">
       <div class="col-md-1">
          <a href="/boardList?pageNum=${param.pageNum == null ? 1: param.pageNum}&searchType=${param.searchType}&keyword=${param.keyword }" class="btn btn-success btn-sm">글목록</a>
	   </div>   
	   <div class="col-md-1"> 
	     <form action="/boardDelete" method="Post"> 
	        <input type="hidden" value="${board.bno }" name="bno" />
	        <input type="submit" value="삭제" class="btn btn-danger btn-sm">
	          <input type="hidden" name="pageNum" value="${param.pageNum }"/>
	         <input type="hidden" name="searchType" value="${param.searchType }"/>
	         <input type="hidden" name="keyword" value="${param.keyword }"/>
	     </form>
	    </div>
	    <div class="col-md-1">  
	     <form action="/boardUpdateForm" method="Post">
	        <input type="hidden"  name="bno"  value="${board.bno }" />
	         <input type="hidden" name="pageNum" value="${param.pageNum }"/>
	         <input type="hidden" name="searchType" value="${param.searchType }"/>
	         <input type="hidden" name="keyword" value="${param.keyword }"/>
	        <input type="submit" value="글수정" class="btn btn-warning btn-sm">
	     </form>
	   </div>  
	</div>    
   </div>    
</body>
</html>   
	 