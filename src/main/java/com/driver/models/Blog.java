package com.driver.models;
import org.apache.catalina.User;
//import org.springframework.boot.maven.Image;

import javax.persistence.*;
//import java.awt.*;
import java.awt.*;
import java.util.Date;
import java.util.List;

@Entity
public class Blog{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String  title;
    private String content;
    private Date  pubDate;

    @ManyToOne
    User user;
    @OneToMany
    List<Image> image;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public Blog() {
    }

    public Blog(int id, String title, String content, Date pubDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.pubDate = pubDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}