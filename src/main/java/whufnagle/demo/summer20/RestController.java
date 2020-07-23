package whufnagle.demo.summer20;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/welcome/{name}")
    public ResponseEntity<String> welcomeMethod(String name){
        return new ResponseEntity("Welcome, " + name, HttpStatus.OK);
    }
}
