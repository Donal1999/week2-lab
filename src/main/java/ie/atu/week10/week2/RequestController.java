package ie.atu.week10.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello";
    }

    @GetMapping("/greet/{name}")// {name} is the PathVariable
    public String greetByname(@PathVariable String name){ // stores the name
        return "Hello "+ name +"!";
    }
}
