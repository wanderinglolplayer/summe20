package whufnagle.demo.summer20;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome/{name}")
    public String welcomeMethod(@PathVariable String name){
        return "Welcome, " + name;
    }
}
