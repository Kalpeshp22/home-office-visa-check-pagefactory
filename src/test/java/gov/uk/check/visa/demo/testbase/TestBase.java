package gov.uk.check.visa.demo.testbase;


import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Jay Vaghani
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
