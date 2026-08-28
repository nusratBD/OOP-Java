package Date2;

import java.time.LocalDate;

public class Document {
    String [] name;
    LocalDate date;
    String[] getAuthor(){
    return name;
    }
    void addAuthor(String name){
    this.name[0]=name;
    }
}
