'use strict';

(function(){
angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$stateProvider.state('student', {
		url: '/student',
		template: '<div ui-view></div>',
		controller: 'StudentController',
		controllerAs: 'studentController',
		data: {
			pageTitle: 'Student'
	  },
		redirectTo: 'student.view'
	}).state('student.view', {
		url: '',
		templateUrl: 'views/student/student-view.html',
		data: {
			pageTitle: 'Student'
		},
		parent:'student'
	}).state('student.modify', {
		url: '/form',
		templateUrl: 'views/student/student-modify.html',
		data: {
			pageTitle: 'Student'
		},
		params:{
			student: null
		},
		parent: 'student'
	});

}]);
})();
