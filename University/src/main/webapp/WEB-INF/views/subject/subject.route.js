'use strict';

(function(){
angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$stateProvider.state('subject', {
		url: '/subject',
		template: '<div ui-view></div>',
		controller: 'SubjectController',
		controllerAs: 'subjectController',
		data: {
			pageTitle: 'Subject'
	  },
		redirectTo: 'subject.view'
	}).state('subject.view',{
		url:'',
		templateUrl:'views/subject/subject-view.html',
		data: {
			pageTitle:'Subject'
		},
		parent: 'subject'
	}).state('subject.modify', {
		url: '/form',
		templateUrl: 'views/subject/subject-modify.html',
		data: {
			pageTitle: 'Subject'
		},
		params:{
			subject: null
		},
		parent: 'subject'
	});

}]);
})();
