package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int id;
    private String name;
    private char Sex;
    private LocalDate dateOfBirthday;
    private int postsQuantity;

    public ForumUser(int id, String name, char sex, LocalDate dateOfBirthday, int postsQuantity) {
        this.id = id;
        this.name = name;
        Sex = sex;
        this.dateOfBirthday = dateOfBirthday;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return Sex;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Sex=" + Sex +
                ", dateOfBirthday=" + dateOfBirthday +
                ", postsQuantity=" + postsQuantity +
                '}';
    }


}
