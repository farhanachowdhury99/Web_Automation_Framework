package homepagetest;

import cnnhomepage.CNNHomePage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends WebAPI {


    CNNHomePage homepage;
    @BeforeMethod
    public void getInit(){
        homepage= PageFactory.initElements(driver,CNNHomePage.class);
    }

    @Test
    public void testSearchBox() throws InterruptedException {
        homepage.checkSearchBox();
        String expectedText="US news";
        String actualText=homepage.searchBox.getText();
}

    @Test
    public void testWorldNews(){
        homepage.checkWorldNews();
        String expectedText="Asia";
        String actualText=driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[3]/a")).getText();
    }

    @Test
    public void testAsiaNewsLink(){
        homepage.checkAsiaNewsLink();
        String expectedText="Asia news - breaking news, video, headlines and opinion - CNN";
        String actualText=driver.getTitle();
    }

    @Test
    public void testAustraliaNews(){
        homepage.checkAustraliaLink();
        String expectedText="Australia's wildfires released as much smoke as a massive volcanic eruption, study finds - CNN";
        String actualText=driver.getTitle();
    }

    @Test
    public void testmenuBar() throws InterruptedException {
        homepage.checkMenuBar();
        String expectedText="Search CNN - Videos, Pictures, and News - CNN.com";
        String actualText=driver.getTitle();
    }

    @Test
    public void testSportsLink(){
        homepage.checkSportsLink();
        String expectedText="NFL";
        String actualText=driver.findElement(By.xpath("//*[@id=\"nfl\"]/a")).getText();
    }

    @Test
    public void testNFlTicketsLocator() throws InterruptedException {
        homepage.checkNFLTicketsLocator();
        String expectedText="NFL | Bleacher Report | Latest News, Rumors, Scores and Highlights";
        String actualText=driver.getTitle();
    }

    @Test
    public void testWorldFootballLink(){
        homepage.checkWorldFootballLink();
        String expectedText="World Football | Bleacher Report | Latest News, Rumors, Scores and Highlights";
        String actualText=driver.getTitle();
    }

//    @Test
//    public void testMLSHomeLink(){
//        homepage.checkMLSHomeLink();
//        String expectedText="CNN - Breaking News, Latest News and Videos";
//        String actualText=driver.getTitle();
//    }
//    @Test
//    public void testPremierLeagueLink(){
//        homepage.checkPremierLeagueLink();
//        String expectedText="| Bleacher Report | Latest News, Videos and Highlights";
//        String actualText=driver.getTitle();
//    }
//    @Test
//    public void testChampionLeaguesLocator(){
//        homepage.checkChampionLeaguesLocator();
//        String expectedText="UEFA Champions League | Bleacher Report | Latest News, Videos and Highlights";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testNBASportsLink(){
        homepage.checkNBASportsLink();
        String expectedText="NBA | Bleacher Report | Latest News, Rumors, Scores and Highlights";
        String actualText=driver.getTitle();

    }
//    @Test
//    public void testWorldImage(){
//        homepage.checkWorldImage();
//        String expectedText="China's crackdown in Xinjiang has separated Uyghur children from their parents. CNN found two of them - CNN";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testTravelLink() throws InterruptedException {
        homepage.checkTravelLink();
        String expectedText="California Travel Guide | CNN Travel";
        String actualText=driver.getTitle();
    }
    @Ignore
    @Test
    public void testExtremeWeather() throws InterruptedException {
        homepage.checkExtremeWeatherLink();
        String expectedText="Weather news and local forecast - CNN";
        String actualText=driver.getTitle();
    }
    @Ignore
    @Test
    public void testWeatherSearchBox() throws InterruptedException {
        homepage.checkWeatherSearchBox();
        String expectedText="Warren, MI";
        String actualText=driver.findElement(By.xpath("//*[@id=\"local-forecast \"]/div[6]/div[1]/h2")).getText();
    }



    @Test
    public void testCNNLogo(){
        homepage.checkCNNLogo();
        String expectedText="CNN - Breaking News, Latest News and Videos";
        String actualText=driver.getTitle();
    }

    @Test
    public void testLiveTvLink(){
        homepage.checkLiveTvLink();
        String expectedText="CNNgo – Watch CNN TV live";
        String actualText=driver.getTitle();
    }


    @Test
    public void testEuropeNewsLocator() throws InterruptedException {
        homepage.checkEuropeNewsLink();
        String expectedText="Europe news - breaking news, video, headlines and opinion - CNN";
        String actualText=driver.getTitle();
    }

    @Test
    public void testChinaNewsLink(){
        homepage.checkChineNewsLink();
        String expectedText="China news - breaking news, video, headlines and opinion - CNN";
        String actualText=driver.getTitle();
    }

    @Test
    public void textAmericasNewsLink() throws InterruptedException {
        homepage.checkAmericasNewsLink();
        String expectedText="CNNPolitics - Political News, Analysis and Opinion";
        String actualText=driver.getTitle();
    }

    @Test
    public void testUnitedKingdom() throws InterruptedException {
        homepage.checkUnitedKingdom();
        String expectedText="CNNPolitics - Political News, Analysis and Opinion";
        String actualText=driver.getTitle();
    }

    @Test
    public void testIndiaNewsLink(){
        homepage.checkIndiaNewsLocator();
        String expectedText="India news - breaking news, video, headlines and opinion - CNN";
        String actualText=driver.getTitle();
    }

    @Test
    public void testMiddleEasternLink() throws InterruptedException, IOException {
        homepage.checkMiddleEastNewsLink();
        String expectedText="Middle East news - breaking news, video, headlines and opinion - CNN";
        String actualText=driver.getTitle();
    }





//    @Test
//    public void testEditionDropDown(){
//        homepage.checkEditionDropDownLink();
//        String expectedText="Armie Hammer is under investigation for sexual assault - CNN";
//        String actualText=driver.getTitle();
//    }













}

