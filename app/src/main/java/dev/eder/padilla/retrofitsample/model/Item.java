package dev.eder.padilla.retrofitsample.model;

public class Item {

    public String kind;

    public String etag;

    public String id;

    public Snippet snippet;

    public Statistics statistics;

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag;
    }

    public String getId() {
        return id;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    @Override
    public String toString() {
        return "Item{" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", id='" + id + '\'' +
                ", snippet=" + snippet +
                ", statistics=" + statistics +
                '}';
    }
}
