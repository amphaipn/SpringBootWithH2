package com.amphaipn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by A on 3/31/2017.
 */
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long Id;

    private String title;
    private String body;
    private Date postedOn;
    @ManyToOne
    private Author author;

    public Post(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

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

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                '}';
    }
}
