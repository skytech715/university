'use strict';

(function(){
angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$stateProvider.state('subject', {
		url: '/subject',
		templateUrl: 'views/subject/subject-view.html',
		controller: 'SubjectController',
		controllerAs: 'subjectController',
		data: {
			pageTitle: 'Subject'
	  }
	}).state
	('subject-modify',{
		url:'/subject-modify',
		templateUrl:'views/subject/subject-modify.html',
		controller: 'SubjectController',
		controllerAs: 'subjectController',
		data: {
			pageTitle:'Subject'
		},
		params:{
			subject: null
		},
		parent: 'subject'
	});

}]);
})();
