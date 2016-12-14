<html  ng-app="mainApp">
	
	<jsp:include page="src-file.jsp" />

   <body class="pace-done">

         <jsp:include page="header.jsp" />
         
         <div ui-view="content"></div>
         
         <jsp:include page="footer.jsp" />
         
	      <h2>Hello World!</h2>
	      <!-- comment -->
	      <a href="course/form">HERE</a>
	      <input type="submit" value="New Button">
	      
   </body>
</html>