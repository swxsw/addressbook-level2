package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
    @Test
    public void testIsAnyNull_nullGiven_expectsTrue(){
        assertTrue(Utils.isAnyNull((Object) null));
    }
    
    @Test
    public void testIsAnyNull_mixedInputAndNull_expectsTrue(){
        assertTrue(Utils.isAnyNull("String", 123, null));
    }
    
    @Test
    public void testIsAnyNull_correctInput_expectsFalse(){
        assertFalse(Utils.isAnyNull("String", 12313, "String 2"));
    }
    
    @Test
    public void testElementsAreUnique_uniqueArrayListInput_expectsTrue(){
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            testList.add(2 * i);
        }
        
        assertTrue(Utils.elementsAreUnique(testList));
    }
    
    @Test
    public void testElementsAreUnique_nonUniqueArrayListInput_expectsFalse(){
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            testList.add(2);
        }
        
        assertFalse(Utils.elementsAreUnique(testList));
    }
}
