package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.ScheduledExecutorService;

public class HomePageTest extends WebAPI {

    HomePage homepage;
    @BeforeMethod
    public void getInit(){
        homepage= PageFactory.initElements(driver,HomePage.class);
    }

//    @Test(alwaysRun = false) @Ignore
    @Ignore
    @Test
    public void testSearchBox() throws InterruptedException {
//        getInit();
//        call action method by reference variable
        homepage.searchBox();

    }

    @Test (enabled = false)
    public void testSearchBox1() throws InterruptedException {
//        getInit();
//        call action method by reference variable
        homepage.searchBox();
        sleepFor(3);
        String expectedText="\"wipes\"";
        String actualText=homepage.searchText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");

    }

    @Test
    public void testLanguages() throws InterruptedException {
        homepage.checkLanguagesSpanish();
        String expectedText="Amazon.com: eBooks Kindle: Tienda Kindle: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money y más";
        String actualText=driver.getTitle();
    }

    @Test
    public void testRefreshPage(){
        homepage.refreshPage();
        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText=driver.getTitle();
    }

    @Test
    public void testBestSellers(){
        homepage.checkBestSellers();
        String expectedText="Gift Cards";
        String actualText=homepage.bestseller.getText();
    }

    @Test
    public void testCameraAndPhoto(){
        homepage.checkCameraAndPhotoLink();
        String expectedText="Amazon Best Sellers: Best Camcorders";
        String actualText=driver.getTitle();
    }

    @Test
    public void testDSLRCamera(){
        homepage.checkDSLRCameraLink();
        String expectedText="Amazon Best Sellers: Best DSLR Cameras";
        String actualText=driver.getTitle();
    }

    @Test
    public void testAppliancesLink(){
        homepage.checkAppliancesLink();
        String expectedText="Amazon Best Sellers: Best Appliances";
        String actualText=driver.getTitle();
    }
//    @Test
//    public void testDishwashersLink(){
//        homepage.checkDishwashersLink();
//        String expectedText="Amazon Best Sellers: Best Portable Dishwashers";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testCooktopsLink() throws InterruptedException {
        homepage.checkCooktopsLink();
        String expectedText="Amazon Best Sellers: Best Cooktops";
        String actualText=driver.getTitle();
    }

//    @Test
//    public void testFreezersLink(){
//        homepage.checkFreezersLink();
//        String expectedText="Amazon Best Sellers: Best Chest Freezers";
//        String actualText=driver.getTitle();
//    }
//    @Test
//    public void testRefrigeratorsLink(){
//        homepage.checkFreezersLink();
//        String expectedText="Amazon Best Sellers: Best Refrigerators";
//        String actualText=driver.getTitle();
//    }


    @Test
    public void testAutomotiveLink(){
        homepage.checkAutomotiveLink();
        String expectedText="Car care";
        String actualText=homepage.bestseller.getText();
    }

    @Test
    public void testYourGarageLink(){
        homepage.checkyourGarageLink();
        String expectedText="Your Garage: Automotive: Amazon.com";
        String actualText=driver.getTitle();
    }

    @Test
    public void testKindleBooks(){
        homepage.checkKindleBooks();
        String expectedText="Kindle Singles";
        String actualText=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).getText();
    }

    @Test
    public void testRadioButton(){
        homepage.checkRadioButton();
        String expectedText="Amazon.com";
        String actualText=driver.getTitle();
    }

    @Test
    public void testKindleEBooks(){
        homepage.checkkindleEBooks();
        String expectedText="Amazon.com: Deals in Kindle Books";
        String actualText=driver.getTitle();
    }

    @Test
    public void testKindleDailyDeals(){
        homepage.checkKindleDailyDeals();
        String expectedText="Amazon.com: Today's Deals";
        String actualText=driver.getTitle();
    }

    @Test
    public void testKindleMonthlyDeals(){
        homepage.checkKindleMonthlyDeals();
        String expectedText="Amazon.com: Kindle Book Deals for $3.99 or Less";
        String actualText=driver.getTitle();
    }

    @Test
    public void testKindleExclusiveDeals(){
        homepage.checkKindleExclusiveDeals();
        String expectedText="Amazon.com: Kindle Book Deals for $3.99 or Less";
        String actualText=driver.getTitle();
    }

    @Test
    public void testKindleBooksUnder$2Deals(){
        homepage.checkKindleBooksUnder$2();
        String expectedText="Amazon.com: 50 Kindle books for $2 or less";
        String actualText=driver.getTitle();
    }

    @Test
    public void testBeautyAndPersonalCare(){
        homepage.checkBeautyAndPersonalCare();
        String expectedText="Skin Care";
        String actualText=driver.findElement(By.linkText("Skin Care")).getText();
    }

    @Test
    public void testMakeupLink(){
        homepage.checkMakeupLink();
        String expectedText="Amazon Best Sellers: Best Eye Makeup";
        String actualText=driver.getTitle();

    }

    @Test
    public void testGiftSetLink(){
        homepage.checkGiftSetLink();
        String expectedText="Amazon Best Sellers: Best Beauty Gift Sets";
        String actualText=driver.getTitle();
    }

    @Test
    public void textMakeupSetsLink(){
        homepage.checkMakeupSetLink();
        String expectedText="Amazon Best Sellers: Best Makeup Sets";
        String actualText=driver.getTitle();
    }
    @Test
    public void textSkinCareLink() throws InterruptedException {
        homepage.checkSkinCareLink();
        String expectedText="Amazon Best Sellers: Best Body Cleansers";
        String actualText=driver.getTitle();
    }
