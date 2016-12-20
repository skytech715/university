'use strict';

(function(){
angular.module('mainApp')
.controller('CourseController', CourseController);

CourseController.$inject = ['$scope', '$state', '$window', 'courseService', 'paginateService'];

function CourseController($scope, $state, $window, courseService, paginateService){
  var self = this;
  self.course = {};
  
  init();

  function init(){
      getCourseList();
      pagination();
  }

  function pagination(){
    self.currentPage = 1;
    self.numberPerPage = 5;
  }

  function getCourseList(){
    courseService.getCourseList().then(function(response){
      self.courseList = response.data;
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

  self.paginateFilter = function(item){
    return paginateService.paginate(self.courseList, item, self.currentPage, self.numberPerPage);
  }

}
})();
