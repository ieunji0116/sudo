<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Navigation Menu</title>


<style type="text/css">

body {
    margin-left: 180px; /* 왼쪽 사이드바 공간 확보 */
    font-family: 'Arial', sans-serif;
    background-color: #223D38 ;
}

/* 왼쪽 사이드바 */
nav.side {
	font-weight: bold;
    width: 180px;
    height: 100vh;
    position: fixed;
    top: 0;
    left: 0;
    background-color: #217770 ; /* 기본 색상 */
    display: flex;
    flex-direction: column;	
    justify-content: space-between;
    padding-top: 20px;
}

nav.side ul {
    list-style: none;
    padding: 0;
    margin: 0;
    width: 100%;
}

nav.side ul li {
    width: 100%;
}

nav.side ul li a {
    display: block;
    color: white;
    text-decoration: none;
    padding: 15px;
    transition: background-color 0.3s ease;
    font-size: 16px;
    text-align: left;
}

nav.side ul li a:hover {
    background-color: #223D38 ; /* 호버 시 색상 */
    border-radius: 10%;
}

nav.side ul li a i {
    margin-right: 10px; /* 아이콘과 텍스트 간격 */
}


/* 메인 콘텐츠 */
.main-content {
    padding: 20px;
    margin-left: 200px; /* 사이드바 공간만큼 확보 */											
}

</style>





<!-- Font Awesome for icons -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

</head>
<body>

<!-- 왼쪽 사이드바 -->																									
<nav class="side">
    <ul>
        <li><a href="erpmain.do"><i class="fas fa-home"></i>ModuERP</a></li>
        <li><a href="nlist.do"><i class="fas fa-bullhorn"></i>인사 관리</a></li>
        <li><a href="blist.do"><i class="fas fa-clipboard"></i>생산 관리</a></li>
        <li><a href="moveAjax.do"><i class="fas fa-code"></i>구매 관리</a></li>
        <li><a href="moveApi.do"><i class="fas fa-plug"></i>영업/판매 관리</a></li>
        <li><a href="moveApi.do"><i class="fas fa-plug"></i>회계 관리</a></li>
        <li><a href="moveApi.do"><i class="fas fa-plug"></i>차량 관리</a></li>
        <li><a href="moveApi.do"><i class="fas fa-plug"></i>그룹 웨어</a></li>
        <li><a href="main.do"><i class="fas fa-home"></i>Homepage</a></li>
		<li><a href="logout.do"><i class="fas fa-sign-out-alt"></i>로그아웃</a></li>
    </ul>

</nav>



</body>
</html>
