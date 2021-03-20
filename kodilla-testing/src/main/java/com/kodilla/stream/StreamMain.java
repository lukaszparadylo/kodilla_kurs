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
            Map<Integer, ForumUser> usersList = new HashMap<>();
            usersList = forum.getUsers().stream()
                    .filter(forumUser -> forumUser.getUserSex() == 'M')
                    .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.of(2001,3,20)))
                    .filter(forumUser -> forumUser.getNumberOfPosts()>0)
                    .collect(Collectors.toMap(ForumUser::getUserId,forumUser -> forumUser));

            System.out.println("# elements: " + usersList.size());
            usersList.entrySet().stream()
                    .map(entry -> "|Id: " +entry.getKey() + " |Name: " + entry.getValue().getUserName()+ " |User sex: "+entry.getValue().getUserSex()+
                            " |Number of posts: "+entry.getValue().getNumberOfPosts()+ " |Date of birth: "+entry.getValue().getDateOfBirth()+"|")                   // [3]
                    .forEach(System.out::println);
        }
}
