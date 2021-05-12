package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Query {

    @SerializedName("searchinfo")
    @Expose
    private Searchinfo searchinfo;
    @SerializedName("search")
    @Expose
    private List<Search> search = null;

    public Searchinfo getSearchinfo() {
        return searchinfo;
    }

    public void setSearchinfo(Searchinfo searchinfo) {
        this.searchinfo = searchinfo;
    }

    public Query withSearchinfo(Searchinfo searchinfo) {
        this.searchinfo = searchinfo;
        return this;
    }

    public List<Search> getSearch() {
        return search;
    }

    public void setSearch(List<Search> search) {
        this.search = search;
    }

    public Query withSearch(List<Search> search) {
        this.search = search;
        return this;
    }

}
