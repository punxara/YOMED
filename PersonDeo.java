package deo;



import model.Person;

import java.util.UUID;

public interface PersonDeo {
    int insertPerson (UUID id, Person person);
     default int addPerson (Person person){
         UUID id = UUID.randomUUID();
         return insertPerson(id,person);
     }


    static int insertPerson(Person person) {
        return 0;
    }
}
