package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
        public static void main(String[] args) {

            Forum forum = new Forum();
            ForumUser forumUser1 = new ForumUser(0, "Jan", 'M',LocalDate.of(1990,1,1),2);
            ForumUser forumUser2 = new ForumUser(1, "Wlodek", 'M',LocalDate.of(2001,1,1),3);
            ForumUser forumUser3 = new ForumUser(2, "Andrzej", 'M',LocalDate.of(1976,1,1),0);
            ForumUser forumUser4 = new ForumUser(3, "Aleksandra", 'K',LocalDate.of(2002,1,1),0);
            ForumUser forumUser5 = new ForumUser(4, "Justyna", 'K',LocalDate.of(2013,1,1),4);
            ForumUser forumUser6 = new ForumUser(5, "Anna", 'K',LocalDate.of(2000,1,1),5);
            ForumUser forumUser7 = new ForumUser(6, "Zdzisław", 'M',LocalDate.of(1956,1,1),9);

            forum.addForumUser(forumUser1);
            forum.addForumUser(forumUser2);
            forum.addForumUser(forumUser3);
            forum.addForumUser(forumUser4);
            forum.addForumUser(forumUser5);
            forum.addForumUser(forumUser6);
            forum.addForumUser(forumUser7);
            
            Map<Integer, ForumUser> usersList = new HashMap<>();
            usersList = forum.getUsers().stream()
                    .filter(forumUser -> forumUser.getUserSex() == 'M')
                    .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                    .filter(forumUser -> forumUser.getNumberOfPosts()>0)
                    .collect(Collectors.toMap(ForumUser::getUserId,forumUser -> forumUser));

            System.out.println("# elements: " + usersList.size());
            usersList.entrySet().stream()
                    .map(entry -> "|Id: " +entry.getKey() + " |Name: " + entry.getValue().getUserName()+ " |User sex: "+entry.getValue().getUserSex()+
                            " |Number of posts: "+entry.getValue().getNumberOfPosts()+ " |Date of birth: "+entry.getValue().getDateOfBirth()+"|")                   // [3]
                    .forEach(System.out::println);
        }

}
