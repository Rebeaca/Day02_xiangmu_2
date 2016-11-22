package com.example.user.myapplication;

/**
 * Created by user on 2016/11/22.
 * 实体类
 */

public class Story {
    private String stroyName;
    private String stroyAuthor;

    public Story() {

    }

    public Story(String stroyName, String stroyAuthor) {
        this.stroyName = stroyName;
        this.stroyAuthor = stroyAuthor;
    }

    public String getStroyName() {
        return stroyName;
    }

    public void setStroyName(String stroyName) {
        this.stroyName = stroyName;
    }

    public String getStroyAuthor() {
        return stroyAuthor;
    }

    public void setStroyAuthor(String stroyAuthor) {
        this.stroyAuthor = stroyAuthor;
    }
}
