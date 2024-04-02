package pl.niziolekp.app.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/payment")
@RefreshScope
public class PaymentApi {
    @Value("${app.user}")
    private String appUser;
    @GetMapping
    public String execute(){
        return "Payment Service ";
    }
    @GetMapping("/user")
    public String getUser() {
        return "User: " + appUser;
    }
}
