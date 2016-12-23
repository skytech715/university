'use strict';

(function(){
angular.module('mainApp')
.controller('StudentController', StudentController);

StudentController.$inject = ['$scope', '$state', '$window', 'studentService', 'courseService', 'paginateService', 'tableSortingService'];

function StudentController($scope, $state, $window, studentService, courseService, paginateService, tableSortingService){
  var self = this;
  self.student = $state.params.student;
  self.tableSearch = "";

  init();

  function init(){
      getStudentList();
      getCourseList();
      pagination();
  }

  function pagination(){
    self.currentPage = 1;
    self.numberPerPage = 5;
  }

  function getStudentList(){
    studentService.getStudentList().then(function(response){
      self.studentList = response.data;
      self.allStudent = self.studentList;
    });
  }

  function getCourseList(){
    courseService.getCourseList().then(function(response){
      self.courseList = response.data;
    });
  }

  self.saveOrUpdateStudent = function(){
    studentService.saveOrUpdateStudent(self.student, self.course.courseId).then(function(response){
      getStudentList();
      $state.go('student');
    });
  };

  self.updateStudent = function(student){
    $state.go('student.modify', {student: student}, {reload: true, notify:true});
  };

  self.deleteStudent = function(studentId){
    studentService.deleteStudent(studentId).then(function(response){
        $state.reload();
    });
  };

  self.getStudentByStudentId = function(){
    studentService.getStudentByStudentId(self.student.studentId).then(function(response){
      self.student = response.data;
    });
  };

  self.paginateFilter = function(item){
    return paginateService.paginate(self.studentList, item, self.currentPage, self.numberPerPage);
  };

  self.changeSorting = function(column){
    self.sort = tableSortingService.changeSorting(column);
  };

}
})();
