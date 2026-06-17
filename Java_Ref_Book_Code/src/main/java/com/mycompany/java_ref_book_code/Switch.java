package com.mycompany.java_ref_book_code;
public class Switch {
    Switch(){
        int month=14;
        String season;
        switch(month){
            case 1:
                season="January";
                break;
            case 2:
                season="ebruary";
                break;
            case 3:
                season="March";
                break;
            case 4:
                season="April";
                break;
            case 5:
                season="May";
                break;
            case 6:
                season="June";
                break;
            case 7:
                season="July";
                break;
            case 8:
                season="August";
                break;
            case 9:
                season="September";
                break;
            case 10:
                season="October";
                break;
            case 11:
                season="November";
                break;
            case 12:
                season="December";
                break;
            default:
                season="Invalid";
                break;
        }
        System.out.println(season);
    }
}
