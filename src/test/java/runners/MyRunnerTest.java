package runners;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "summary"
//                , "me.jvt.cucumber.report.PrettyReports:target/Pixel3/cucumber-html-reports"
        }
        , features = {"src/test/resources"}
        , glue = {"stepdef"}
        , snippets = CAMELCASE
        , dryRun=false
        , monochrome=true
        , tags = "@deneme"
)
public class MyRunnerTest {

    // DriverManager sınıfından bir örnek oluşturuyoruz.
//    private static final DriverManager driverManager = new DriverManager();

    @BeforeClass
    public static void initialize() throws Exception {
        // Global parametrelerin yüklenmesi ve ayarlanması için bir örnek oluşturuyoruz.
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        // Loglama için thread bağlamını ayarlıyoruz.
        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());
    }

//    @AfterClass
//    public static void quit() {
//        // Sürücüyü kapatmak için bir işlem çağırıyoruz.
//        driverManager.quitDriver();
//    }
}
