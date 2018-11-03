package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    double usrersQuantity;
    double postsQuantity;
    double commentsQuantity;
    double postsPerUser;
    double commentsPerUser;
    double commmentsPerPost;
    public void calculateAdvStatistics(Statistics statistics){
        usrersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        postsPerUser = postsQuantity/usrersQuantity;
        commentsPerUser = commentsQuantity/usrersQuantity;
        commmentsPerPost = commentsQuantity/postsQuantity;
    }

    public void showStatistics(){
        System.out.println("Liczba użytkowników:" + usrersQuantity);
        System.out.println("Liczba postów:" + postsQuantity);
        System.out.println("Liczba komentarzy:" + commentsQuantity);
        System.out.println("Liczba postów przyadająca na jednego użytkownika:" + postsPerUser);
        System.out.println("Liczba komentarzy przyadająca na jednego użytkownika:" + commentsPerUser);
        System.out.println("Liczba komentarzy przyadająca na jeden post:" + commmentsPerPost);
    }
}
