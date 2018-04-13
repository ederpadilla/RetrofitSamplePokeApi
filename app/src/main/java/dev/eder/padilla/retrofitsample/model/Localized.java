package dev.eder.padilla.retrofitsample.model;

public class Localized {
    public String title;

    public String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Localized{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
