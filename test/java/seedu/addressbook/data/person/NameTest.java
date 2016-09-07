package seedu.addressbook.data.person;

import static org.junit.Assert.*;


import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    

    @Test
    public void testIsSimilar_nullGiven_expectsError() throws IllegalValueException{
        
        Name testName = new Name("Tim");
        Name testNameTwo = null;
        
        assertFalse(testName.isSimilar(testNameTwo));
    }

}
