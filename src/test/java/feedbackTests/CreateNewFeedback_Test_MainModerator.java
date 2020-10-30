package feedbackTests;

import org.junit.Test;
import parentTest.ParentTest;

public class CreateNewFeedback_Test_MainModerator extends ParentTest {

    @Test
    public void createNewFeedback_Portal_Management_MH() throws InterruptedException {

        authorizationPage.authorization("dev-testuser12@dev.lizard.net.ua","Pa$$w0rd");
        mainPage.navigateToCreateNewFeedbackPage();
        createNewFeedback_Page_MainModerator.choose_CommunicationChannelField();
        createNewFeedback_Page_MainModerator.choose_TopicField();
        createNewFeedback_Page_MainModerator.enterTextInTo_AppealField("test" + actions.currentTime());
        createNewFeedback_Page_MainModerator.clickOnSendBtn();
        viewListOfFeedbacks_page_mainModerator.closePopUpFeedbackCreated_And_RememberFeedbackNumber();
    }

    @Test
    public void createNewFeedbackFromFeedbackList() throws InterruptedException {
        authorizationPage.authorization("dev-testuser12@dev.lizard.net.ua","Pa$$w0rd");
        mainPage.navigateVievListOfFeedbacksPage();
        viewListOfFeedbacks_page_mainModerator.clickOnCreateBtn();
        createNewFeedback_Page_MainModerator.choose_CommunicationChannelField();
        createNewFeedback_Page_MainModerator.choose_TopicField();
        createNewFeedback_Page_MainModerator.enterTextInTo_AppealField("test" + actions.currentTime());
        createNewFeedback_Page_MainModerator.clickOnSendBtn();
        viewListOfFeedbacks_page_mainModerator.closePopUpFeedbackCreated_And_RememberFeedbackNumber();
    }

    //need to add ER - feedback visible in FAQ
    @Test
    public void openFeedbackInFAQ () throws InterruptedException {
        authorizationPage.authorization("dev-testuser12@dev.lizard.net.ua","Pa$$w0rd");
        mainPage.navigateToCreateNewFeedbackPage();
        createNewFeedback_Page_MainModerator.openTopicProductFAQ();
        createNewFeedback_Page_MainModerator.openLastFeebbackInTopicProductFAQ();
      //feedback visible in FAQ


    }

}
