<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="head.jsp" />
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2"><jsp:include page="header.jsp" /></td>
		</tr>
		<tr>
			<td colspan="2">
			<c:choose>
				<c:when test="${compo eq 'pre'}">
					<jsp:include page="pre-navi-bar.jsp"/>
				</c:when>
				<c:when test="${compo eq 'post'} ">
					<jsp:include page="post-navi-bar.jsp"/>
				</c:when>
			</c:choose>
			</td>
		</tr>
		<tr style="height: 300px; width: 300px;">
			<td style="width: 25%"><jsp:include page="side-menu.jsp" /></td>
			<td>
				<div id="content">
					<c:choose>
						<c:when test="${compo eq 'pre'} ">
							<jsp:include page="../employee/register.jsp"/>
						</c:when>
							<c:when test="${compo eq 'post'} ">
							<jsp:include page="../employee/access.jsp"/>
						</c:when>
					</c:choose>
				</div>
			</td>
		</tr>
		<tr style="width: 100px">
			<td colspan="2"><jsp:include page="footer.jsp" /></td>
		</tr>

	</table>

</body>
</html>