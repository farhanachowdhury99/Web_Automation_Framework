package capitalonetest;

import common.WebAPI;
import homepage.CapitalOneHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static homepage.CapitalOneHomePageWebElement.*;

public class HomePageTest extends WebAPI {
    CapitalOneHomePage homepage;
    @BeforeMethod
    public void getInit(){
        homepage= PageFactory.initElements(driver,CapitalOneHomePage.class);
    }


    @Ignore
    @Test
    public void testCommercialLink(){
        homepage.checkCommercialLink();
        String expectedText="Capital One Commercial Banking, Finance, and Investments";
        String actualText=driver.getTitle();
    }

    @Ignore
    @Test
    public void testCommercialAndIndustrialLink(){
        homepage.checkCommercialLink();
        String expectedText="https://www.capitalone.com/commercial/industry-expertise/industrial-manufacturing/";
        String actualText=driver.getTitle();
    }
//    @Test
//    public void testCommercialRealEstateLink(){
//        homepage.checkCommercialRealEstateLink();
//        String expectedText="Related Solutions";
//        String actualText=getTextByXpath(relatedSolutionsLocator);
//    }

//    @Test
//    public void testIndustryExpertiseLink() throws InterruptedException {
//        homepage.checkIndustryExpertiseLInk();
//        String expectedText="https://www.capitalone.com/commercial/industry-expertise/";
//        String actualText=driver.getTitle();
//    }
    @Ignore
    @Test
    public void testCommercialLendingLink(){
        homepage.checkCommercialLending();
        String expectedText="https://www.capitalone.com/commercial/solutions/lending/";
        String actualText=getTextByXpath(relatedSolutionsLocator);
    }
//    @Test
//    public void testDepositoryServicesLink(){
//        homepage.checkDepositoryServicesLink();
//        String expectedText="Tackling B2B Payment Fraud Risk";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testTreasuryManagementLink(){
        homepage.checkTreasuryManagementLink();
        String expectedText="Treasury Management Products and Services | Capital One";
        String actualText=driver.getTitle();
    }

    @Test
    public void testCaitalMarketLinkLink(){
        homepage.checkCapitalMarketLocator();
        String expectedText="Capital Markets, Investments and Financial Advisory | Capital One";
        String actualText=driver.getTitle();
    }














}
