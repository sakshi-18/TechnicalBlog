package techblog.models;

import java.util.Date;

public class Post {


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Post(String title, String body, Date date) {
        this.title = title;
        this.body = body;
        this.date = date;
    }

    private String title;
    private String body;
    private Date date;
}
