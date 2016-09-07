package seedu.addressbook.data.person;

import static org.junit.Assert.*;


import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    

    @Test
    public void testIsSimilar_nullGiven_expectsFalse() throws IllegalValueException{
        
        Name testName = new Name("Tim");
        Name testNameTwo = null;
        
        assertFalse(testName.isSimilar(testNameTwo));
    }
    
    @Test
    public void testIsSimilar_sameInputsGiven_expectsTrue() throws IllegalValueException{
        
        Name testName = new Name("Tim");
        Name testNameTwo = new Name("Tim");
        
        assertTrue(testName.isSimilar(testNameTwo));
    }
    
    @Test
    public void testIsSimilar_differentInputsGiven_expectsFalse() throws IllegalValueException{
        
        Name testName = new Name("Tim");
        Name testNameTwo = new Name("Time");
        
        assertFalse(testName.isSimilar(testNameTwo));
    }

}
