package cnnhomepage;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Ignore;

import java.io.IOException;

import static cnnhomepage.CNNHomePageWebElement.*;

public class CNNHomePage extends WebAPI {

    @FindBy(how = How.CSS, using = searchBoxLocator) public WebElement searchBox;
    @FindBy(how = How.XPATH, using=searchButtonLocator) public WebElement searchButton;
    @FindBy(how = How.XPATH, using=USRadioButtonLocator) public WebElement UsRadioButton;
    @FindBy(how = How.XPATH, using = weatherSearchBoxLocator) public WebElement weatherSearchBox;
    @FindBy(how = How.XPATH, using = weatherCityLocator) public WebElement weatherCity;
    @FindBy(how = How.XPATH, using = getForecastLocator) public WebElement forecastLocator;






    public void checkSearchBox() throws InterruptedException {
        searchBox.sendKeys(searchElement);
        Thread.sleep(3000);
        searchButton.click();
        UsRadioButton.click();
    }

    public void checkWorldNews(){
        clickByXpath(worldNewsLocator);
    }

    public void checkAsiaNewsLink(){
        clickByXpath(worldNewsLocator);
        clickOnElement(asiaNewsLocator);
    }
    public void checkAustraliaLink(){
        checkWorldNews();
        clickOnLink("Australia");
        //clickOnElement(australiasWildfireLocator);
    }
    public void checkMenuBar() throws InterruptedException {
        clickOnElement(menuBarLocator);
        sleepFor(2);
    }
    public void checkSportsLink(){
        clickOnElement(menuBarLocator);
        clickOnElement(sportsNewsLocator);
    }

    public void checkNFLTicketsLocator() throws InterruptedException {
        clickOnElement(menuBarLocator);
        clickOnElement(sportsNewsLocator);
        getTextByXpath(nflLocator);
    }

    public void checkExtremeWeatherLink() throws InterruptedException {
        checkMenuBar();
        clickOnElement(extremeWeatherLocator);
    }

    public void checkWeatherSearchBox() throws InterruptedException {
        checkMenuBar();
        getTextByXpath(extremeWeatherLocator);
        weatherSearchBox.sendKeys(weatherCityLocator);
        forecastLocator.click();
    }



    public void checkWorldFootballLink(){
        checkSportsLink();
        clickOnLink("World Football");
    }
//    public void checkMLSHomeLink(){
//        checkSportsLink();
//        clickOnLink("World Football");
//        mouseHoverByXpath(mlsHomesLocator);
//        getTextByXpath(backtoCNNLocator);
//    }
//    public void checkPremierLeagueLink(){
//        checkWorldFootballLink();
//        mouseHoverByCSS(premiurLeagueLocator);
//    }
//    public void checkChampionLeaguesLocator(){
//        checkSportsLink();
//        clickOnLink("World Football");
//        mouseHoverByCSS(championLeaguesLocator);
//    }

    public void checkCNNLogo(){
        getTextByCss(cnnLogoLocator);
}

    public void checkNBASportsLink(){
        clickOnElement(menuBarLocator);
        clickOnElement(sportsNewsLocator);
        getTextByXpath(nbaLocator);
    }

    public void checkEuropeNewsLink() throws InterruptedException {
        checkMenuBar();
        getTextByXpath(europeNewsLocator);
    }

//    public void checkWorldImage(){
//        clickByXpath(worldImageLocator);
//            }

    public void checkTravelLink() throws InterruptedException {
        checkMenuBar();
        getTextByXpath(travelLocator);
        clickOnLink("Destinations");
        clickOnLink("California");

    }
    public void checkLiveTvLink(){
        clickByXpath(liveTVLocator);
    }


    public void checkChineNewsLink(){
        checkWorldNews();
        clickOnLink("China");
    }
    public void checkAmericasNewsLink() throws InterruptedException {
        checkMenuBar();
        getTextByCss(americasNewsLocator);
        //clickByCss(usnewsLocator);
    }

    public void checkUnitedKingdom() throws InterruptedException {
        checkMenuBar();
        clickByXpath(unitedKingdomNewsLocator);

    }
    public void checkIndiaNewsLocator(){
        checkWorldNews();
        clickOnElement(indiaNewsLocator);
    }
    public void checkMiddleEastNewsLink() throws InterruptedException, IOException {
        checkMenuBar();
        getTextByXpath(middleEastNewsLocator);
        takeScreenShot();
    }




//    public void checkEditionDropDownLink(){
//        clickByLinkText("Edition");
//        getTextByXpath(internationalLocator);
//        clickByXpath(trendingLocator);
//    }

}
