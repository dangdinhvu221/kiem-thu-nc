import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AllTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AllTests.class);

        for (Failure failure: result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("run test: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}
