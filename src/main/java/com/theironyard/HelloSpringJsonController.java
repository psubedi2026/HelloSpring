package com.theironyard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psubedi2020 on 3/13/17.
 */
@RestController
public class HelloSpringJsonController {

    @RequestMapping(path = "/person.json", method = RequestMethod.GET)
    public Person jsonHome(String name, String city, String age) {
       return new Person(name, city, age);
    }



}
