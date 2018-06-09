import framework.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.concurrent.ThreadLocalRandom;

@Category(ChannelJob.class)
public class WednesdayIT {
    private Long minTestTimeMillis = 1000L;
    private Long maxTestTimeMillis = 3000L;

    @Before
    public void before() {
        System.out.println("Running test");
    }

    @After
    public void after() {
        System.out.println("Test complete");
    }

    @Test
    @Category({ArchiveApiJob.class, ChannelJobSubset.class})
    public void archiveChanJobSubset() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }

    @Test
    @Category({ArchiveApiJob.class, ChannelJob.class, SlowTests.class})
    public void archiveChanSlow() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }

    @Test
    @Category({RegressionOnlyJob.class, ChannelJobSubset.class})
    public void regressionChan() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }
}
