

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<style>
			#button {
			border:1x solid #ff0080;    /*---테두리 정의---*/
			background-Color:#ffe6f2;   /*--백그라운드 정의---*/
			font:12px 굴림;      /*--폰트 정의---*/
			font-weight:bold;   /*--폰트 굵기---*/
			color:#ff0080;    /*--폰트 색깔---*/
			width:150px;height:30px;  /*--버튼 크기---*/
			}
		</style>
  	
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div class="container">
         <h1 class="text text-primary">${board.name }원생 정보조회중</h1>
          <div class="row">
             <div class="col-md-9">
                 <input type="text" class="form-control" value="이름 : ${board.name }"/>
             </div>
             <div class="col-md-9">
                 <input type="text" class="form-control" value="주소 : ${board.address }"/>
             </div> 
             <div class="col-md-9">
                 <input type="text" class="form-control" value="주소 : ${board.university }"/>
             </div> 
             <div class="col-md-9">
                 <input type="text" class="form-control" value="전공 : ${board.major }"/>
             </div> 
                <div class="row">
	              <div class="col-md-3">등록일 : ${board.regdate}</div>
	              <div class="col-md-3"></div>
	            </div> 
	            <form action="/boardDelete" name="del" method="post">
	               <input type="hidden"
	                   value="${board.bno}" name="bno"/>	               
	            </form>
	           <input id="button" type="button" value="원생정보삭제하기" onclick="removeCheck()">

          </div> 
      </div>
	<script>
		function removeCheck() {

			if (confirm("정말 삭제하시겠습니까??") == true) { //확인

				document.del.submit();

			} else { //취소

				return false;

			}

		}
	</script>
</body>
</html>