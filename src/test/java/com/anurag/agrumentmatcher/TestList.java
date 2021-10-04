package com.anurag.agrumentmatcher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.*;

import org.mockito.Mockito;

public class TestList {
    @Test
    public void testList_Argument_Matchers() {

        List<String> mocklist = mock(List.class);

        when(mocklist.get(Mockito.anyInt())).thenReturn("Mockito");

        assertEquals("Mockito", mocklist.get(0));
        assertEquals("Mockito", mocklist.get(1));
        assertEquals("Mockito", mocklist.get(2));
    }
}