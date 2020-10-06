package parentTest;

import libs.Actions;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver;
    protected AuthorizationPage authorizationPage;
    protected Actions actions;
    protected MainPage mainPage;
    protected NewsPageAll newsPageAll;
    protected CreateNewPublicationPage createNewPublicationPage;
    protected LoremIpsum loremIpsum;
    protected NewsPage newsPage;
    protected ArticlesPageAll articlesPageAll;
    protected InterviewPageAll interviewPageAll;
    protected GridSliderPageEdit gridSliderPageEdit;
    protected PhotogallaryPageAll photogallaryPageAll;
    protected PhotogallaryPageAlbum photogallaryPageAlbum;
    protected CreateNewFeedback_Page_MainModerator createNewFeedback_Page_MainModerator;
    protected ViewListOfFeedbacks_Page_MainModerator viewListOfFeedbacks_page_mainModerator;



    @Before
    public void setUp() throws InterruptedException {
        File driver = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", driver.getAbsolutePath());

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        authorizationPage = new AuthorizationPage(webDriver);
        actions = new Actions(webDriver);
        mainPage = new MainPage(webDriver);
        newsPageAll = new NewsPageAll(webDriver);
        createNewPublicationPage = new CreateNewPublicationPage(webDriver);
        loremIpsum = new LoremIpsum(webDriver);
        newsPage = new NewsPage(webDriver);
        articlesPageAll = new ArticlesPageAll(webDriver);
        interviewPageAll = new InterviewPageAll(webDriver);
        gridSliderPageEdit = new GridSliderPageEdit(webDriver);
        photogallaryPageAll = new PhotogallaryPageAll(webDriver);
        photogallaryPageAlbum = new PhotogallaryPageAlbum(webDriver);
        createNewFeedback_Page_MainModerator = new CreateNewFeedback_Page_MainModerator(webDriver);
        viewListOfFeedbacks_page_mainModerator = new ViewListOfFeedbacks_Page_MainModerator(webDriver);

//        authorizationPage.authorization();
    }

    @After
    public void tearDown(){
        //webDriver.quit();
    }
}
