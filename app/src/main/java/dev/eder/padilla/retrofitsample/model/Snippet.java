package dev.eder.padilla.retrofitsample.model;

public class Snippet {

    public String title;

    public String description;

    public String customUrl;

    public String publishedAt;

    public Thumbnails thumbnails;

    public Localized localized;

    public String country;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCustomUrl() {
        return customUrl;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public Localized getLocalized() {
        return localized;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Snippet{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", customUrl='" + customUrl + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", thumbnails=" + thumbnails +
                ", localized=" + localized +
                ", country='" + country + '\'' +
                '}';
    }
}
