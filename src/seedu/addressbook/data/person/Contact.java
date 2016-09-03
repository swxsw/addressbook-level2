package seedu.addressbook.data.person;

public abstract class Contact {
    
    public final String value;
    
    protected boolean isPrivate;
    
    public Contact(){
        this.value = null;
    }
    
    public String toString() {
        return value;
    }
    
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
    
    
}
