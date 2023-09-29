<!DOCTYPE html>
<html lang="en">
<head>
<title>Fetching All Details</title>
<style type="text/css">
table, th, td {
	border-collapse: collapse;
	border: solid 2px black;
	width: 50%;
}

table {
	margin: 0 auto;
}

td {
	padding: 10px;
}
</style>
</head>

<body>
	<table>

			<tr>
				<th>Id</th>
				<th>Firstname</th>
				<th>Lastname</th>
				<th>Gender</th>
				<th>Age</th>
				<th>Mobile</th>
				<th>Email</th>
				<th>Place</th>
			<tr>

			<c:forEach var="person" items="${details}">
				<tr>
					<td>${person.id}</td>
					<td>${person.first_name}</td>
					<td>${person.last_name}</td>
					<td>${person.gender}</td>
					<td>${person.age}</td>
					<td>${person.mobile}</td>
					<td>${person.email}</td>
					<td>${person.place}</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>