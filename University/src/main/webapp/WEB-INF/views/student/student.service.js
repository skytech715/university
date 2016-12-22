'use strict';

(function(){
angular.module('mainApp')
.factory('studentService', studentService);

studentService.$inject = ['$log', '$http'];

function studentService($log, $http){
  var svc = {};

  svc.getStudentList = function(){
    return $http({
      method : 'GET',
      url : 'student/listStudent'
    });
  };

  svc.getStudentByStudentId = function(studentId){
  	return $http({
  	  method : 'GET',
  	  url : 'student/loadStudent/' + studentId
  	});
  };

  svc.saveOrUpdateStudent = function(student, courseId){
	  return $http({
		  method : 'POST',
		  url : 'student/saveOrUpdateStudent/' + courseId,
      data : student
	  });
  };

  svc.deleteStudent = function(studentId){
    return $http({
		  method : 'DELETE',
		  url : 'student/deleteStudent/' + studentId
	  });
  };

  return svc;

}
})();
