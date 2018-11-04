package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumStaticsTestSuite {

    @Test
    public void testPosts0(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();


        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(Double.NaN,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(Double.NaN,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(Double.NaN,forumStatistics.getCommentsPerUser(),0);
    }

    @Test
    public void testPosts1000(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(1000);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(Double.POSITIVE_INFINITY,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(Double.NaN,forumStatistics.getCommentsPerUser(),0);
    }
    @Test
    public void testComments0(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.commentsCount()).thenReturn(1000);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(Double.NaN,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(Double.POSITIVE_INFINITY,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(Double.POSITIVE_INFINITY,forumStatistics.getCommentsPerUser(),0);
    }
    @Test
    public void testCommentsPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();


        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(500);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(Double.POSITIVE_INFINITY,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(2,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(Double.POSITIVE_INFINITY,forumStatistics.getCommentsPerUser(),0);
    }
    @Test
    public void testPostComments(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(Double.POSITIVE_INFINITY,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(0.5,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(Double.POSITIVE_INFINITY,forumStatistics.getCommentsPerUser(),0);
    }
    @Test
    public void testUsers0(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(Double.NaN,forumStatistics.getPostsPerUser(),0);
        Assert.assertEquals(Double.NaN,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(Double.NaN,forumStatistics.getCommentsPerUser(),0);
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
        Assert.assertEquals(Double.NaN,forumStatistics.getCommentsPerPost(),0);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0);

    }
}
