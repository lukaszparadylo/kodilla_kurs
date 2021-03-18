package com.kodilla.testing.fotum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> usersN(int numberOfUsers){
        List<String> names = new ArrayList<>();
        if(numberOfUsers>0){
            for(int i = 0; i <numberOfUsers; i++){
                names.add(new ForumUser("User "+i+1, "Real User "+i+1).getName());
            }
        }
        return names;
    }
    private List<ForumPost> forumPosts(int postNumbers){
        List<ForumPost> posts = new ArrayList<>();
        if(postNumbers>0){
            for(int i = 0; i <postNumbers; i++){
                posts.add(new ForumPost("text "+i+1,"User "+i+1));
            }
        }
        return posts;
    }
    private List<ForumComment> forumComments(int commentNumbers){
        List<ForumComment> comments = new ArrayList<>();
        if(commentNumbers>0){
            for(int i = 0; i <commentNumbers; i++){
                comments.add(new ForumComment(new ForumPost("text "+i+1,"User "+i+1),"comment "+i+1,"User "+i));
            }
        }
        return comments;
    }

    @DisplayName("When number of posts is 0")
    @Test
    public void testCalculateAdvStatistics0Posts(){

        when(statisticsMock.postsCount()).thenReturn(forumPosts(0).size());
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int postsQuantity = calculateStatistics.getNumberOfPosts();

        Assertions.assertEquals(0, postsQuantity);
    }
    @DisplayName("When number of posts is 1000")
    @Test
    public void testCalculateAdvStatistics1000Posts(){

        when(statisticsMock.postsCount()).thenReturn(forumPosts(1000).size());
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int postsQuantity = calculateStatistics.getNumberOfPosts();

        Assertions.assertEquals(1000, postsQuantity);
    }
    @DisplayName("When number of comments is 0")
    @Test
    public void testCalculateAdvStatistics0Comments(){

        when(statisticsMock.commentsCount()).thenReturn(forumComments(0).size());
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int commentsQuantity = calculateStatistics.getGetNumberOfComments();

        Assertions.assertEquals(0, commentsQuantity);
    }
    @DisplayName("When number of comments is les than posts")
    @Test
    public void testCalculateAdvStatisticsCommentsLessThanPosts(){

        when(statisticsMock.commentsCount()).thenReturn(forumComments(0).size());
        when(statisticsMock.postsCount()).thenReturn(forumPosts(1).size());
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        boolean commentsLessThanPosts = calculateStatistics.getGetNumberOfComments()<calculateStatistics.getNumberOfPosts();

        Assertions.assertTrue(commentsLessThanPosts);
    }
    @DisplayName("When number of comments is grater than posts")
    @Test
    public void testCalculateAdvStatisticsCommentsGraterThanPosts(){

        when(statisticsMock.commentsCount()).thenReturn(forumComments(2).size());
        when(statisticsMock.postsCount()).thenReturn(forumPosts(1).size());
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        boolean commentsGraterThanPosts = calculateStatistics.getGetNumberOfComments()>calculateStatistics.getNumberOfPosts();

        Assertions.assertTrue(commentsGraterThanPosts);
    }
    @DisplayName("When number of users is 0")
    @Test
    public void testCalculateAdvStatistics0Users(){

        when(statisticsMock.usersNames()).thenReturn(usersN(0));
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int numbersOfUsers = calculateStatistics.getNumberOfUsers();

        Assertions.assertEquals(0, numbersOfUsers);
    }
    @DisplayName("When number of users is 100")
    @Test
    public void testCalculateAdvStatistics100Users(){

        when(statisticsMock.usersNames()).thenReturn(usersN(100));
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int numbersOfUsers = calculateStatistics.getNumberOfUsers();

        Assertions.assertEquals(100, numbersOfUsers);
        calculateStatistics.showStatistics();
    }
}
