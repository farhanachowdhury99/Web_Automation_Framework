package homepage;

import common.WebAPI;
import static homepage.CapitalOneHomePage.*;
import static homepage.CapitalOneHomePageWebElement.*;

public class CapitalOneHomePage extends WebAPI {

    public void checkCommercialLink(){
        getTextByXpath(commercialLocator);
    }
    public void checkCommercialAndIndustrialLink(){
        checkCommercialLink();
        mouseHoverByXpath(commercialAndIndustrialLocator);
    }

//    public void checkCommercialRealEstateLink(){
//        getTextByXpath(commercialLocator);
//        mouseHoverByXpath(commercialRealEstateLocator);
//    }
//
//    public void checkIndustryExpertiseLInk() throws InterruptedException {
//
//        clickByXpath(industryExpertiseLocator);
//    }

    public void checkCommercialLending(){
        checkCommercialLink();
        getTextByXpath(commercialLendingLocator);
    }

//    public void checkDepositoryServicesLink(){
//        checkCommercialLink();
//        clickByLinkText("Depository Services");
//        clickByXpath(businessPaymentSecurityLocator);
//    }

    public void checkTreasuryManagementLink(){
        checkCommercialLink();
        clickByXpath(treasuryManagementLocator);
    }
    public void checkCapitalMarketLocator(){
        checkCommercialLink();
        getTextByXpath(capitalMarketLocator);
    }



}
