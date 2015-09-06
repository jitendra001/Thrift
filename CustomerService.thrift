namespace java customer.service

struct Customer {
    1: required i32 customerId;
    2: required string customerName;
    3: required string customerAddress;    
}

exception CustomerUnavailable {
    1: string message;
}

service CustomerService {
    
    Customer getCustomer(i32 customerId) throws (1:CustomerUnavailable unavailable)
}
