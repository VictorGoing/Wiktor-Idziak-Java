package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
public class ForumStaticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock(){
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        forumStatistics.calculateAdvStatistics(statistics);

        Assert.assertEquals(0,(int) forumStatistics.postsQuantity);
        Assert.assertEquals(1000,(int)forumStatistics.postsQuantity);
        Assert.assertEquals(0,(int)forumStatistics.commentsQuantity);
        Assert.assertEquals(false,forumStatistics.commentsQuantity < forumStatistics.postsQuantity);
        Assert.assertEquals(true,forumStatistics.commentsQuantity > forumStatistics.postsQuantity);
        Assert.assertEquals(0,(int)forumStatistics.usrersQuantity);
        Assert.assertEquals(100,(int)forumStatistics.usrersQuantity);

    }
}
