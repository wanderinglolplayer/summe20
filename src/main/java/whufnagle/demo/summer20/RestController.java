package whufnagle.demo.summer20;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.resource.HttpResource;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/welcome/{name}")
    public ResponseEntity<String> welcomeMethod(String name){
        return new ResponseEntity("Welcome, " + name, HttpStatus.OK);
    }
}
