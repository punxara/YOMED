package service;

import deo.PersonDeo;
import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonDeo personDeo;

    @Autowired
    public PersonService(@Qualifier("fake") PersonDeo personDeo) {
        this.personDeo = personDeo;
    }

    public static int addPerson(Person person) {
        return PersonDeo.insertPerson(person);
    }
}
