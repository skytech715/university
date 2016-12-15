'use strict';

(function(){
angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$stateProvider.state('home', {
		url: '/home',
		templateUrl: 'views/home/home.html',
		data: {
			pageTitle: 'Home'
	  }
	});

}]);
})();
