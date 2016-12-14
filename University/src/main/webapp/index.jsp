<html ng-app="mainApp">
   <head>
      <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
      <script src="http://code.angularjs.org/1.2.13/angular.js"></script>
      <script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.8/angular-ui-router.min.js"></script>
  
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.1/angular-route.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-resource.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
      
      
      <!-- Css Class -->
      <link rel="stylesheet" href="resource/css/bootstrap.css">
       <link rel="stylesheet" href="resource/css/font-awesome.css">
       <link rel="stylesheet" href="resource/css/animate.css">
       <link rel="stylesheet" href="resource/css/color.css">
       <link rel="stylesheet" href="resource/css/et-line.css">
       <link rel="stylesheet" href="resource/css/magnific-popup.css">
       <link rel="stylesheet" href="resource/css/meanmenu.css">
       <link rel="stylesheet" href="resource/css/nivoslider.css">
        <link rel="stylesheet" href="resource/css/owl.carousel.css">
       <link rel="stylesheet" href="resource/css/responsive.css">
		<link rel="stylesheet" href="resource/css/style.css">
		
		<script src="views/main.controller.js"></script>
		<script src="views/course/course.controller.js"></script>
		<script src="views/course/course.service.js"></script>
		<script src="views/home/home.route.js"></script>
   </head>
   <body class="color_1" style="overflow-y: visible;" >
   
         <div ui-view="header"></div>
         
         <div ui-view="content"></div>
         
         <div ui-view="footer"></div>
         
      <h2>Hello World!</h2>
      <!-- comment -->
      <a href="course/form">HERE</a>
      <input type="submit" value="New Button">
   </body>
</html>