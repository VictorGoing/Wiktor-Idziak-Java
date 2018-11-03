package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumStaticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock(){
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();



        forumStatistics.calculateAdvStatistics(statisticsMock);



        Assert.assertEquals(0,forumStatistics.getPostsQuantity());

        when(statisticsMock.postsCount()).thenReturn(1000);
        Assert.assertEquals(1000,forumStatistics.getPostsQuantity());

        Assert.assertEquals(0,forumStatistics.getCommentsQuantity());

        Assert.assertEquals(false,forumStatistics.getCommentsQuantity()< forumStatistics.getPostsQuantity());
        Assert.assertEquals(true,forumStatistics.getCommentsQuantity() > forumStatistics.getPostsQuantity());
        Assert.assertEquals(0,forumStatistics.getUsersQuantity());
        Assert.assertEquals(100,forumStatistics.getUsersQuantity());

    }
}
