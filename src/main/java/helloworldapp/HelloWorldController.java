package helloworldapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String showHelloWorldString() {
        return "Hello, World!! Welcome to my first SPRING App :D";
    }
}
