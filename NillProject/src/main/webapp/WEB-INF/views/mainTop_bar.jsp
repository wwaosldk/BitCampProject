<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<style>
a{
	text-decoration:none;
}
button {
	background-color: #4CAF50;
	color: black;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	/* width: 100%; */
}
.loginbt {
	background-color: black;
	color: white;
	padding: 30px 20px;
	margin: 0px;
	position: fixed;
	top: 1px;
	right: 60px;
	cursor: pointer;
	z-index: 5;

	/* width: 100%; */
}

.loginbt:hover {
	background-color: #CCCCCC;
}
.blankbox{
	height:113px;
}
</style>


<script type="text/javascript">
	function logout(str){

		var con = confirm("로그아웃 할꺼야?");
	 	if(con == true){
<%-- 	 		<%session.invalidate();%> --%>
			location.replace("/op/user/successLogout");
	 		
	  //logout을 위해 세션을 제거하는 페이지 호출
	 	}else{}
	}
	
	function loginchk(){
		 /* var logincheck = confirm("로그인 후 볼 수 있는 페이지 입니다. 로그인 페이지로 가시겠습니까?"); */
		 if(confirm("로그인 후 볼 수 있는 페이지 입니다. 로그인 페이지로 가시겠습니까?")){
			 location.replace("naverLogin");
			 return true;
		 } else{ false;
		 }
	}
</script>



<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.w3-sidebar a {
	font-family: "Roboto", sans-serif
}

body, h1, h2, h3, h4, h5, h6, .w3-wide {
	font-family: "Montserrat", sans-serif;
}
</style>

<p class="w3-left">
	<c:if test="${loginInfo eq null }">
		<button type="button" class="loginbt" onclick="location.href='naverLogin'"
			style="width: auto;">Login</button>
	</c:if>
	<c:if test="${loginInfo ne null }">
		<button type="button" class="loginbt" onclick="logout('Main.jsp')"
			style="width: auto;">LogOut</button>
	</c:if>
</p>


<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-bar-block w3-white w3-collapse w3-top"
	style="z-index: 3; width: 250px" id="mySidebar">
	<div class="w3-container w3-display-container w3-padding-16">
		<i onclick="w3_close()"
			class="fa fa-remove w3-hide-large w3-button w3-display-topright"></i>
		<h3 class="w3-wide">
			<b><a href="/op">Nill's</a></b>
		</h3>
	</div>
	<div class="w3-padding-64 w3-large w3-text-grey"
		style="font-weight: bold">
		<a onclick="myAccFunc()" href="javascript:void(0)"
			class="w3-button w3-block w3-white w3-left-align" id="myBtn">
			Member <i class="fa fa-caret-down"></i>
		</a>
		<div id="demoAcc"
			class="w3-bar-block w3-hide w3-padding-large w3-medium">
			<!-- <a href="#" class="w3-bar-item w3-button w3-light-grey">
      <i class="fa fa-caret-right w3-margin-right"></i>Skinny</a> -->
			<c:if test="${loginInfo eq null }">
				<a href="#" class="w3-bar-item w3-button"
					onclick="return loginchk();">Mypage</a>
			</c:if>
			<c:if test="${loginInfo ne null }">

				<a href="mypage" class="w3-bar-item w3-button">Mypage</a>
				</button>
			</c:if>
			<a href="#" class="w3-bar-item w3-button">회원리스트</a> <a href="#"
				class="w3-bar-item w3-button">사원 등록</a>
		</div>

		<c:if test="${loginInfo eq null }">
			<a href="#" class="w3-bar-item w3-button"
				onclick="return loginchk();">Gallery</a>
		</c:if>
		<c:if test="${loginInfo ne null }">

			<a href="gallery" class="w3-bar-item w3-button">Gallery</a>
			</button>
		</c:if>

		<a href="#" class="w3-bar-item w3-button">방명록</a> <a href="#"
			class="w3-bar-item w3-button">여기에</a> <a href="#"
			class="w3-bar-item w3-button">여러</a> <a href="#"
			class="w3-bar-item w3-button">기능들</a> <a href="#"
			class="w3-bar-item w3-button">페이지들</a> <a href="#"
			class="w3-bar-item w3-button">넣어야</a> <a href="#"
			class="w3-bar-item w3-button">하는데</a> <a href="#"
			class="w3-bar-item w3-button"> ...</a>
	</div>
	<a href="#footer" class="w3-bar-item w3-button w3-padding">Contact</a>
	<a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding"
		onclick="document.getElementById('newsletter').style.display='block'">Newsletter</a>
	<a href="#footer" class="w3-bar-item w3-button w3-padding">Subscribe</a>
</nav>

<!-- Top menu on small screens -->
<header class="w3-bar w3-top w3-hide-large w3-black w3-xlarge">
	<div class="w3-bar-item w3-padding-24 w3-wide">
		<b><a href="/op">Nill's</a></b>
	</div>
	<a href="javascript:void(0)"
		class="w3-bar-item w3-button w3-padding-24 w3-right"
		onclick="w3_open()"><i class="fa fa-bars"></i></a>
</header>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()"
	style="cursor: pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left: 250px">

	<!-- Push down content on small screens -->
	<div class="w3-hide-large" style="margin-top: 113px"></div>

<div class="blankbox">
	
</div>

	<script>
// Accordion 
function myAccFunc() {
    var x = document.getElementById("demoAcc");
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else {
        x.className = x.className.replace(" w3-show", "");
    }
}

// Click on the "Jeans" link on page load to open the accordion for demo purposes
document.getElementById("myBtn").click();


// Script to open and close sidebar
function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
    document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
    document.getElementById("myOverlay").style.display = "none";
}
</script>