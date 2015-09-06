var CustomerClient = (function() {
    return {
    	getCustomer : function(message) {
    	    var transport = new Thrift.Transport("http://localhost:8080/CustomerService/CustomerServlet");
    	    var protocol  = new Thrift.Protocol(transport);
    	    var client    = new CustomerServiceClient(protocol);

    	    try {
    	      result = client.getCustomer(message);
    	      return result;
    	    } catch(ex){
    	    	
    	    }
    	}
    };
}());