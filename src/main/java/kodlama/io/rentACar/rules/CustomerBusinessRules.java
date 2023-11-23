package kodlama.io.rentACar.rules;

import kodlama.io.rentACar.dataAccess.abstracts.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@NoArgsConstructor
@Component
public class CustomerBusinessRules {
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerBusinessRules(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void checkIfCustomerExists(String name){
        if (this.customerRepository.existsByName(name)){
            throw new RuntimeException("This Customer already exists");
        }
    }
}
