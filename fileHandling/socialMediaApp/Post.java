package com.Student.socialMediaApp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Post implements Serializable {
    String postId;
    String content;
    int likes = 0;
    List<Comment> comments;
    //2ArrayList<Comment> comments = new ArrayList<>();

    public Post(String postId, String content) {
        this.postId = postId;
        this.content=content;
        this.comments = new ArrayList<>();
    }
    public Post(){}

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Post ID: " + postId + "\nContent: " + content + "\nLikes: " + likes + "\nComments:");
        if (comments.isEmpty()) {
            result.append(" No Comments.");
        } else {
            for (Comment comment : comments) {
                result.append("\n  ").append(comment);
            }
        }
        return result.toString();
    }
}

