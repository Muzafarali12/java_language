package com.Student.socialMediaApp;

public class Comment {
    String  commentId;
    String text;

    public Comment(String commentId, String text) {
        this.commentId = commentId;
        this.text=text;
}
    @Override
    public String toString() {
        return "Comment ID: " + commentId + ", Text: " + text;
    }
}
