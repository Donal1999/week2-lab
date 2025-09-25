package ie.atu.week10.week2;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){ //request parameters filters information
        return "Name "+ name +"Age"+ age;
    }
    @GetMapping("/person")
    public Person person(){
        return new Person("donal ", 25);
    }
}
