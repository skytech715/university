'use strict';

(function(){
angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$stateProvider.state('course', {
		url: '/course',
		templateUrl: 'views/course/course-form.html',
		controller: 'CourseController',
		controllerAs: 'courseController',
		data: {
			pageTitle: 'Course'
	  }
	}).state
	('course-modify',{
		url:'/course-modify',
		templateUrl:'views/course/course-modify.html',
		controller:'CourseController',
		controllerAs:'courseController',
		data: {
			pageTitle:'course.modify'
		}
	});
}]);
})();
