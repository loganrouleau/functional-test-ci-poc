import framework.ArchiveApiJob;
import framework.ChannelJob;
import framework.ChannelJobSubset;
import framework.Roster;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This class is a mess, there are all sorts of tests in here.
 */
public class TuesdayIT {
    private Long minTestTimeMillis = 1000L;
    private Long maxTestTimeMillis = 2000L;

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
    @Category({ArchiveApiJob.class, ChannelJob.class, Roster.class})
    public void archiveChanRoster() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }

    @Test
    @Category({Roster.class, ChannelJobSubset.class})
    public void chanJobSubsetRoster() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }

    @Test
    @Category({Roster.class, ChannelJobSubset.class, ArchiveApiJob.class})
    public void archiveChanJobSubsetRoster() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }

    @Test
    @Category({ChannelJob.class, ArchiveApiJob.class})
    public void archiveChan() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }
}
