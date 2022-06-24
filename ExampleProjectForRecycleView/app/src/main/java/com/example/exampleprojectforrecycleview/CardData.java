package com.example.exampleprojectforrecycleview;

public class CardData {

    String title;
    String Description;
    String date;
    String time;
    String day;
    String month;

    CardData(String title,
             String Description,
            String date,
            String time, String day, String month)
    {
        this.date=date;
        this.Description=Description;
        this.title=title;
        this.time=time;
        this.day=day;
        this.month=month;
    }
}
