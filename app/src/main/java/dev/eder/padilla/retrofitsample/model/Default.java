package dev.eder.padilla.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

public class Default {

    public String url;

    public Integer width;

    public Integer height;

    public String getUrl() {
        return url;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Default{" +
                "url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
