package pl.niziolekp.app.paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApi {
    @GetMapping
    public String execute(){
        return "Payment Service";
    }
}
