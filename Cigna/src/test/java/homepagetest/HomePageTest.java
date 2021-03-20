package homepagetest;

import cignaHomepage.CignaHomepage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    CignaHomepage homepage;

    @BeforeMethod
    public void getInit() {
        homepage = PageFactory.initElements(driver, CignaHomepage.class);
    }


    @Test
    public void testResourcesLink() {
        homepage.checkCoronaVirusResourceLink();
        String expectedText = "Coronavirus (COVID-19) Resource Center | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testMedicareLink() {
        homepage.checkMedicareLink();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testMedicareAdvantageLink() {
        homepage.checkMedicareAdvantageLink();
        String expectedText = "Medicare Advantage Plans (Part C) | Cigna Medicare";
        String actualText = driver.getTitle();
    }


    @Test
    public void testPrescriptionDrug() {
        homepage.checkPrescriptionDrugPlan();
        String expectedText = "Medicare Part D Plans | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testMedicareSupplementInsurance() {
        homepage.checkMedicareSupplementInsurance();
        String expectedText = "Cigna Medicare Supplement Insurance Plans";
        String actualText = driver.getTitle();
    }


    @Test
    public void testEnrollmentAndEligibility() {
        homepage.checkEnrollmentAndEligibility();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
    }


    @Test
    public void testMedicareAdvantageEnrollementAndEligibility() throws InterruptedException {
        homepage.checkMedicareAdvantageEnrollementAndEligibility();
        String expectedText = "Medicare Advantage (Part C) Enrollment and Eligibility | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testMedicareEligibilitySearchBox() throws InterruptedException {
        homepage.checkMedicareAdvantageEnrollementAndEligibility();
        String expectedText = "Cigna - Plan List";
        String actualText = driver.getTitle();
    }


    @Test
    public void testPartDEnrollmentAndEligibility() throws InterruptedException {
        homepage.checkPartDEnrollmentAndEligibility();
        String expectedText = "Medicare Enrollment and Eligibility | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testMedicareSupplementEnrollmentAndEligibility() {
        homepage.checkMedicareSupplementEnrollmentAndEligibility();
        String expectedText = "Medicare Supplement Enrollment and Eligibility | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testEnrollmentAndEligibilityOverviewLink() {
        homepage.checkEnrollmentAndEligibilityOverviewLink();
        String expectedText = "Medicare Enrollment and Eligibility | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testUnderstandingMedicareLink() {
        homepage.checkUnderstandingMedicareLink();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testUnderstandingMedicareOverviewLink() {
        homepage.checkUnderstandingMedicareOverview();
        String expectedText = "Understanding Medicare | Cigna Medicare";
        String actualText = driver.getTitle();
    }


    @Test
    public void testContactUsLink() {
        homepage.checkContactUsLink();
        String expectedText = "Contact Us | Customer Service | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void testMemberResourcesAndEnrollment() {
        homepage.checkMemberResourcesAndServices();
        String expectedText = "Customer Forms | Cigna";
        String actualText = driver.getTitle();
    }


    @Test
    public void textCustomerForms() {
        homepage.checkCustomerForms();
        String expectedText = "Customer Forms | Cigna";
        String actualText = driver.getTitle();
    }

    @Test
    public void textHealthRiskAssessment(){
        homepage.checkHealthRiskAssessment();
        String expectedText = "Health Risk Assessment | Cigna Medicare";
        String actualText = driver.getTitle();
    }
    @Test
    public void testPremiumPaymentOptions(){
        homepage.checkPremiumPaymentOptions();
        String expectedText = "Medicare Premium Payment Options | Cigna";
        String actualText = driver.getTitle();
    }
    @Test
    public void testHealthyAging(){
        homepage.checkhealthyAging();
        String expectedText = "Medicare Disenrollment | Cigna";
        String actualText = driver.getTitle();
    }
    @Test
    public void testDepressionAndMentalHealthLink(){
        homepage.checkDepresiionAndMentalHealthLink();
        String expectedText = "Depression and Mental Health | Cigna Healthy Aging";
        String actualText = driver.getTitle();
    }

}
