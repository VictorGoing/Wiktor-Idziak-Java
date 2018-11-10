package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postsPerUser;
    private double commentsPerUser;
    private double commmentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(usersQuantity!=0) {
            postsPerUser = (double) postsQuantity / usersQuantity;
            commentsPerUser = (double)commentsQuantity/usersQuantity;
        }
        if(postsQuantity!=0)
            commmentsPerPost = (double)commentsQuantity/postsQuantity;
    }

    public void showStatistics(){
        System.out.println("Liczba użytkowników:" + usersQuantity);
        System.out.println("Liczba postów:" + postsQuantity);
        System.out.println("Liczba komentarzy:" + commentsQuantity);
        System.out.println("Liczba postów przyadająca na jednego użytkownika:" + postsPerUser);
        System.out.println("Liczba komentarzy przyadająca na jednego użytkownika:" + commentsPerUser);
        System.out.println("Liczba komentarzy przyadająca na jeden post:" + commmentsPerPost);
    }
    public int getUsersQuantity(){
        return usersQuantity;
    }
    public int getPostsQuantity(){
        return postsQuantity;
    }
    public int getCommentsQuantity(){ return commentsQuantity; }
    public double getPostsPerUser(){ return postsPerUser; }
    public double getCommentsPerUser(){
        return commentsPerUser;
    }
    public double getCommentsPerPost(){
        return commmentsPerPost;
    }
}
