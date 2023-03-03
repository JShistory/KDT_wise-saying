package domain;

import org.json.JSONObject;

public abstract class WiseSayingInfo {
    private String author;
    private String content;
    private int id;

    public WiseSayingInfo(JSONObject itemJson){
        this.author = itemJson.getString("author");
        this.content = itemJson.getString("content");
        this.id = Integer.parseInt(itemJson.getString("id"));
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
