'use strict';

(function() {
angular.module('mainApp').directive('backToTop', function(){

		return {
			restrict: 'E',
			replace: true,
			template: '<a class="back-to-top hover"><i class="fa fa-arrow-circle-up fa-fw" aria-hidden="true"></i></a>',
			link: function($scope, element, attrs) {

				$(window).scroll(function(){

					if ($(window).scrollTop() <= 300) {
						$(element).removeClass('fadein');
					}
					else {
						$(element).addClass('fadein');

					}

				});

				$(element).on('click', function(){
					$('html, body').animate({ scrollTop: 0 }, 'fast');
				});

			}
		};

	});
})();
