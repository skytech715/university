'use strict';

(function(){
angular.module('mainApp')
.factory('subjectService', subjectService);

subjectService.$inject = ['$log', '$http'];

function subjectService($log, $http){
  var svc = {};

  svc.getSubjectList = function(){
    return $http({
      method : 'GET',
      url : 'subject/listSubject'
    });
  };

  svc.getSubjectBySubjectId = function(subjectId){
  	return $http({
  	  method : 'GET',
  	  url : 'subject/loadSubject/' + subjectId
  	});
  };

  svc.saveSubject = function(subject){
	  return $http({
		  method : 'POST',
		  url : 'subject/saveOrUpdateSubject',
      data : subject
	  });
  };

  svc.deleteSubject = function(subjectId){
    return $http({
		  method : 'DELETE',
		  url : 'subject/deleteSubject/' + subjectId
	  });
  };

  return svc;

}
})();
