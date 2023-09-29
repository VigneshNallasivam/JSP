<!DOCTYPE html>
<html>

<head>
<title>login-page</title>
<style type="text/css">
form {
	width: 50%;
	background-color: #be5a8145;
	margin: 0 auto;
	text-align: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	padding: 30px;
	border-radius: 20px;
}

input{
padding:10px
}

button {
	margin-left: 20px;
	border:none;
	width:10%;
	background-color:green
}
</style>
</head>

<body>
	<form method="post">
	<h3>My name is : ${first_name}</h3>
		<input type="text" name="userid" placeholder="User ID" /> <br>
		<br> <input type="password" name="password"
			placeholder="Password" /> <br>
		<br>
		<button>Submit</button>
	</form>
</body>

</html>