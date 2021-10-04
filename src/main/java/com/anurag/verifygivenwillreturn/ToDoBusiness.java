package com.anurag.verifygivenwillreturn;

import java.util.ArrayList;
import java.util.List;

// ToDoBusiness is a SUT (system under test)   
// ToDoService is a Dependency (as ToDoBusiness is dependent on it)  

public class ToDoBusiness {

    public ToDoService doService;

    public ToDoBusiness(ToDoService doService) {
        this.doService = doService;
    }

    public void deleteTodosNotRelatedToHibernate(String user) {

        List<String> Combinedlist = doService.getTodos(user);

        for (String todos : Combinedlist) {
            if (!todos.contains("Hibernate")) {
                doService.deleteTodos(todos);
            }
        }
    }
}