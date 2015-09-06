'use strict';

angular.module('myApp.controllers', []).
  controller('customerServiceController', ['$scope', 'customerClient', function($scope, customerClient) {
	  $scope.input = {text : ""};
	  $scope.error =  "";
	  $scope.isError =  false;
	  $scope.result =  false;
	  $scope.getCustomer = function() {
		  var promise = customerClient.getCustomer($scope.input.text);
			  promise.then(function(data){
				  if(data!==undefined){
					  $scope.isError =  false;
					  $scope.result =  true;
					  $scope.id =  data.customerId;
					  $scope.name = data.customerName;
					  $scope.address = data.customerAddress;
				  }
				  else{
					  $scope.error =  "Customer not found!";
					  $scope.result =  false;
					  $scope.isError =  true;
				  }
				  
			  }, function(err) {
				    console.log('err: ', err);
			  })
      };
 }]);