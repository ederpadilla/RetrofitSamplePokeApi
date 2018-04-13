package dev.eder.padilla.retrofitsample.model;

import java.util.List;

public class PreviewResponse {


    public String kind;

    public String etag;

    public PageInfo pageInfo;

    public List<Item> items = null;

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "PreviewResponse{" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", pageInfo=" + pageInfo +
                ", items=" + items +
                '}';
    }
}
