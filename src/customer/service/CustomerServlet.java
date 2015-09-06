package customer.service;

import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.server.TServlet;

public class CustomerServlet extends TServlet {
        public CustomerServlet() {
                super(
                        new CustomerService.Processor(
                                new CustomerServiceHandler()),
                                new TJSONProtocol.Factory()
                );
        }
        
}