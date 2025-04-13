package com.Student.socialMediaApp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    List<Login> listOfUser = new ArrayList<>();
    List<CreateAccount> accountList = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();


    public void createAccount(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter User Name : ");
        String userName = input.next();

        System.out.print("Enter User Id : ");
        String userId = input.next();

        System.out.print("Enter email : ");
        String email = input.next();

        System.out.print("Enter Contact number : ");
        String contact = input.next();

        System.out.print("Enter Password : ");
        String password = input.next();

        CreateAccount createAccount = new CreateAccount(userName,userId,email,contact,password);
        accountList.add(createAccount);
        System.out.println("Account Created Successful");

        mainMenu();

    }
    public void loginAccount(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter user name : ");
        String user = input.next().trim();

        System.out.print("Enter Password : ");
        String pascode = input.next().trim();

        boolean islogin = false;
        for (Login users : listOfUser) {
            if (users.userName.equalsIgnoreCase(user) && users.password.equals(pascode)) {
                System.out.println("Welcome!");
                mainMenu();
                islogin = true;
                break;
            }
        }
        if(!islogin){
            System.out.println("Your Account is Not Present.");
            System.out.println("Do You want to create Your account. ");
            System.out.print("If Yes Then select '1' ");
            System.out.print("If No Then select '2' : ");
            int choice = input.nextInt();
            if (choice == 1) {
                createAccount();

            }
            else {
                System.out.println("I think you not want to Create Account. ");
                System.exit(0);
            }
        }
    }
    public void UpdateAccount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String password = input.next();
        boolean foundId = false;

        // Loop through the list to find the user id
        for (CreateAccount ids : accountList) {
            if (ids.password.equals(password)) {
                foundId = true;

                System.out.print("Update your Name: ");
                String newUserName = input.next();

                System.out.print("Update Your Password: ");
                String updatePassword = input.next();

                ids.username = newUserName;
                ids.password = updatePassword;

                System.out.println("Account Updated Successfully");
                return;
            }
        }
        // If the account wasn't found
        if (!foundId) {
            System.out.println("Account not found.");
        }
    }
    // Method for add Post
    public void addPost(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter post id for Your post : ");
        String postId = input.next();

        System.out.print("Add Your Post : ");
        String content = input.nextLine();
        input.nextLine();

        posts.add(new Post(postId, content));
        System.out.println("Post Added Successfuly.");

        System.out.println("Would You Like To add an other Post.(Yes/No)");
        System.out.print("If Yes Then select '1' (OR) If No Then select 'Any of Number' : ");
        int add = input.nextInt();

        if(add == 1){
            addPost();
        }
        else{
            System.out.println("Post "+ content);
        }
    }

    public void updatePost(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Post I'd : ");
        String id = input.next();

        for(Post account : posts){
            if (account.postId.equals(id)){
                System.out.print("Enter your new post: ");
                String update = input.nextLine();
                input.nextLine();

                System.out.println("Post Updated Successfuly. ");

                String newPost = account.content = update;

                System.out.println("Updated Post : " +newPost);

            }
        }
        System.out.println("ID Not Match To your Post.");
    }
    public void deletePost(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter post id : ");
        String id = input.next();

        Post postToDelete = null;
        for (Post postss : posts) {
            if (postss.postId.equals(id) ) {
                postToDelete = postss;
                break;
            }
        }
        if (postToDelete != null){
            posts.remove(postToDelete);
            System.out.println("Post deleted Successful.");
        }else {
        System.out.println("ID Not Match To your Post.");}
    }
    public void commentPost(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your post id: ");
        String postId = input.next();
        Post postIdMatch = null;
        for(Post post : posts){
            if (post.postId.equals(postId)){
                postIdMatch = post;
                break;
            }
        }
        if (postIdMatch != null){
            System.out.print("Give id to your Comment : ");
            String id = input.next();
            System.out.print("Give comment on post : ");
            String coment = input.next();
            postIdMatch.comments.add(new Comment(id,coment));
            System.out.println("Comment Added Successfully. ");
            System.out.println("Comment : "+coment);
        }
        else {
            System.out.println("ID Not Match To your Post.");
        }
    }
    public void likeAPost(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Post id : ");
        String id = input.next();

        for (Post post : posts){
            if (post.postId.equals(id)){
               post.likes++;
               System.out.println("Post are liked successfully");
               return;
            }
        }
        System.out.print("ID Not Match To your Post.");
    }
    public void deleteComment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter post id: ");
        String postId = input.next();
        Post targetPost = null;
        for (Post post : posts) {
            if (post.postId.equals(postId)) {
                targetPost = post;
                break;
            }
        }

        if (targetPost == null) {
            System.out.println("No post found with the given ID.");
            return;
        }
        System.out.print("Enter the Comment ID to delete: ");
        String commentId = input.next();
        Comment targetComment = null;
        for (Comment comment : targetPost.comments) {
            if (comment.commentId.equals(commentId)) {
                targetComment = comment;
                break;
            }
        }
        if (targetComment != null) {
            targetPost.comments.remove(targetComment);
            System.out.println("Comment deleted successfully.");
        } else {
            System.out.println("No comment found with the given ID.");
        }
    }
    public void showAllFeed() {
        if (posts.isEmpty()) {
            System.out.println("No posts available.");
            return;
        }
        for (int i = 0; i < posts.size(); i++) {
            Post currentPost = posts.get(i);
            System.out.println((i + 1) + ". " + currentPost);

            if (currentPost.comments.isEmpty()) {
                System.out.println("  No comments yet.");
            } else {
                for (int j = 0; j < currentPost.comments.size(); j++) {
                    Comment comment = currentPost.comments.get(j);
                    System.out.println("  Comment " + (j + 1) + ": " + comment.text);
                }
            }
            System.out.println();
        }
    }

    public void menu(){
        Scanner input = new Scanner(System.in);
        while (true){
        System.out.println("Welcome to Social media App");
        System.out.println("1- Create Account. ");
        System.out.println("2- Login Account.");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            //account();
        switch (choice){
            case 1 -> createAccount();
            case 2 -> loginAccount();
        }
        }
    }

    public void mainMenu(){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1- Update account.");
            System.out.println("2- Add new Post. ");
            System.out.println("3- Update Post. ");
            System.out.println("4- Delete Post. ");
            System.out.println("5- Comment on Post. ");
            System.out.println("6- Like a Post. ");
            System.out.println("7- Delete Comment On Post.");
            System.out.println("8- Show All feed. ");
            System.out.println("9- Logout.");
            System.out.print("Enter your Choice :");
            int Choice = input.nextInt();
            switch (Choice) {
                case 1 -> UpdateAccount();
                case 2 -> addPost();
                case 3 -> updatePost();
                case 4 -> deletePost();
                case 5 -> commentPost();
                case 6 -> likeAPost();
                case 7 -> deleteComment();
                case 8 -> showAllFeed();
                case 9 -> System.exit(0);
              }
           }
        }

    public static void main(String [] args){
        App app = new App();
        app.menu();
    }
}
