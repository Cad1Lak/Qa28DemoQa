package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    AlertHelper alertHelper;
    ElementsHelper elementsHelper;
    FormsHelper formsHelper;



    public void start(){
       wd = new ChromeDriver();

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/elements");
        alertHelper =new AlertHelper(wd);
        elementsHelper =new ElementsHelper(wd);
        formsHelper =new FormsHelper(wd);


    }
    public void stop() {

        wd.quit();
    }

    public AlertHelper getAlertHelper() {
        return alertHelper;
    }

    public ElementsHelper getElementsHelper() {
        return elementsHelper;
    }

    public FormsHelper getFormsHelper() {
        return formsHelper;
    }
}
