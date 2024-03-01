package org.example.enums;

public enum Genre {
    DRAMA("cry genre"),
    COMEDY("funny"),
    ACTION("stalone", 16);

    private String description;
    private int minAge;

    Genre(String description) {
        this.description = description;
    }

    Genre(String description, int minAge) {
        this.description = description;
        this.minAge = minAge;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printDescription() {
        System.out.println(description);
    }
}
