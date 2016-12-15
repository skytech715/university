'use strict';

(function(){
angular.module('mainApp')
.factory('courseService', courseService);

courseService.$inject = ['$log', '$http'];

function courseService($log, $http){
  var svc = {};

  svc.getCourseList = function(){
    return $http({
      method : 'GET',
      url : 'course/listCourse'
    });
  };

  svc.getCourseByCourseId = function(courseId){
  	return $http({
  	  method : 'GET',
  	  url : 'course/loadCourse/' + courseId
  	});
  };

  svc.saveCourse = function(course){
	  return $http({
		  method : 'POST',
		  url : 'course/saveCourse',
      data : course
	  });
  };

  svc.updateCourse = function(course){
    return $http({
		  method : 'POST',
		  url : 'course/updateCourse',
      data : course
	  });
  };

  svc.deleteCourse = function(courseId){
    return $http({
		  method : 'DELETE',
		  url : 'course/deleteCourse/' + courseId
	  });
  };
  return svc;
}
})();
