package com.anurag.verifygivenwillreturn;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ToDoBusinessMock {


    @Test
    public void deleteTodosusing_BDD() {

        //Given  
        ToDoService todoService = mock(ToDoService.class);

        List<String> combinedlist = Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");

//        given(todoService.getTodos("dummy")).willReturn(combinedlist);
        when(todoService.getTodos("dummy")).thenReturn(combinedlist);

        ToDoBusiness business = new ToDoBusiness(todoService);

        //When  
        business.deleteTodosNotRelatedToHibernate("dummy");

        //Then  
        verify(todoService).deleteTodos("Use Spring MVC");
    }
}