package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private String status;
    private Person owner;
    private Tag tag;
    
    public Tagging(){
        ;
    }
    
    public Tagging(String status, Person owner, Tag tag){
        this.status = status;
        this.owner = owner;
        this.tag = tag;
    }
    
    public String toString(){
        return status + " " + this.owner.getName() + this.tag.toString();
    }
}
