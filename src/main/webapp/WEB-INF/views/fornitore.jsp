<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html >
<html lang="it">
<head>
<title>fornitori</title>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>
</head>
<body>
	<h1>Portale Fornitoore</h1>

	<c:url var="addAction" value="/fornitore/add"></c:url>

	<form:form action="${addAction}" commandName="fornitore">
		<table>
			<c:if test="${!empty fornitore.name}">
				<tr>
					<td><form:label path="VW_BodyRentalVendor_Id">
							<spring:message text="ID" />
						</form:label></td>
					<td><form:input path="VW_BodyRentalVendor_Id" readonly="true"
							disabled="true" /> <form:hidden path="VW_BodyRentalVendor_Id" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="company">
						<spring:message text="company" />
					</form:label></td>
				<td><form:input path="company" /></td>
			</tr>
			<tr>
				<td><form:label path="companyNameNo">
						<spring:message text="companyNameNo" />
					</form:label></td>
				<td><form:input path="companyNameNo" /></td>
			</tr>
			<tr>
				<td><form:label path="name">
						<spring:message text="name" />
					</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="name2">
						<spring:message text="name2" />
					</form:label></td>
				<td><form:input path="name2" /></td>
			</tr>
			<tr>
				<td><form:label path="address">
						<spring:message text="address" />
					</form:label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="address2">
						<spring:message text="address2" />
					</form:label></td>
				<td><form:input path="address2" /></td>
			</tr>
			<tr>
				<td><form:label path="city">
						<spring:message text="city" />
					</form:label></td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td><form:label path="postCode">
						<spring:message text="postCode" />
					</form:label></td>
				<td><form:input path="postCode" /></td>
			</tr>
			<tr>
				<td><form:label path="countryRegionCode">
						<spring:message text="countryRegionCode" />
					</form:label></td>
				<td><form:input path="countryRegionCode" /></td>
			</tr>
			<tr>
				<td><form:label path="email">
						<spring:message text="email" />
					</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="phoneNumber">
						<spring:message text="phoneNumber" />
					</form:label></td>
				<td><form:input path="phoneNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="faxNumber">
						<spring:message text="faxNumber" />
					</form:label></td>
				<td><form:input path="faxNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="vatNumber">
						<spring:message text="vatNumber" />
					</form:label></td>
				<td><form:input path="vatNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="blockedQualification">
						<spring:message text="blockedQualification" />
					</form:label></td>
				<td><form:input path="blockedQualification" /></td>
			</tr>
			<tr>
				<td><form:label path="qualificationNotes">
						<spring:message text="qualificationNotes" />
					</form:label></td>
				<td><form:input path="qualificationNotes" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<c:if test="${!empty fornitore.name}">
				 <input type="submit" value="<spring:message text="Edit Fornitore"/>" />
				</c:if> 
					
					<c:if test="${empty fornitore.name}">
						<input type="submit" value="<spring:message text="Add Fornitore"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>

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
