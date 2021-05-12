package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Search {

    @SerializedName("ns")
    @Expose
    private Integer ns;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("pageid")
    @Expose
    private Integer pageid;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("wordcount")
    @Expose
    private Integer wordcount;
    @SerializedName("snippet")
    @Expose
    private String snippet;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    public Integer getNs() {
        return ns;
    }

    public void setNs(Integer ns) {
        this.ns = ns;
    }

    public Search withNs(Integer ns) {
        this.ns = ns;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Search withTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public Search withPageid(Integer pageid) {
        this.pageid = pageid;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Search withSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getWordcount() {
        return wordcount;
    }

    public void setWordcount(Integer wordcount) {
        this.wordcount = wordcount;
    }

    public Search withWordcount(Integer wordcount) {
        this.wordcount = wordcount;
        return this;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public Search withSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Search withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
