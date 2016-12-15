'use strict';

(function(){
angular.module('mainApp')
.controller('SubjectController', SubjectController);

SubjectController.$inject = ['$scope', '$state', '$window', 'subjectService'];

function SubjectController($scope, $state, $window, subjectService){
  var self = this;
  self.subject = {};

  init();

  function init(){
      getSubjectList();
  }

  function getSubjectList(){
    subjectService.getSubjectList().then(function(response){
      self.subjectList = response.data;
    });
  }

  self.saveSubject = function(){
    subjectService.saveSubject(self.subject).then(function(response){
        $state.go('home');
    });
  };

  self.updateSubject = function(){
    subjectService.updateSubject(self.subject).then(function(response){
        $state.go('home');
    });
  };

  self.deleteSubject = function(){
    subjectService.deleteSubject(self.subject.subjectId).then(function(response){
        $state.go('home');
    });
  };

  self.getSubjectBySubjectId = function(){
    subjectService.getSubjectBySubjectId(self.subject.subjectId).then(function(response){
      self.subject = response.data;
    });
  };

}
})();