//    @Test
//    public void testMakeupPaletteLink(){
//        homepage.checkMakeupPalletesLink();
//        String expectedText="Amazon Best Sellers: Best Makeup Palettes";
//        String actualText=driver.getTitle();
//
//    }

    @Test
    public void testFaceMakeupLink(){
        homepage.checkFaceMakeupLink();
        String expectedText="Amazon Best Sellers: Best Face Makeup";
        String actualText=driver.getTitle();
    }

    @Test
    public void testFragranceLink(){
        homepage.checkFragranceLink();
        String expectedText="Amazon Best Sellers: Best Women's Fragrances";
        String actualText=driver.getTitle();
    }

//    @Test
//    public void testDropDown(){
//        homepage.allDeptDropDown();
//        String expectedText="Amazon.com :";
//        String actualText=driver.getTitle();
//    }
//    @Test
//    public void testMenuBar() throws InterruptedException {
//        homepage.checkMenuBar();
//        String expectedText="Toys & Games";
//        String actualText=driver.findElement(By.linkText("Toys & Games")).getText();
//
//    }

    @Test
    public void testAutomotivePartsLink() throws InterruptedException {
        homepage.checkAutomotivePartsLink();
        String expectedText="Amazon.com : Automotive Body Parts & Trim";
        String actualText=driver.getTitle();
    }

    @Test
    public void testNewsstand(){
        homepage.checkNewsstand();
        String expectedText="The New York Times";
        String actualText=driver.findElement(By.linkText("The New York Times")).getText();
    }

    @Test
    public void testNewYorkTimes(){
        homepage.checkNewYorkTimes();
        String expectedText="Amazon.com: The New York Times - Daily Edition for Kindle: Kindle Store";
        String actualText=driver.getTitle();
    }

    @Test
    public void testUSAToday(){
        homepage.checkUSATodayLink();
        String expectedText="Amazon.com: USA TODAY, Paid No-Ads Daily Edition: Kindle Store";
        String actualText=driver.getTitle();
    }

    @Test
    public void testDigitalMegazines(){
        homepage.checkDigitalMegazines();
        String expectedText="Amazon.com: Top Kindle Magazine & Newspaper Deals: Kindle Store";
        String actualText=driver.getTitle();
    }

    @Test
    public void testKindleMegazines(){
        homepage.checkDigitalMegazines();
        String expectedText="Amazon.com: Kindle Newsstand: Kindle Store: Lifestyle & Culture, Men's Interests, Entertainment & Pop Culture & More";
        String actualText=driver.getTitle();
    }








}
