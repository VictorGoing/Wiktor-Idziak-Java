package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    public static List<ForumUser> getUserList(){
        List<ForumUser> listForumUsers = new ArrayList<>();
        listForumUsers.add(new ForumUser(001,"Popiel",'M', LocalDate.of(1995, 10, 7),0));
        listForumUsers.add(new ForumUser(002,"Floro",'F', LocalDate.of(1997, 5, 21),15));
        listForumUsers.add(new ForumUser(003,"Ssaku",'F', LocalDate.of(1997, 1, 4),21));
        listForumUsers.add(new ForumUser(004,"Mieszko",'M', LocalDate.of(1995, 12, 24),1));
        listForumUsers.add(new ForumUser(005,"Seba",'M', LocalDate.of(2005, 8, 11),100));
        listForumUsers.add(new ForumUser(006,"Ziemowit",'F', LocalDate.of(2010, 9, 29),12));
        listForumUsers.add(new ForumUser(007,"Lordoza",'M', LocalDate.of(1995, 4, 8),2));
        return new ArrayList<ForumUser>(listForumUsers);
    }

}
