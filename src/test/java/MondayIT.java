import framework.ArchiveApiJob;
import framework.ChannelJob;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.concurrent.ThreadLocalRandom;

/**
 * These are all archive tests. They are also channel tests.
 */
@Category({ArchiveApiJob.class, ChannelJob.class})
public class MondayIT {
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
    public void archiveChanTest1() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }

    @Test
    public void archiveChanTest2() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }

    @Test
    public void archiveChanTest3() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }

    @Test
    public void archiveChanTest4() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        Thread.sleep(ThreadLocalRandom.current().nextLong(minTestTimeMillis, maxTestTimeMillis));
    }
}
