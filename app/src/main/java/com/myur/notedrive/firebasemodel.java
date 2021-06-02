package com.myur.notedrive;

public class firebasemodel {

    public String title;
    public String content;


    public firebasemodel() {


    }

    public firebasemodel(String title, String content) {

        this.title = title;
        this.content = content;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
