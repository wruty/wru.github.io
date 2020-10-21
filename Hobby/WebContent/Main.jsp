<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    int intKen = (int)request.getAttribute("KEN");
    int intGen = (int)request.getAttribute("GEN");
    int intDem = (int)request.getAttribute("DEM");
    int intKai = (int)request.getAttribute("KAI");
    int intSake = (int)request.getAttribute("SAKE");
    int intJin = (int)request.getAttribute("JIN");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>白虎　集計　結果</title>
</head>
<body>
元金抜き現金総額　<%out.print(intKen - intKai); %><br>
税込み売上　<%out.print(intKen + intGen); %><br>
人件費率　<%out.print(intJin / (intKen + intGen + intDem) * 100); %><br>
総売上　<%out.print(intKen + intGen + intDem);%><br>
総経費　<%out.print(intJin + intSake + intKai + 35000); %><br>
総経費率　<%out.print((intJin + intSake + intKai + 35000) / (intKen + intGen + intDem) * 100); %><br>
本日の利益　<%out.print((intJin + intSake + intKai + 35000) - (intKen + intGen + intDem)); %><br>
</body>
</html>