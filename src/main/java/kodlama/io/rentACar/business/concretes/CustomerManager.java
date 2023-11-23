package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.CustomerService;
import kodlama.io.rentACar.business.requests.CreateCustomerRequest;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.CustomerRepository;
import kodlama.io.rentACar.entities.concretes.Customer;
import kodlama.io.rentACar.rules.CustomerBusinessRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapperService modelMapperService;
    private CustomerBusinessRules customerBusinessRules;

    @Autowired
    public CustomerManager(CustomerRepository customerRepository,
                           CustomerBusinessRules customerBusinessRules) {
        this.customerRepository = customerRepository;
        this.customerBusinessRules = customerBusinessRules;
    }


    @Override
    public List<Customer> getAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public void add(CreateCustomerRequest createCustomerRequest) {
        this.customerBusinessRules.checkIfCustomerExists(createCustomerRequest.getName());
        Customer customer = this.modelMapperService.forRequest().map(createCustomerRequest,Customer.class);
        this.customerRepository.save(customer);
    }
}
