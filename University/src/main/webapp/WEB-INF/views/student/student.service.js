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

  svc.saveStudent = function(student, courseId){
	  return $http({
		  method : 'POST',
		  url : 'student/saveStudent/' + courseId,
      data : student
	  });
  };

  svc.updateStudent = function(student, courseId){
    return $http({
		  method : 'POST',
		  url : 'student/updateStudent/' + courseId,
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
