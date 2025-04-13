package com.Student.socialMediaApp;

import java.util.ArrayList;

public class Post {
    String postId;
    String content;
    int likes = 0;
    ArrayList<Comment> comments = new ArrayList<>();

    public Post(String postId, String content) {
        this.postId = postId;
        this.content=content;
    }

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

