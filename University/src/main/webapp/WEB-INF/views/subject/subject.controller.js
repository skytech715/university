'use strict';

(function(){
angular.module('mainApp')
.controller('SubjectController', SubjectController);

SubjectController.$inject = ['$scope', '$state', '$window', 'subjectService', 'paginateService', 'tableSortingService', 'swalService'];

function SubjectController($scope, $state, $window, subjectService, paginateService, tableSortingService, swalService){
  var self = this;
  self.subject = $state.params.subject;
  self.tableSearch = "";

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
      self.allSubject = self.subjectList;
    });
  }

  self.saveOrUpdateSubject = function(){
    subjectService.saveOrUpdateSubject(self.subject).then(function(response){
        getSubjectList();
        $state.go('subject');
    });
  };

  self.updateSubject = function(subject){
    $state.go('subject.modify', {subject: subject}, {reload: true, notify:true});
  };

  self.deleteSubject = function(subjectId){
    swalService.promptDeleteMessage( function(isConfirm) {
      if(isConfirm){
        subjectService.deleteSubject(subjectId).then(function(response){
            $state.reload();
        });
      }
    });
  };

  self.getSubjectBySubjectId = function(){
    subjectService.getSubjectBySubjectId(self.subject.subjectId).then(function(response){
      self.subject = response.data;
    });
  };

  self.paginateFilter = function(item){
	    return paginateService.paginate(self.subjectList, item, self.currentPage, self.numberPerPage);
  };

  self.changeSorting = function(column){
	    self.sort = tableSortingService.changeSorting(column);
	};

}
})();
