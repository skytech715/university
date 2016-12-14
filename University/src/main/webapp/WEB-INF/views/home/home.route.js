angular.module('mainApp').config(function($stateProvider, $urlRouterProvider, $locationProvider) { 
	
	$stateProvider.state('home', {
		url: '/home',
		views:
		{
			/*'header': { templateUrl: 'header.html' },
			'footer': { templateUrl: 'footer.html' },*/
			'content' : 
			{ 
				templateUrl: 'views/home/home.html',
			}
		},
	})
});

