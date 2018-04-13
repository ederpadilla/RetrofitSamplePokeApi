package dev.eder.padilla.retrofitsample.model;

public class PageInfo {

    public Integer totalResults;

    public Integer resultsPerPage;

    public Integer getTotalResults() {
        return totalResults;
    }

    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "totalResults=" + totalResults +
                ", resultsPerPage=" + resultsPerPage +
                '}';
    }
}
