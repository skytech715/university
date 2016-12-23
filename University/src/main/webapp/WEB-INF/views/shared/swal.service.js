'use strict';

(function(){
  angular
    .module('mainApp')
    .factory('swalService', swalService);

    swalService.$inject = [];

    function swalService(){
      var svc = {};

      svc.promptErrorMessage = function(title, message){
        swal({
          title: title,
          text: message,
          type: 'error'
        });
      };

      svc.promptSuccessMessage = function(title, message){
        swal({
          title: title,
          text: message,
          type: 'success'
        });
      };

      svc.promptWarningMessage = function(title, message){
        swal({
          title: title,
          text: message,
          type: 'warning'
        });
      };

      svc.promptMessage = function(title, message, type){
        swal({
          title: title,
          text: message,
          type: type
        });
      };

      svc.promptDeleteMessage = function(callBack){
        swal({
          title: "Are you sure?",
          text: "You will not be able to recover this data!",
          type: "warning",
          showCancelButton: true,
          confirmButtonColor: "#DD6B55",
          confirmButtonText: "Yes, delete it!",
          cancelButtonText: "No, cancel",
          closeOnConfirm: false,
          closeOnCancel: false
        }, function(isConfirm){
            if (isConfirm) {
              swal("Deleted!", "Your data has been deleted.", "success");
            } else {
              swal("Cancelled", "Your data is safe.", "error");
            }
            callBack(isConfirm);
        });
      };

      return svc;
    }

})();
