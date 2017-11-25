package com.niketgoel.assignment103;

/**
 * Created by niketgoel on 25/11/17.
 */

public class CustomList {
    public int icon;
    public String title;
    public  String titleDescription;

    // we are over loading here
    public CustomList(){
        super();
    }

    public CustomList(int icon, String title,String titleDescription) {
        super();
        this.icon = icon;
        this.title = title;
        this.titleDescription = titleDescription;
    }


}
