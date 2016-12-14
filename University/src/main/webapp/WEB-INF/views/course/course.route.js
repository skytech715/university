angular.module('mainApp').config(function($stateProvider, $urlRouterProvider, $locationProvider) { 
	
	$stateProvider.state('course.main', {
		url: '/course',
		views:
		{
			'header': { templateUrl: 'header.html' },
			'footer': { templateUrl: 'footer.html' },
			'content' : 
			{ 
				templateUrl: 'views/course/course-form.html',
			}
		},
	})
});

