<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:importAttribute name="javascripts"/>
<tiles:importAttribute name="stylesheets"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
    <!-- stylesheets -->
    <c:forEach var="css" items="${stylesheets}">
        <link rel="stylesheet" type="text/css" href="<c:url value="${css}"/>">
    </c:forEach>
    <!-- end stylesheets -->
</head>
<body>
    <!-- header -->
    <div id="header">
        <tiles:insertAttribute name="header"></tiles:insertAttribute>
    </div>
    <!-- end header  -->

    <!-- content -->
    <div id="content">
        <tiles:insertAttribute name="content"></tiles:insertAttribute>
    </div>
    <!-- end content -->

    <!-- footer -->
    <div id="footer">
        <tiles:insertAttribute name="footer"></tiles:insertAttribute>
    </div>
    <!-- end footer -->

    <!-- scripts -->
    <c:forEach var="script" items="${javascripts}">
        <script src="<c:url value="${script}"/>"></script>
    </c:forEach>
    <!-- end scripts -->
</body>
</html>