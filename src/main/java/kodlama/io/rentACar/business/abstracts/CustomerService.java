package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreateCustomerRequest;
import kodlama.io.rentACar.entities.concretes.Customer;

import java.util.List;
public interface CustomerService {
    List<Customer> getAll();
    void add(CreateCustomerRequest createCustomerRequest);
}
