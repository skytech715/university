'use strict';

(function(){
angular.module('mainApp')
.controller('CourseController', CourseController);

CourseController.$inject = ['$scope', '$state', '$window', 'courseService'];

function CourseController($scope, $state, $window, courseService){
  var self = this;

  init();

  function init(){
      getCourseList();
  }

  function getCourseList(){
    courseService.getCourseList().then(function(response){
      self.courseList = response.data;
    });
  }
  
}
})();
