package com.abc.recyclerview;

//Source es un pojo

public class Source {
    private final String title; //title == es un objeto Immutable, o sea, no se puede modificar
    private final int image;

    /**
     * @param title
     * @param image
     */
    public Source(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
