package whufnagle.demo.summer20;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class StockController {
    String key = System.getenv("STOCKKEY");

    @GetMapping("/stock/{symbol}")
    public String getStock(@PathVariable String symbol){
        System.out.println("prices=token?"+key);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(
                "https://api.tiingo.com/tiingo/daily/"+symbol+"/prices?token="+key,String.class,
                new HttpHeaders()).getBody();
    }
}
