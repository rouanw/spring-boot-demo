package stub;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@RequestMapping(produces = "application/json")
public class StubController {

    @RequestMapping("/")
    @ResponseBody
    Greeting home() {
        Greeting greeting = new Greeting();
        greeting.setName("John");
        return greeting;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StubController.class, args);
    }
}
