package seedu.addressbook.data.person;

import java.util.StringJoiner;

public interface Printable {
    String getPrintableString();
    
    default String getPrintableString(Printable...printables){
        StringJoiner joiner = new StringJoiner(", ");
        for(Printable p : printables){
            joiner.add(p.getPrintableString());
        }
        return joiner.toString();
    }
}
