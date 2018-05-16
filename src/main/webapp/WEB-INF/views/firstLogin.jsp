<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Test First Login</h1>

	<h3>Persons List</h3>
	<c:if test="${!empty listaFornitori}">
		<table class="tg">
			<tr>
				<th width="80">	ID </th>
					<th width="120">  company   </th>
					<th width="120">  companyname n°   </th>
					<th width="120">  name   </th>
					<th width="120">   name2  </th>
					<th width="120">  address   </th>
					<th width="120">  address   </th>
					<th width="120">   city  </th>
					<th width="120">  post_code   </th>
					<th width="120">    country_region code </th>
					<th width="120">  e_mail   </th>
					<th width="120">  phone_no   </th>
					<th width="120">  fax_no   </th>
					<th width="120">  IVA   </th>
					<th width="120">   blockedQualification  </th>
					<th width="120">  qualification notes   </th>
					<th width="60">Edit</th>
					<th width="60">Delete</th>
			</tr>                  
			<c:forEach items="${listaFornitori}" var="forn">
				<tr>
					<td>${forn.VW_BodyRentalVendor_Id}</td>
					<td>${forn.company}</td>
					<td>${forn.companyNameNo}</td>
					<td>${forn.name}</td>
					<td>${forn.name2}</td>
					<td>${forn.address}</td>
					<td>${forn.address2}</td>
					<td>${forn.city}</td>
					<td>${forn.postCode}</td>
					<td>${forn.countryRegionCode}</td>
					<td>${forn.email}</td>
					<td>${forn.phoneNumber}</td>
					<td>${forn.faxNumber}</td>
					<td>${forn.vatNumber}</td>
					<td>${forn.blockedQualification}</td>
					<td>${forn.qualificationNotes}</td>
					<td><a href="<c:url value='/edit/${forn.VW_BodyRentalVendor_Id}' />">Edit</a></td>
					<td><a href="<c:url value='/remove/${forn.VW_BodyRentalVendor_Id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>