'use strict';

(function(){
angular.module('mainApp')
.controller('CourseController', CourseController);

CourseController.$inject = ['$scope', '$state', '$window', 'courseService'];

function CourseController($scope, $state, $window, courseService){
  var self = this;
  self.course = {};

  init();

  function init(){
      getCourseList();
  }

  function getCourseList(){
    courseService.getCourseList().then(function(response){
      self.courseList = response.data;
      console.log("StudentList " + JSON.stringify(studentList));
    });
  }

  self.saveCourse = function(){
    courseService.saveCourse(self.course).then(function(response){
        $state.go('home');
    });
  };

  self.updateCourse = function(){
    courseService.updateCourse(self.course).then(function(response){
        $state.go('home');
    });
  };

  self.deleteCourse = function(courseId){
    courseService.deleteCourse(courseId).then(function(response){
        $state.reload();
    });
  };

  self.getCourseByCourseId = function(){
    courseService.getCourseByCourseId(self.course.courseId).then(function(response){
      self.course = response.data;
    });
  };

}
})();
