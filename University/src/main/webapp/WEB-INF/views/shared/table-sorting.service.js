'use strict';

(function(){
  angular.module('mainApp')
  .factory('tableSortingService', tableSortingService);

function tableSortingService(){
  var svc = {};

  svc.sort = {
      column: '',
      descending: false
  };

  svc.changeSorting = function(column){
    var sort = svc.sort;

    if (sort.column == column) {
        sort.descending = !sort.descending;
    } else {
        sort.column = column;
        sort.descending = false;
    }

    return sort;
  };

  return svc;
}
})();
