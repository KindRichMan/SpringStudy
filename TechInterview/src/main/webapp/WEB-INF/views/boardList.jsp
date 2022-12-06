<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
			#button {
			border:1x solid #ff0080;    /*---테두리 정의---*/
			background-Color:#ffe6f2;   /*--백그라운드 정의---*/
			font:12px 굴림;      /*--폰트 정의---*/
			font-weight:bold;   /*--폰트 굵기---*/
			color:#ff0080;    /*--폰트 색깔---*/
			width:130px;height:30px;  /*--버튼 크기---*/
			}
		</style>
</head>
<body>
       
  <div class= "container">
     <h1>원생 목록</h1>
     <form action="/boardInsert" method="post">
     이름 : <input type="text" name="name"> 
     주소 : <input type="text" name="address">
     학교 : <input type="text" name="university">
     전공 : <input type="text" name="major">
    <input type="submit" value="신입원생등록"><input type="reset" value="초기화"> 
    </form>
     <table border="1" class="table table">
          <thead>
              <tr>
                 <th>등록번호</th>
                 <th>학생이름</th>
                 <th>주소동</th>
                 <th>학교</th>
                 <th>전공학과</th>
                 <th>등록날짜</th>
                 <th></th>
                 <th></th>
              </tr>
          </thead>
          <tbody>
              <c:forEach var="board" items="${boardList }">
                <tr>
                  <td>${board.bno}</td>
                  <td><a href="/boardDetail/${board.bno }">${board.name}</a></td>
                  <td>${board.address}</td>
                  <td>${board.university}</td>
                  <td>${board.major}</td>
                  <td>${board.regdate}</td>
                  <td><form action="/boardUpdateForm" method="Post"><input type="hidden" value="${board.bno }" name="bno">
                           <input type="submit" value="수정" class="btn btn-primary btn-sm">             
                      </form></td>
                  
                 <td><form action="/boardDelete" name ="del"method="post">
	               <input type="hidden"
	                   value="${board.bno}" name="bno"/>
	               
	            </form>
	            <input id="delButton" type="button" value="원생정보삭제" class="btn btn-danger btn-sm"onclick="removeCheck()">
                </td>

                </tr>  
              </c:forEach>
          </tbody>
     </table>
     <script>
		function removeCheck() {

			if (confirm("정말 삭제하시겠습니까??") == true) { //확인

				document.del.submit();

			} else { //취소

				return false;

			}

		}
	</script>
     
  
     <!-- 삭제 팝업 -->
   
    <!--<form action="/boardInsert" method="Get">
	        <input type="submit" value="글쓰기" class="btn btn-warning">    
	    </form>
	 -->
	 
	 <!-- {pageMaker } -->
	 <!-- 이전 페이지 버튼 보일지 결정하는 부분 -->
		  <ul class="pagination justify-content-center">
		  	<c:if test="${pageMaker.prev }">
		    	<li class="page-item">
		    		<a class="page-link" href="/boardList?pageNum=${pageMaker.startPage -1}&searchType=${pageMaker.cri.searchType }&keyword=${pageMaker.cri.keyword}">
		    		&laquo;
		    		</a>
		    	</li>
		    </c:if>
		    
		    <!-- 밑에 깔아줄 버튼들 -->
		    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
		    	<li class="page-item ${pageMaker.cri.pageNum eq idx ? 'active' : '' }">
		    		<a class="page-link" href="/boardList?pageNum=${idx}&searchType=${pageMaker.cri.searchType }&keyword=${pageMaker.cri.keyword}">
		    			${idx}
		    		</a>
		    	</li>
		    </c:forEach>
		    
		    <c:if test="${pageMaker.next && pageMaker.endPage > 0 }">
		    	<li class="page-item">
		    		<a class="page-link" href="/boardList?pageNum=${pageMaker.endPage + 1}&searchType=${pageMaker.cri.searchType }&keyword=${pageMaker.cri.keyword}">
		    			&raquo;
		    		</a>
		    	</li>
		    </c:if>
		  </ul>
		  
		  <div class="row">
		    <!-- 검색창 부분 -->
		    <form action="/boardList" method="get">
		      <select name="searchType">
		         <option value="n">-</option>
		         <option value="na" ${pageMaker.cri.searchType eq 'na' ? 'selected' : ''}>이름</option>
		         <option value="addre" ${pageMaker.cri.searchType eq 'addre' ? 'selected' : '' }>주소</option>
		         <option value="univer" ${pageMaker.cri.searchType eq 'univer' ? 'selected' : '' }>학교명</option>
		         <option value="major" ${pageMaker.cri.searchType eq 'major' ? 'selected' : '' }>학과</option>
		      </select> 
		        <input type="text" name="keyword" placeholder="검색어" value="${pageMaker.cri.keyword }">
		  		<input type="submit" value="검색하기">
		  	</form> 	
		  </div> 
	 </div>
</body>
</html>