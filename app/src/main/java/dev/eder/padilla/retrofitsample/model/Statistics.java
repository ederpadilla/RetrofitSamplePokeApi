package dev.eder.padilla.retrofitsample.model;

public class Statistics {

    public String viewCount;

    public String commentCount;

    public String subscriberCount;

    public Boolean hiddenSubscriberCount;

    public String videoCount;

    public String getViewCount() {
        return viewCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public String getSubscriberCount() {
        return subscriberCount;
    }

    public Boolean getHiddenSubscriberCount() {
        return hiddenSubscriberCount;
    }

    public String getVideoCount() {
        return videoCount;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "viewCount='" + viewCount + '\'' +
                ", commentCount='" + commentCount + '\'' +
                ", subscriberCount='" + subscriberCount + '\'' +
                ", hiddenSubscriberCount=" + hiddenSubscriberCount +
                ", videoCount='" + videoCount + '\'' +
                '}';
    }
}
