angular.module('mainApp', ['ui.router', 'ngResource', 'ngCookies', 'ngRoute']);
angular.module('mainApp').config(function($stateProvider, $urlRouterProvider, $locationProvider) { 
	
	$urlRouterProvider.otherwise('/home');
	$locationProvider.hashPrefix('!');
	
});