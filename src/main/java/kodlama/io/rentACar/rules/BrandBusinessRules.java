package kodlama.io.rentACar.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Component
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    @Autowired
    public BrandBusinessRules(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    public void checkIfBrandNameExists(String name){
        if (brandRepository.existsByName(name)){
            throw new BusinessException("This brand already exists");
        }
    }

}
