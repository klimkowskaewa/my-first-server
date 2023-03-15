package myfirstserver.myfirstserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    //http://localhost:8080/calculator/add/1/5.8
    @GetMapping("/add/{a}/{b}")
    public double add(@PathVariable double a,@PathVariable double b) {
        return a + b;
    }

    //http://localhost:8080/calculator/subtract/1/5.8
    @GetMapping("/subtract/{a}/{b}")
    public double subtract(@PathVariable double a,@PathVariable double b) {
        return a - b;
    }

    //http://localhost:8080/calculator/multiply/1/5.8
    @GetMapping("/multiply/{a}/{b}")
    public double multiply(@PathVariable double a,@PathVariable double b) {
        return a * b;
    }

    //http://localhost:8080/calculator/division/1/5.8
    @GetMapping("/division/{a}/{b}")
    public double division(@PathVariable double a,@PathVariable double b) {
        return a / b;
    }


}
