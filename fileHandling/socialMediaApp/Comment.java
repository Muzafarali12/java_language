package com.Student.socialMediaApp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Comment implements Serializable {
    String  commentId;
    String text;
    List<Post> posts = new ArrayList<>();

    public Comment(String commentId, String text) {
        this.commentId = commentId;
        this.text=text;
}
    @Override
    public String toString() {
        return "Comment ID: " + commentId + ", Text: " + text;
    }
}
