<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>공지사항</title>

<link href="/assets/css/customer/layout.css" type="text/css" rel="stylesheet" />
<style>
#visual .content-container {
  height: inherit;
  display: flex;
  align-items: center;
  background: url("/assets/images/customer/visual.png") no-repeat center;
}
</style>
</head>

<body>
  <!-- header 부분 -->
  <tiles:insertAttribute name="header" />

  <!-- --------------------------- <body> --------------------------------------- -->
  <div id="body">
    <div class="content-container clearfix">

      <!-- --------------------------- main --------------------------------------- -->
      <tiles:insertAttribute name="main" />

    </div>
  </div>

  <!-- ------------------- <footer> --------------------------------------- -->
  <tiles:insertAttribute name="footer" />


</body>

</html>
