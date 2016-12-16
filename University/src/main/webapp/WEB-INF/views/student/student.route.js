'use strict';

(function(){
angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$stateProvider.state('student', {
		url: '/student',
		templateUrl: 'views/student/student-form.html',
		controller: 'StudentController',
		controllerAs: 'studentController',
		data: {
			pageTitle: 'Student'
	  }
	});

}]);
})();
