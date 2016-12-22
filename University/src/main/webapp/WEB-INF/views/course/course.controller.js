'use strict';

(function(){
angular.module('mainApp')
.controller('CourseController', CourseController);

CourseController.$inject = ['$scope', '$state', '$window', 'courseService', 'paginateService', 'tableSortingService'];

function CourseController($scope, $state, $window, courseService, paginateService, tableSortingService){
  var self = this;
  self.course = $state.params.course;
  self.tableSearch = "";

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

  self.saveOrUpdateCourse = function(){
    courseService.saveOrUpdateCourse(self.course).then(function(response){
        getCourseList();
        $state.go('course');
    });
  };

  self.updateCourse = function(course){
    $state.go('course.modify', {course: course}, {reload: true, notify:true});
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
  };

  self.changeSorting = function(column){
    self.sort = tableSortingService.changeSorting(column);
  };

}
})();
