package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumStaticsTestSuite {

    @Test
    public void testPosts0User0Comments0(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();


        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0);
    }

    @Test
    public void testPosts1000User0Comments0(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(1000);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0);
    }


    @Test
    public void testComments1000Posts500User0(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();


        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(500);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(2,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0);
    }
    @Test
    public void testComments1000Posts500User100(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();


        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(500);
        List<String> helpdesk = new ArrayList<String>();
        for(int i=0;i<100;i++){
            helpdesk.add("Name");
        }
        when(statisticsMock.usersNames()).thenReturn(helpdesk);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(5,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(2,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(10,forumStatistics.getCommentsPerUser(),0);
    }
    @Test
    public void testPost1000Comments500User0(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);


        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(0.5,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0);
    }
    @Test
    public void testPost1000Comments500User100(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        List<String> helpdesk = new ArrayList<String>();
        for(int i=0;i<100;i++){
            helpdesk.add("Name");
        }
        when(statisticsMock.usersNames()).thenReturn(helpdesk);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(10,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(0.5,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(5,forumStatistics.getCommentsPerUser(),0);
    }
    @Test
    public void testUsers100(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> helpdesk = new ArrayList<String>();
        for(int i=0;i<100;i++){
            helpdesk.add("Name");
        }
        when(statisticsMock.usersNames()).thenReturn(helpdesk);


        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0);

    }
}
