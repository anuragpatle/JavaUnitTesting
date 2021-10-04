package com.anurag.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * we have created a spy of the ArrayList class and checked its size.
 * The size of the list is zero, it means the list is empty. After checking the list size,
 * we have added an item ("Mockito") in the List. Now, the size has increased by one as we
 * have discussed that the spy creates a partial mock of the real object.
 *
 * The spy() method let the real action continue to happen except the stuff where they want to change the behavior.
 * It means spy() method allows us to keep track of what is happening with the real object as well as allow us to
 * overrides a specific behavior.
 */

public class SpyTest {

    @Test
    public void test() {

        List spyArrayList = spy(ArrayList.class);
        assertEquals(0, spyArrayList.size());

        // adding an item in the list
        spyArrayList.add("Mockito");
        assertEquals(1, spyArrayList.size());

        when(spyArrayList.size()).thenReturn(2);

        assertEquals(2, spyArrayList.size());


    }
}