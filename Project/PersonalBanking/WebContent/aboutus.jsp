<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%try{ %>
<div id="wrapper">
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="homenavigation.jsp"></jsp:include>
	<!-- <h3><a href="#">Home</a>&gt;About Us</h3> -->

<center>


<tr>
<center>
<td style="width:25%; padding-bottom:30px"><img src="final.png" alt="final" height="170" width="280">

</tr>
</center>
<center>
<table>
<tbody>
<tr>
<td>
</td>
<td>

<td>
</td>
</tbody>
</table>

<tr>
</center>
<h2> About Us</h2>
                    <p class="txt"> Hi TECH Bank is the third largest private sector bank in India. The Bank has a large footprint of 2402 domestic branches (including extension counters) and 12,922 ATMs spread across the country as on 31st March 2014. HI TECH Bank is one of the first new generation private sector banks to have begun operations in 1994. The Bank was promoted in 1993, jointly by Specified Undertaking of Unit Trust of India (SUUTI) (then known as Unit Trust of India),Life Insurance Corporation of India (LIC),General Insurance Corporation of India (GIC), National Insurance Company Ltd., The New India Assurance Company Ltd., The Oriental Insurance Company Ltd. and United India Insurance Company Ltd. The shareholding of Unit Trust of India was subsequently transferred to SUUTI, an entity established in 2003. With a balance sheet size of Rs.3,83,245 crores as on 31st March 2014, HI TECH Bank has achieved consistent growth and stable asset quality with a 5 year CAGR (2010-14) of 21% in Total Assets, 19% in Total Deposits, 23% in Total Advances and 28% in Net Profit.</p>
                    <div class="tel"> Contact Us for more deatils.</div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>
<%}
catch(Exception e) {
	%><jsp:include page="siteerror.jsp"></jsp:include> <%
}%>
</body>
</html>