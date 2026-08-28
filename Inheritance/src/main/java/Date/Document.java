/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Document {
     String author;
    LocalDate date = LocalDate.now();
    String getAuthor(){
    return author;
    }
    void addAuthor(String name){
    this.author=name;
    }
    LocalDate getDate(){
    return date;
    }
}
