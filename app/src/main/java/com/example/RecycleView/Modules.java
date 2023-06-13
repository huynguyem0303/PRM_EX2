package com.example.RecycleView;

public class Modules {
    private String Name;
    private String Title;
    private String Description;
    private int Image;

    public Modules(String name, String title, String description, int image) {
        Name = name;
        Title = title;
        Description = description;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
