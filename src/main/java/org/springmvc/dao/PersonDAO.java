package org.springmvc.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springmvc.models.People;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private final List<People> person;

    {
        person = new ArrayList<People>();
        person.add(new People(PEOPLE_COUNT++,"John"));
        person.add(new People(PEOPLE_COUNT++,"Lisa"));
        person.add(new People(PEOPLE_COUNT++,"Katya"));
    }
    public List<People> index() {
        return person;
    }
    public People show(int id) {
        return (People) person.stream().filter(people -> people.getId() == id).findAny().orElse(null);
    }
}

