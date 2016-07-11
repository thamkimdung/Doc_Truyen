package com.example.thamkimdung.doctruyen;

/**
 * Created by thamkimdung on 09/07/2016.
 */
public class ItemFace {
    private int imageId;
    private String title;

    public ItemFace(int imageId, String title) {
        this.imageId = imageId;
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }
}
