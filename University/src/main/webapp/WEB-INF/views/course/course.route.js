'use strict';

(function(){
angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$stateProvider.state('course', {
		url: '/course',
		template: '<div ui-view></div>',
		controller: 'CourseController',
		controllerAs: 'courseController',
		data: {
			pageTitle: 'Course'
	  },
		redirectTo: 'course.view'
	}).state('course.view', {
		url: '',
		templateUrl: 'views/course/course-view.html',
		data: {
			pageTitle: 'Course'
		}
	}).state('course.modify', {
		url: '/modify',
		templateUrl: 'views/course/course-modify.html',
		data: {
			pageTitle: 'Course'
		},
		params:{
			course: null
		},
		parent: 'course'
	});
}]);
})();
