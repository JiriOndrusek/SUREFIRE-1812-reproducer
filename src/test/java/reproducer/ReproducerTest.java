package reproducer;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

@QuarkusTest
@EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = ".+")
class eproducerTest {

    @Test
    public void test() {
        //always successful
    }

}
