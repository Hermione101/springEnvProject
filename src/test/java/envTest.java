import com.sample.common.apiUtility;
import com.sample.common.envconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = {"classpath:/ApplicationContext.xml"})
public class envTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private envconfig config;

    @Test
    public void testValueLoaded(){
        apiUtility apiUtil = new apiUtility(config);
        apiUtil.printUrl();
    }


}
