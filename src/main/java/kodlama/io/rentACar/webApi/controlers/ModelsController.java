package kodlama.io.rentACar.webApi.controlers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetAllModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/models")
public class ModelsController {
    private ModelService modelService;
    @Autowired
    public ModelsController(ModelService modelService) {
        this.modelService = modelService;
    }
    @GetMapping()
    public List<GetAllModelResponse> getAll(){
        return modelService.getAll();
    }
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);
    }
}
