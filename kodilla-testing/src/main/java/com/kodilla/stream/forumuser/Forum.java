package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Forum {

    private List<ForumUser> users;

    public Forum(){
        this.users = new ArrayList<>();

    }
    public void addForumUser(ForumUser forumUser){
        this.users.add(forumUser);
    }
    public List<ForumUser> getUsers() {
        return users;
    }
}
