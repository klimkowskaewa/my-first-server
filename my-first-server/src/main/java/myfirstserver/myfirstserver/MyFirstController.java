package myfirstserver.myfirstserver;

import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/test")
public class MyFirstController {

    @GetMapping("/first")
    public String first() {
        return "Hello World!";
    }

    @GetMapping("/second")
    public String second() {
        return "Hello World2!";
    }

    //test/hi/Ewa -> "hi Ewa"
    //http://localhost:8080/test/hi/ewa
    @GetMapping("/hi/{name}")
    public String hi(@PathVariable String name) {
        return "Hi " + name;
    }

    //test/upper?value=Ewa -> "EWA"
    //http://localhost:8080/test/upper?value=ewa
    @GetMapping("/upper")
    public String upper (@RequestParam String value) {
        return value.toUpperCase();
    }

    //http://localhost:8080/test/concat?valueFirst=asdf&valueSecond=123
    @GetMapping("/concat")
    public String upper (@RequestParam String valueFirst, @RequestParam String valueSecond) {
        return valueFirst + valueSecond;
    }

    //http://localhost:8080/test/biggest?numbers=52&numbers=7&numbers=9999
    @GetMapping("/biggest")
    public int biggest (@RequestParam List<Integer> numbers) {
         numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
         return numbers.get(0);
    }
    //after adding implementation 'org.springdoc:springdoc-openapi-ui:1.6.14' to build.gradle
    //http://localhost:8080/swagger-ui/index.html
    //http://localhost:8080/v3/api-docs
    @GetMapping("/authorization")
    public String authorization(@RequestHeader("OurAuthorization") String header) {
        if (header != null &&  header.equals("Secret123")) {
            return "You're logged in.";
        } else {
            return "You have no authorization.";
        }
    }

    @PostMapping("/reverse")
    public String reverse(@RequestBody String value) {
        StringBuilder sb = new StringBuilder();
        return sb.append(value).reverse().toString();
    }

    public static class User {
        private String name;
        private String surname;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }

    @PostMapping("/user")
    public String user(@RequestBody User user) {
        return user.name + " " + user.surname;
    }

}