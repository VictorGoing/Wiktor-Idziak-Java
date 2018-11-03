package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumStaticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> helpdesk = new ArrayList<String>();
        for(int i=0;i<100;i++){
            helpdesk.add("Name");
        }




        forumStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(0,forumStatistics.getPostsQuantity());

        when(statisticsMock.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(1000,forumStatistics.getPostsQuantity());

        Assert.assertEquals(0,forumStatistics.getCommentsQuantity());

        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(1);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(false,forumStatistics.getCommentsQuantity()< forumStatistics.getPostsQuantity());
        Assert.assertEquals(true,forumStatistics.getCommentsQuantity()> forumStatistics.getPostsQuantity());

        Assert.assertEquals(0,forumStatistics.getUsersQuantity());


        when(statisticsMock.usersNames()).thenReturn(helpdesk);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(100,forumStatistics.getUsersQuantity());

    }
}
