<%-- 
    Document   : menu
    Created on : 4 Mar, 2014, 3:09:12 PM
    Author     : Chari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            div#menuDemo {
                width: 100%;
                height: 30px;
                position: relative;
                left: 0;
                top: 0;
                background-color: orange;
                color: white;
                border-bottom: 1px solid black;
                /*Remove this next one in production - Used for demo purpose only*/
                margin-bottom: 300px;	
            }

            div#menuDemo ul {
                list-style: none;
                margin: 0;
                padding: 0;
                background-color: orange;
            }

            div#menuDemo > ul > li {
                float: left;
            }

            div#menuDemo ul li {
                width: 16%;
                background-color: orange;
            }

            div#menuDemo ul li#homeMenu {
                width: 16%;
                background-color: orange;
            }

            div#menuDemo ul li a {
                text-decoration: none;
            }

            div#menuDemo > ul > li > ul {
                display: none;
                background-color: orange;
                width: 16%;
            }

            div#menuDemo > ul > li:hover > ul {
                display: block;
            }                             
        </style>
        <script>
            $('div#menuDemo > ul > li').hover(function() {
                //effect when the user hovers over the menu
                //first hide the menu item, since the CSS displays it - then slide it down.
                $(this).children('ul').hide().slideDown();
            }, function() {
                //effect when the user leaves the current menu area - fade out
                $(this).children('ul').fadeOut();
            });
        </script>
    </head>
    <body>
        <div id="menuDemo">
            <ul>
                <li id="homeMenu"><a href="#">Home</a>
                </li>
                <li><a href="#">Doctor</a>
                    <ul>
                        <li><a href="#menuPagesOne">Page Number One</a></li>
                        <li><a href="#menuPagesTwo">Page Number Two</a></li>
                        <li><a href="#menuPagesThree">Page Number Three</a></li>
                    </ul>
                </li>
                <li><a href="#">Test</a>
                    <ul>
                        <li><a href="#LinkNumber1">Link Number 1</a></li>
                        <li><a href="#LinkNumber2">Link Number 2</a></li>
                        <li><a href="#LinkNumber3">Link Number 3</a></li>
                    </ul>
                </li>

                <li><a href="#">Patient</a>
                    <ul>
                        <li><a href="#LinkNumber1">Link Number 1</a></li>
                        <li><a href="#LinkNumber2">Link Number 2</a></li>
                        <li><a href="#LinkNumber3">Link Number 3</a></li>
                    </ul>
                </li>
                <li><a href="#">Billing</a>
                    <ul>
                        <li><a href="#LinkNumber1">Link Number 1</a></li>
                        <li><a href="#LinkNumber2">Link Number 2</a></li>
                        <li><a href="#LinkNumber3">Link Number 3</a></li>
                    </ul>
                </li>
                <li><a href="#">Report</a>
                    <ul>
                        <li><a href="#LinkNumber1">Link Number 1</a></li>
                        <li><a href="#LinkNumber2">Link Number 2</a></li>
                        <li><a href="#LinkNumber3">Link Number 3</a></li>
                    </ul>
                </li>
            </ul>
        </div>		
    </body>
</html>
