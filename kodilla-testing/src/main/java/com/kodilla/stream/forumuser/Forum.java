package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Forum {

    private final List<ForumUser> users;

    public Forum(){
        this.users = new ArrayList<>();
        this.users.add(new ForumUser(0, "Jan", 'M',LocalDate.of(1990,1,1),2));
        this.users.add(new ForumUser(1, "Wlodek", 'M',LocalDate.of(2001,1,1),3));
        this.users.add(new ForumUser(2, "Andrzej", 'M',LocalDate.of(1976,1,1),0));
        this.users.add(new ForumUser(3, "Aleksandra", 'K',LocalDate.of(2002,1,1),0));
        this.users.add(new ForumUser(4, "Justyna", 'K',LocalDate.of(2013,1,1),4));
        this.users.add(new ForumUser(5, "Anna", 'K',LocalDate.of(2000,1,1),5));
        this.users.add(new ForumUser(6, "Zdzisław", 'M',LocalDate.of(1956,1,1),9));
    }

    public List<ForumUser> getUsers() {
        return users;
    }
}
