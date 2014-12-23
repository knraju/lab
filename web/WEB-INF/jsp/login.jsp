<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Swathi X-Ray</title>
        <link type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">

    </head>
    <body>
        <div id="header">
            <h1 class="maincontent">Swathi X-Ray</h1>
            <h3 class="subcontent">Diagnostic center</h3>

        </div>
        <div id="section">
            <div>
                <div id="login">
                    <h2 class="title1">Login</h2>
                    <p>${err}</p>
                    <form:form action="login.htm" method="post" commandName="loginUser">
                        <p class="errorMsg"> </p>
                        <fieldset>
                            <label for="username">Username:</label><br>
                            <form:input path="username" id="username" autocomplete="off"/><br>
                            <label for="password">Password:</label><br>
                            <form:password path="password" id="password"/><br>
                            <input type="submit" name="Login" value="Login">
                        </fieldset>
                    </form:form>
                </div>
            </div>
        </div>
   
    <div id="featured">
        <div>

            <ul>
                <li>
                    <h3>hematology</h3>
                    <div>
                        <p>
                            Blood extraction using seismic energy for painless testing.
                        </p>

                    </div>
                    <img src="<c:url value="/resources/images/hematology.jpg" />" alt="">
                </li>
                <li>
                    <h3>urine &amp; drug testing</h3>
                    <div>
                        <p>
                            Accurate and secure testing of urine for diseases and drugs and medicines.
                        </p>

                    </div>
                    <img src="<c:url value="/resources/images/urine-and-drug-testing.jpg" />" >
                </li>
                <li>
                    <h3>x-ray</h3>
                    <div>
                        <p>
                            Fast and clear x-ray results. You’ll be assisted by our friendly staff all the way.
                        </p>

                    </div>
                    <img src="<c:url value="/resources/images/x-ray.jpg" />" alt="">
                </li>
                <li>
                    <h3>pathology and dna</h3>
                    <div>
                        <p>
                            State of the art testing for DNA that’s sure to be have fast and accurate results.
                        </p>

                    </div>
                    <img src="<c:url value="/resources/images/pathology-and-dna.jpg" />" alt="">
                </li>
            </ul>
        </div>
    </div>
    <div id="footer">

    </div>
</body>
</html>