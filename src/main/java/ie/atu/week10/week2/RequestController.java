package ie.atu.week10.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/greet/{name}")// {name} is the PathVariable
    public String greetByname(@PathVariable String name) { // stores the name
        return "Hello " + name + "!";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) { //request parameters filters information
        return "Name " + name + "Age" + age;
    }

    @GetMapping("/person")
    public Person person() {
        return new Person("donal ", 25);
    }

    @GetMapping("/calculator")
    public Calculator calculator(@RequestParam int num1, @RequestParam int num2,@RequestParam String operation) {
        switch(operation){
            case "Add":
                return new Calculator( num1 + num2, operation ); //use the calculator class to send the result of the operation
            case "Subtract":
                return new Calculator(num1 - num2, operation);
            case "Multiply":
                return new Calculator(num1 *num2, operation);
            case "Divide":
                if (num2 == 0){
                    return new Calculator(0, "Cannot divide by zero");
                }else {
                    return new Calculator(num1 / num2, operation);
                }
            default:
                return new Calculator(0, "invalid entry");

        }
    }

}
