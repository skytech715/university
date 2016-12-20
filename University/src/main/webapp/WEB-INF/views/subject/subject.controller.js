'use strict';

(function(){
angular.module('mainApp')
.controller('SubjectController', SubjectController);

SubjectController.$inject = ['$scope', '$state', '$window', 'subjectService', 'paginateService'];

function SubjectController($scope, $state, $window, subjectService, paginateService){
  var self = this;
  self.subject = $state.params.subject;
 
  init();

  function init(){
      getSubjectList();
      pagination();
  }

  function pagination(){
	    self.currentPage = 1;
	    self.numberPerPage = 5;
  }

  function getSubjectList(){
    subjectService.getSubjectList().then(function(response){
      self.subjectList = response.data;
  
    });
  }

  self.saveOrUpdateSubject = function(){
    subjectService.saveOrUpdateSubject(self.subject).then(function(response){
        getSubjectList();
        $state.go('subject');
    });
  };

  self.updateSubject = function(subject){
    $state.go('subject.modify', {subject: subject}, {relad: true, notify:true});
  };

  self.deleteSubject = function(subjectId){
    subjectService.deleteSubject(subjectId).then(function(response){
        $state.reload();
    });
  };

  self.getSubjectBySubjectId = function(){
    subjectService.getSubjectBySubjectId(self.subject.subjectId).then(function(response){
      self.subject = response.data;
    });
  };
  
  self.paginateFilter = function(item){
	    return paginateService.paginate(self.subjectList, item, self.currentPage, self.numberPerPage);
	  }

}
})();
