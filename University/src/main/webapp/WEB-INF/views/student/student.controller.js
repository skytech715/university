'use strict';

(function(){
angular.module('mainApp')
.controller('StudentController', StudentController);

StudentController.$inject = ['$scope', '$state', '$window', 'studentService'];

function StudentController($scope, $state, $window, studentService){
  var self = this;
  self.student = {};

  init();

  function init(){
      getStudentList();
  }

  function getStudentList(){
    studentService.getStudentList().then(function(response){
      self.studentList = response.data;
    });
  }

  self.saveStudent = function(){
    studentService.saveStudent(self.student, self.courseId).then(function(response){
        $state.go('home');
    });
  };

  self.updateStudent = function(){
    studentService.updateStudent(self.student, self.courseId).then(function(response){
        $state.go('home');
    });
  };

  self.deleteStudent = function(){
    studentService.deleteStudent(self.student.studentId).then(function(response){
        $state.go('home');
    });
  };

  self.getStudentByStudentId = function(){
    studentService.getStudentByStudentId(self.student.studentId).then(function(response){
      self.student = response.data;
    });
  };

}
})();
