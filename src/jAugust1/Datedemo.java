package jAugust1;


class Date {

    private int day;
    private int month;
    private int year;

    Date() {
        day = 1;
        month = 8;
        year = 2023;
    }

    public Date(int day) {
        this.day = day;
    }


    public void getDate() {
        System.out.println(" Date :  " + day + "/"  + month +  " /" + year );

    }
}



public class Datedemo {
    public static void main(String[] args)
    {
       Date  date =new Date();
       date.getDate();

    }


    }


