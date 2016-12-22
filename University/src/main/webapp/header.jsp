<!-- Main Navigation Bar -->
<div class="navbar navbar-inverse">
   <div class="navbar-header">
      <a class="navbar-brand" ui-sref="home"><img src="resource/images/logo_light.png" alt=""></a>
      <ul class="nav navbar-nav pull-right visible-xs-block">
         <li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
      </ul>
   </div>
   <div class="navbar-collapse collapse" id="navbar-mobile">
      <ul class="nav navbar-nav navbar-right">
         <li class="dropdown language-switch">
            <a class="dropdown-toggle" data-toggle="dropdown">
            <!-- <img src="assets/images/flags/gb.png" class="position-left" alt=""> -->
            English
            <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
               <li><a class="english">
              <!--  <img src="assets/images/flags/gb.png" alt="">-->
                English</a></li>
            </ul>
         </li>
         <li class="dropdown dropdown-user">
            <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
            <img src="resource/images/user.jpg" alt="">
            <span>Victoria</span>
            <i class="caret"></i>
            </a>
            <ul class="dropdown-menu dropdown-menu-right">
               <li><a href="#"><i class="icon-user-plus"></i> My profile</a></li>
               <li><a href="#"><i class="icon-coins"></i> My balance</a></li>
               <li><a href="#"><span class="badge badge-warning pull-right">58</span> <i class="icon-comment-discussion"></i> Messages</a></li>
               <li class="divider"></li>
               <li><a href="#"><i class="icon-cog5"></i> Account settings</a></li>
               <li><a href="#"><i class="icon-switch2"></i> Logout</a></li>
            </ul>
         </li>
      </ul>
   </div>
</div>
<!-- Navigation Bar -->
<div class="navbar navbar-default" id="navbar-second">
		<ul class="nav navbar-nav no-border visible-xs-block">
			<li><a class="text-center collapsed" data-toggle="collapse" data-target="#navbar-second-toggle"><i class="icon-menu7"></i></a></li>
		</ul>

		<div class="navbar-collapse collapse" id="navbar-second-toggle">
			<ul class="nav navbar-nav">
				<li><a href="#"><i class="fa fa-dashboard position-left"></i>Home</a></li>
				<li><a ui-sref="course"><i class="fa fa-book position-left"></i>Course</a></li>
				<li><a ui-sref="student"><i class="fa fa-graduation-cap position-left"></i>Student</a></li>
				<li><a ui-sref="subject"><i class="fa fa-tasks position-left"></i>Subject</a></li>
			</ul>
		</div>
	</div>
