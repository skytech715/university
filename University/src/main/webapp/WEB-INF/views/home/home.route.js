var routerApp = angular.module('mainApp', ['ui.router']);

routerApp.config(function($stateProvider, $urlRouterProvider) {
    
    $urlRouterProvider.otherwise('/home');
    
    $stateProvider
        
        
        .state('home', {
            url: '/home',
            views:
			{
            	'header': { templateUrl: 'header.html' },
            	'footer': { templateUrl: 'footer.html' },
				'content' : 
				{ 
					templateUrl: 'views/home/home.html',
				}
			},
        })
        
        
});

