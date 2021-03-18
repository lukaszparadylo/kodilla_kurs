package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    private Integer numberOfUsers;
    private Integer numberOfPosts;
    private Integer numberOfComments;
    private Double averageNumberOfPostPerUser;
    private Double averageNumberOfCommentsPerUser;
    private Double averageNumberOfCommentsPerPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
        this.numberOfUsers = 0;
        this.numberOfPosts = 0;
        this.numberOfComments = 0;
        this.averageNumberOfPostPerUser = 0.0;
        this.averageNumberOfCommentsPerUser = 0.0;
        this.averageNumberOfCommentsPerPost = 0.0;
    }
    public void calculateAdvStatistics(Statistics statistic){
        this.numberOfUsers = statistic.usersNames().size();
        this.numberOfPosts = statistic.postsCount();
        this.numberOfComments = statistic.commentsCount();
        if(numberOfUsers>0)this.averageNumberOfPostPerUser = (double) this.numberOfPosts/this.numberOfUsers;
        if(numberOfUsers>0)this.averageNumberOfCommentsPerUser = (double) this.numberOfComments/this.numberOfUsers;
        if(numberOfPosts>0)this.averageNumberOfCommentsPerPost = (double) this.numberOfComments/this.numberOfPosts;
    }
    public void showStatistics(){
        System.out.println("Number of user: "+getNumberOfUsers());
        System.out.println("Number of posts: "+getNumberOfPosts());
        System.out.println("Number of comment: "+getGetNumberOfComments());
        System.out.println("Average number of posts peer user: "+getAverageNumberOfPostPerUser());
        System.out.println("Average number of comments per post: "+getAverageNumberOfCommentsPerPost());
        System.out.println("Average number of comment per user: "+getNumberOfCommentsPerUser());
    }
    public Integer getNumberOfUsers() {
        return this.numberOfUsers;
    }
    public Integer getNumberOfPosts() {
        return this.numberOfPosts;
    }
    public Integer getGetNumberOfComments() {
        return this.numberOfComments;
    }
    public Double getAverageNumberOfPostPerUser() {
        return this.averageNumberOfPostPerUser;
    }
    public Double getNumberOfCommentsPerUser() {
        return this.averageNumberOfCommentsPerUser;
    }
    public Double getAverageNumberOfCommentsPerPost() {
        return this.averageNumberOfCommentsPerPost;
    }
}
