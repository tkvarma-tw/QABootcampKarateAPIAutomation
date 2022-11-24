package TestRunners;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllTest {
    @Test
    public void RunAllTests() {
        Results results = Runner.path("classpath:").parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}
