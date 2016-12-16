 <head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Import Angular Library Java Script Files -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.0/angular.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.0/angular-route.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.0/angular-resource.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.0/angular-cookies.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.3.2/angular-ui-router.js"></script>
  	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>

  	<!-- CSS Style Sheet -->
  	<link rel="stylesheet" href="resource/css/bootstrap.css">
    <link rel="stylesheet" href="resource/css/font-awesome.css">
  	<link rel="stylesheet" href="resource/css/style.css">
  	<link rel="stylesheet" href="resource/css/color-theme.css">
    <link rel="stylesheet" href="resource/css/component.css">

    <!-- Import Java Script Files-->
    <script src="views/mainApp.js"></script>
    <script src="views/back-to-top.directive.js"></script>
    <script src="views/home/home.route.js"></script>
    <script src="views/course/course.route.js"></script>
   	<script src="views/course/course.service.js"></script>
	  <script src="views/course/course.controller.js"></script>
    <script src="views/subject/subject.route.js"></script>
    <script src="views/subject/subject.service.js"></script>
    <script src="views/subject/subject.controller.js"></script>
    <script src="views/student/student.route.js"></script>
    <script src="views/student/student.service.js"></script>
    <script src="views/student/student.controller.js"></script>


<style>
.back-to-top {
    position: fixed;
    right: 0px;
    bottom: 60px;
    -webkit-box-shadow: -1px 0px 10px 0px rgba(50, 50, 50, 0.27);
    -moz-box-shadow: -1px 0px 10px 0px rgba(50, 50, 50, 0.27);
    box-shadow: -1px 0px 10px 0px rgba(50, 50, 50, 0.27);
    margin-top: 8px;
    background: #8a9eac;
    color: #fff;
    display: block;
    opacity: 0;
    padding: 10px;
    font-size: 10px;
    text-decoration: none;
    text-transform: uppercase
}

.back-to-top i {
    font-size: 18px
}

.back-to-top.fadein {
    opacity: 1
}
</style>

   	<title>University | {{title}}</title>
</head>
