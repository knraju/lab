<%-- 
    Document   : menu1
    Created on : 25 Mar, 2014, 10:45:36 PM
    Author     : Chari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/menu.css" type="text/css" media="screen, projection"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.3.1.min.js"></script>	
	<script type="text/javascript" language="javascript" src="${pageContext.request.contextPath}/resources/js/jquery.dropdownPlain.js"></script>
	
	<style>
	ul.dropdown .mainlist{
		width:20%;
	}
	</style>
    </head>
    <body>
        <div id="page-wrap">

            <h3>Swathi X-Ray</h3>
            <ul class="dropdown">
                <li class="mainlist"><a href="#">Patient</a>
                    <ul class="sub_menu">
                        <li><a href="#">Add Patient</a></li>
                        <li><a href="#">Search Patient</a></li>

                    </ul>
                </li>
                <li class="mainlist"><a href="doctor.htm">Doctor</a>
                    <ul class="sub_menu">
                        <li><a href="#">Add Doctor</a></li>
                        <li><a href="#">Search Doctor</a></li>
                        <li><a href="#">Field Drags</a></li>
                        <li><a href="#">Hand Tools</a></li>
                    </ul>
                </li>
                <li class="mainlist"><a href="#">Billing</a>
                    <ul class="sub_menu">
                        <li><a href="#">Billing1</a></li>
                        <li><a href="#">Billing2</a></li>
                        <li><a href="#">Billing3</a></li>
                    </ul>
                </li>
                <li class="mainlist"><a href="#">Result</a>
                    <ul class="sub_menu">
                        <li><a href="#">result1</a></li>
                        <li><a href="#">result2</a></li>

                    </ul>
                </li>
                <li class="mainlist"><a href="#">Reports</a>
                    <ul class="sub_menu">
                        <li><a href="#">report1</a></li>
                        <li><a href="#">report2</a></li>

                    </ul>
                </li>
            </ul>

        </div>
    </body>
</html>
