package seedu.addressbook.data.person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can only be in a/BLOCK, STREET, UNIT, POSTAL_CODE format";
    public static final String ADDRESS_VALIDATION_REGEX = "(.+),(.+),(.+),(.+)";

    //public final String value;
    private boolean isPrivate;
    
    public final Block blockData;
    public final Street streetData;
    public final Unit unitData;
    public final PostalCode postalCodeData;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        //this.value = address;
        
        Pattern addressPattern = Pattern.compile(ADDRESS_VALIDATION_REGEX);
        
        Matcher addressMatcher = addressPattern.matcher(address);
        
        if(addressMatcher.find()){
            this.blockData = new Block(addressMatcher.group(1));
            this.streetData = new Street(addressMatcher.group(2));
            this.unitData = new Unit(addressMatcher.group(3));
            this.postalCodeData = new PostalCode(addressMatcher.group(4));
        } else {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return blockData.getBlock() + " " + streetData.getStreet() + " " + unitData.getUnit() + " " + postalCodeData.getPostalCode();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return (blockData.getBlock() + " " + streetData.getStreet() + " " 
                + unitData.getUnit() + " " + postalCodeData.getPostalCode()).hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}

/**
 * Subclasses of the address class.
 * @author sw
 *
 */

class Block{
    private String blockData;
    public Block(String data){
        this.blockData = data;
    }
    public String getBlock(){
        return this.blockData;
    }
}

class Street{
    private String streetData;
    public Street(String data){
        this.streetData = data;
    }
    public String getStreet(){
        return this.streetData;
    }
}

class Unit{
    private String unitData;
    public Unit(String data){
        this.unitData = data;
    }
    public String getUnit(){
        return this.unitData;
    }
}

class PostalCode{
    private String postalCodeData;
    public PostalCode(String data){
        this.postalCodeData = data;
    }
    public String getPostalCode(){
        return this.postalCodeData;
    }
}