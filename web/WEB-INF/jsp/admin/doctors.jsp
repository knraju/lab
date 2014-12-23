<%-- 
    Document   : doctors
    Created on : 8 Apr, 2014, 8:14:07 PM
    Author     : Chari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css" >
            table{
                border-collapse: collapse;
            }
            th,td{
                font-size:1em;
                border:1px solid #98bf21;
                padding:3px 7px 2px 7px;
            }
            th 
            {
            font-size:1.1em;
            text-align:left;
            padding-top:5px;
            padding-bottom:4px;
            background-color:#A7C942;
            color:#ffffff;
            }
            table tr.alt td 
            {
            color:#000000;
            background-color:#EAF2D3;
            }
            .wrapper{
                width: 960px;
                margin:auto;
            }

        </style>
    </head>
    <body>
        <div class="wrapper">
            <jsp:include page="../menu1.jsp"/>
            <div class="clsForm" style="margin: 15px auto;padding-top: 40px">
                <form:form action="addDoctor.htm" modelAttribute="doctor">
                    <label for="doctorName">DoctorName:</label>
                    <form:input path="doctorName" />
                    <label for="designation">Designation:</label>
                    <form:input path="designation"/>
                    <label for="phoneno">PhoneNo:</label>
                    <form:input path="phoneno"/>
                    <label for="hospitalname" >HospitalName:</label>
                    <form:input path="hospitalname" />
                    <label for="hospitalPhoneno" >HospitalNo:</label>
                    <form:input path="hospitalPhoneno"/>
                    <input type="submit" value="Save"/>
                </form:form>
            </div>

            <div >
                <table >
                    <tr>
                        <th>Doctor Name</th>
                        <th>Address</th>
                        <th>Contact No</th>
                    </tr>
                    <c:forEach var="doctor" items="${doctorsList}">
                        <tr>
                            <td>${doctor.name} ${doctor.designation}</td>
                            <td>${doctor.hospitalname}</td>
                            <td>${doctor.phoneno}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
