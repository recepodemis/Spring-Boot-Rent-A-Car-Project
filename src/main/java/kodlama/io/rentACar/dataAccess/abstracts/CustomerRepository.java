package kodlama.io.rentACar.dataAccess.abstracts;

import jakarta.validation.ReportAsSingleViolation;
import kodlama.io.rentACar.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    boolean existsByName(String name);
}
