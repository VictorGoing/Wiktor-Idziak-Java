package com.kodilla.stream;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
 public static void main(String[] args) {
  Forum forumDirectory = new Forum();
  Map<Integer,ForumUser> theResultStringOfForumUser = forumDirectory.getUserList().stream()
          .filter(user -> user.getSex() == 'M')
          .filter(user->user.getDateOfBirthday().getYear()+20>LocalDate.now().getYear())
          .filter(user->user.getPostsQuantity()>0)
          .collect(Collectors.toMap(ForumUser::getId, user->user));

   theResultStringOfForumUser.entrySet().stream()
           .map(entry->entry.getKey() + ": "+entry.getValue())
           .forEach(System.out::println);


  /*BookDirectory theBookDirectory = new BookDirectory();
  String theResultStringOfBooks = theBookDirectory.getList().stream()
          .filter(book -> book.getYearOfPublication() > 2005)
          .map(Book::toString)
          .collect(Collectors.joining(",\n","<<",">>"));

  System.out.println(theResultStringOfBooks);*/
 }

}

