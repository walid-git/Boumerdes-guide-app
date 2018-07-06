package com.example.walid.project5;

public class RecyclerViewElement {
    private String title;
    private int img_res;
    private int details_res;
    private String location;

    public RecyclerViewElement(String title, int img_res, int details_res, String location) {
        this.title = title;
        this.img_res = img_res;
        this.location = location;
        this.details_res = details_res;
    }

    public String getTitle() {
        return title;
    }

    public int getImg_res() {
        return img_res;
    }

    public String getLocation() {
        return location;
    }

    public int getDetails_res() {
        return details_res;
    }
}
