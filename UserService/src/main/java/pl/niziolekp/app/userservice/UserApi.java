package pl.niziolekp.app.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {
    @GetMapping
    public String execute(){
        return "User Service";
    }
}
