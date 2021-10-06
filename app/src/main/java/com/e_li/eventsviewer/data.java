package com.e_li.eventsviewer;

import android.graphics.Bitmap;

public class data {

    Bitmap img;
    String name;
    String location;
    String content;
    String schedule;

    public data(Bitmap e_img, String e_name, String e_location, String e_content, String s) {

        this.img = e_img;
        this.name = e_name;
        this.location = e_location;
        this.content = e_content;
        this.schedule = s;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
