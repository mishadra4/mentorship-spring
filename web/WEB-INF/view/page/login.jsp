<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yoga
  Date: 01.12.2018
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<form name="form" action="j_spring_security_check" method="post" class="form-signin">
    <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_SUPER_USER', 'ROLE_USER')" var="isUSer"/>
    <span size="2" color="red">
        <c:if test="${not isUSer}">
            <c:if test="${empty param.error}">
                You are not signed in
            </c:if>
        </c:if>
    </span>
    <br/>
    <span size="2" color="green">
        <c:if test="${isUSer}">You signed in as:
            <security:authentication property="principal.username"/>,
            <b><security:authentication property="principal.authorities"/></b>
        </c:if>
    </span>
    <br/>
    <c:if test="${not empty param.error}">
        <font size="2" color="red"><b>Wrong username or password</b></font>
    </c:if>

    <h2 class="form-signin-heading">Please sign in</h2>

    <label for="inputEmail" class="sr-only"><spring:message code="email" text="Email"/></label>
    <input id="inputEmail" class="form-control" name="j_username" required autofocus/>

    <label for="inputPassword" class="sr-only"><spring:message code="pass" text="Password"/></label>
    <input type="password" id="inputPassword" class="form-control" name="j_password" required/>

    <div class="checkbox">
        <label>
            <input type="checkbox" id="rememberme" name="_spring_security_remember_me"/>Remember me
        </label>
    </div>
    <input type="submit" value="Sign in" class="btn btn-lg btn-primary btn-block">
    <br/>
    <a href="javascript:history.back()">Back</a>
</form>
</body>
</html>
