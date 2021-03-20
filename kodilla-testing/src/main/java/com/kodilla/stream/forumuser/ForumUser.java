package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private String userName;
    private char userSex;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int userId, String userName, char userSex, LocalDate dateOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
}
