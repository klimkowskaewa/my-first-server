package myfirstserver.myfirstserver.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> list() {
        return service.list();
    }

    @GetMapping("/{pesel}")
    public Person get(@PathVariable String pesel) {
        return service.get(pesel);
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    @DeleteMapping("/{pesel}")
    public void delete (@PathVariable String pesel) {
        service.delete(pesel);
    }

}