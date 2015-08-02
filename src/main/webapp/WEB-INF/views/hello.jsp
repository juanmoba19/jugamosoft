<%--
  Created by IntelliJ IDEA.
  User: juandiego
  Date: 3/06/15
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include.jsp" %>
<html>
<head><title><fmt:message key="title"/></title></head>
<body>
<h1><fmt:message key="heading"/></h1>
<p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
<h3>Products</h3>
<c:forEach items="${model.products}" var="prod">
  <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
</c:forEach>
<br>
<a href="<c:url value="priceincrease.htm"/>">Increase Prices</a>
<a href="<c:url value="login.htm"/>">Login</a>
<br>
</body>
</html>