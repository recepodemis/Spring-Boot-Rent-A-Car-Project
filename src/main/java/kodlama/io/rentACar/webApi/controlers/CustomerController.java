package kodlama.io.rentACar.webApi.controlers;

import kodlama.io.rentACar.business.abstracts.CustomerService;
import kodlama.io.rentACar.business.requests.CreateCustomerRequest;
import kodlama.io.rentACar.dataAccess.abstracts.CustomerRepository;
import kodlama.io.rentACar.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping()
    public void add(@RequestBody CreateCustomerRequest createCustomerRequest) {
        customerService.add(createCustomerRequest);
    }
}
