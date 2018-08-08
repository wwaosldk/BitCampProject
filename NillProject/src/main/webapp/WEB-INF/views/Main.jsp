<!DOCTYPE html>

<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Nill's Page</title>


<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

/* Full-width input fields */

/* Set a style for all buttons */


img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
	position: absolute;
	right: 25px;
	top: 0;
	color: #000;
	font-size: 35px;
	font-weight: bold;
}


</style>
</head>

<body>

	<%@ include file="mainTop_bar.jsp"%>


	<div style="padding-left: 16px" class="mainbox">
		<div class="container">
			<img
				src="https://www.ubc.ca/_assets/img/aerial_moa_panorama-1920x700.jpg"
				alt="Notebook" style="width: 100%;">
			<div class="content">
				<h1>Memory</h1>
				<p>I Wanna back the moment</p>
			</div>
		</div>
	</div>
</body>

</html>