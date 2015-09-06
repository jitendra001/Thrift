'use strict';

angular.module('myApp.services', []).
factory('customerClient',function($window, $q) {		
	var CustomerClient = $window.CustomerClient;
    return {
        getCustomer: function(message) {     	
        	var defered = $q.defer();
        	var result = CustomerClient.getCustomer(message);
        	defered.resolve(result);        	
            return defered.promise;
        }
    };
  return CustomerServiceClient;
});
