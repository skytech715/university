<html ng-app="mainApp">

	<jsp:include page="src-file.jsp" />

   <body class="pace-done">

         <jsp:include page="header.jsp" />

         <div ui-view></div>

         <jsp:include page="footer.jsp" />

         <back-to-top></back-to-top>

	      <h1>TESTING STAGE</h1>
	      <!-- comment -->
				<a ui-sref="course">Course Over HERE</a><br>
	      <a ui-sref="subject">Subject Over HERE</a><br>
				<a ui-sref="student">Student Over HERE</a>
   </body>

</html>
