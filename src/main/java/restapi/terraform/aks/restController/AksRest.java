package restapi.terraform.aks.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.terraform.aks.dto.Information;
restcontrolel classmake
@RestController
public class AksRest {

    @GetMapping("/datetime")
    public Information getInfo(){
        return new Information();
    }
}
