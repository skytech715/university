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
				<li><a href="#"><i class="fa fa-dashboard position-left"></i> Dashboard</a></li>

				<li class="dropdown">
					<a ui-sref="course" class="dropdown-toggle" data-toggle="dropdown">
						<i class="fa fa-book position-left"></i> Course <span class="caret"></span>
					</a>

					<ul class="dropdown-menu width-250">
						<li class="dropdown-header">Apps</li>
						<li class="dropdown-submenu">
							<a href="#"><i class="icon-task"></i> Task manager</a>
							<ul class="dropdown-menu width-200">
								<li class="dropdown-header highlight">Options</li>
								<li><a href="task_manager_grid.html">Task grid</a></li>
								<li><a href="task_manager_list.html">Task list</a></li>
								<li><a href="task_manager_detailed.html">Task detailed</a></li>
							</ul>
						</li>
						<li class="dropdown-submenu">
							<a href="#"><i class="icon-cash3"></i> Invoicing</a>
							<ul class="dropdown-menu width-200">
								<li class="dropdown-header highlight">Options</li>
								<li><a href="invoice_template.html">Invoice template</a></li>
								<li><a href="invoice_grid.html">Invoice grid</a></li>
								<li><a href="invoice_archive.html">Invoice archive</a></li>
							</ul>
						</li>
						<li class="dropdown-header">User</li>
						<li class="dropdown-submenu">
							<a href="#"><i class="icon-people"></i> User pages</a>
							<ul class="dropdown-menu width-200">
								<li class="dropdown-header highlight">Basic</li>
								<li><a href="user_pages_cards.html">User cards</a></li>
								<li><a href="user_pages_list.html">User list</a></li>
								<li class="dropdown-header highlight">Profiles</li>
								<li><a href="user_pages_profile.html">Simple profile</a></li>
								<li><a href="user_pages_profile_cover.html">Profile with cover</a></li>
							</ul>
						</li>
						<li class="dropdown-submenu">
							<a href="#"><i class="icon-user-plus"></i> Login &amp; registration</a>
							<ul class="dropdown-menu width-200">
								<li class="dropdown-header highlight">Basic</li>
								<li><a href="login_simple.html">Simple login</a></li>
								<li><a href="login_advanced.html">More login info</a></li>
								<li><a href="login_registration.html">Simple registration</a></li>
								<li><a href="login_registration_advanced.html">More registration info</a></li>
								<li><a href="login_validation.html">With validation</a></li>
								<li><a href="login_tabbed.html">Tabbed form</a></li>
								<li><a href="login_modals.html">Inside modals</a></li>
								<li class="dropdown-header highlight">Service</li>
								<li><a href="login_unlock.html">Unlock user</a></li>
								<li><a href="login_password_recover.html">Reset password</a></li>
								<li class="dropdown-header highlight">Other</li>
								<li><a href="login_hide_navbar.html">Hide navbar</a></li>
								<li><a href="login_transparent.html">Transparent box</a></li>
								<li><a href="login_background.html">Background option</a></li>
							</ul>
						</li>
						<li class="dropdown-header">Kits</li>
						<li class="dropdown-submenu">
							<a href="#"><i class="icon-search4"></i> Search</a>
							<ul class="dropdown-menu width-200">
								<li class="dropdown-header highlight">Basic</li>
								<li><a href="search_basic.html">Basic search results</a></li>
								<li><a href="search_users.html">User search results</a></li>
								<li class="dropdown-header highlight">Media</li>
								<li><a href="search_images.html">Image search results</a></li>
								<li><a href="search_videos.html">Video search results</a></li>
							</ul>
						</li>
						<li class="dropdown-submenu">
							<a href="#"><i class="icon-images2"></i> Gallery</a>
							<ul class="dropdown-menu width-200">
								<li class="dropdown-header highlight">Options</li>
								<li><a href="gallery_grid.html">Media grid</a></li>
								<li><a href="gallery_titles.html">Media with titles</a></li>
								<li><a href="gallery_description.html">Media with description</a></li>
								<li><a href="gallery_library.html">Media library</a></li>
							</ul>
						</li>
						<li class="dropdown-header">Tools</li>
						<li class="dropdown-submenu">
							<a href="#"><i class="icon-lifebuoy"></i> Support</a>
							<ul class="dropdown-menu width-200">
								<li class="dropdown-header highlight">Chats</li>
								<li><a href="support_conversation_layouts.html">Conversation layouts</a></li>
								<li><a href="support_conversation_options.html">Conversation options</a></li>
								<li class="dropdown-header highlight">Knowledgebase</li>
								<li><a href="support_knowledgebase.html">Knowledgebase</a></li>
								<li><a href="support_faq.html">FAQ page</a></li>
							</ul>
						</li>
						<li class="dropdown-submenu">
							<a href="#"><i class="icon-warning"></i> Error pages</a>
							<ul class="dropdown-menu width-200">
								<li class="dropdown-header highlight">Options</li>
								<li><a href="error_403.html">Error 403</a></li>
								<li><a href="error_404.html">Error 404</a></li>
								<li><a href="error_405.html">Error 405</a></li>
								<li><a href="error_500.html">Error 500</a></li>
								<li><a href="error_503.html">Error 503</a></li>
								<li><a href="error_offline.html">Offline page</a></li>
							</ul>
						</li>
					</ul>
				</li>

				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
						<i class="icon-strategy position-left"></i> Starter kit <span class="caret"></span>
					</a>

					<ul class="dropdown-menu width-200">
						<li class="dropdown-header">Basic layouts</li>
						<li class="dropdown-submenu">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-grid2"></i> Columns</a>
							<ul class="dropdown-menu">
								<li class="dropdown-header highlight">Options</li>
								<li><a href="starters/1_col.html">One column</a></li>
								<li><a href="starters/2_col.html">Two columns</a></li>
								<li class="dropdown-submenu">
									<a href="#">Three columns</a>
									<ul class="dropdown-menu">
										<li class="dropdown-header highlight">Sidebar position</li>
										<li><a href="starters/3_col_dual.html">Dual sidebars</a></li>
										<li><a href="starters/3_col_double.html">Double sidebars</a></li>
									</ul>
								</li>
								<li><a href="starters/4_col.html">Four columns</a></li>
							</ul>
						</li>
						<li class="dropdown-submenu">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-paragraph-justify3"></i> Navbars</a>
							<ul class="dropdown-menu">
								<li class="dropdown-header highlight">Fixed navbars</li>
								<li><a href="starters/layout_navbar_fixed_main.html">Fixed main navbar</a></li>
								<li><a href="starters/layout_navbar_fixed_secondary.html">Fixed secondary navbar</a></li>
								<li><a href="starters/layout_navbar_fixed_both.html">Both navbars fixed</a></li>
							</ul>
						</li>
						<li class="dropdown-header">Optional layouts</li>
						<li><a href="starters/layout_boxed.html"><i class="icon-align-center-horizontal"></i> Fixed width</a></li>
						<li><a href="starters/layout_sidebar_sticky.html"><i class="icon-flip-vertical3"></i> Sticky sidebar</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
