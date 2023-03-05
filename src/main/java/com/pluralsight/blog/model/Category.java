package com.pluralsight.blog.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Post> posts;


    public Category(List<Post> posts) {
        super();
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return null;
    }

    public void addPost(Post post) {
        return;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
