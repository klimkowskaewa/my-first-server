package myfirstserver.myfirstserver.crud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class PersonService {

    private Map<String, Person> repo = new HashMap<>();

    //CRUD -> create, read, update, delete

    private  String getNewPesel() {
        LocalDateTime now = LocalDateTime.now();
        StringBuilder sb = new StringBuilder();
        return sb.append(
                        now.getYear()
                ).append(
                        String.format("%02d",now.getMonthValue())
                ).append(
                        String.format("%02d",now.getDayOfMonth())
                ).append(
                        new Random().nextInt(10000,99999)
                )
                .toString();
    }

    public Person create(Person newPerson) {
        newPerson.setPesel(getNewPesel());
        repo.put(newPerson.getPesel(), newPerson);
        return newPerson;
    }

    public List<Person> list() {
        return new ArrayList<>(repo.values());
    }

    public Person get (String pesel) {
        return repo.get(pesel);
    }

    public Person update (Person toUpdate) {
        if (repo.containsKey(toUpdate.getPesel())){
            repo.put(toUpdate.getPesel(), toUpdate);
            return toUpdate;
        }
        return null;
    }

    public void delete (String pesel) {
        repo.remove(pesel);
    }

}