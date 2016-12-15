'use strict';

(function(){
angular.module('mainApp').config(['$stateProvider', '$urlRouterProvider','$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

	$stateProvider.state('subject', {
		url: '/subject',
		templateUrl: 'views/subject/subject-form.html',
		controller: 'SubjectController',
		controllerAs: 'subjectController',
		data: {
			pageTitle: 'Subject'
	  }
	});

}]);
})();
