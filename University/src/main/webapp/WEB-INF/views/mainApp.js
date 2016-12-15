'use strict';

(function(){
var mainApp = angular.module('mainApp', ['ui.router', 'ngResource', 'ngCookies']);

mainApp.config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$urlRouterProvider.otherwise('/home');
	$locationProvider.hashPrefix('!');

}]);

mainApp.run(function($rootScope, $state){
	
	$rootScope.$on("$stateChangeSuccess", function(currentState, previousState){
		$rootScope.title = $state.current.data.pageTitle;
	});;
});
})();
