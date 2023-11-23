package kodlama.io.rentACar.business.requests;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {
    private String name;
    private String surname;
    private int age;
    private String phone;
    private String email;
    private String driverLicense;
}
