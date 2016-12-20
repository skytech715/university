'use strict';

(function(){
  angular.module('mainApp')
  .factory('paginateService', paginateService);

function paginateService(){
  var svc = {};

  svc.paginate = function(object, item, currentPage, numberPerPage){
      var begin, end, index;
      begin = (currentPage - 1) * numberPerPage;
      end = begin + numberPerPage;
      index = object.indexOf(item);
      return (begin <= index && index < end);
  };

  return svc;
}
})();
