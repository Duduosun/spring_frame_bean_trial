package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.internal.PackageUtils;

/**
 * Created by tfasoyiro on 24/06/2015.
 */
public class MyAccountPage extends PageObject {

    private String myAccountPageTitle = "My Account";

    private By myAccountBody = By.cssSelector(".customer-account-index.customer-account");
    private By accountInfomationBody = By.cssSelector("customer-account-edit customer-account");
    private By myOrdersBody = By.cssSelector("sales-order-history customer-account");
    private By addressBookBody = By.className("customer-address-index customer-account");
    private By manageCardsBody = By.cssSelector("habitat-general-saved-index customer-account");
    private By giftCardBody = By.cssSelector("enterprise-giftcardaccount-customer-index customer-account");
    private By myWishListBody = By.cssSelector("wishlist-index-index customer-account");
    private By myAccountRHS = By.cssSelector(".my-account");
    private By myAccountLHS = By.cssSelector(".block.block-account");
    private By helloDashboard = By.cssSelector(".hello>strong");
    private By myDashboard = By.cssSelector(".dashboard");
    private By myAccountInformation = By.cssSelector(".main #checkout-welcome");
    private By changePasswordCheckBox = By.cssSelector("#change_password");
    private By currentPassword = By.cssSelector("#current_password");
    private By newPassword = By.cssSelector("#password");
    private By confirmNewPassword = By.cssSelector("#confirmation");
    private By contactInformation = By.cssSelector(".info-box");
    private By manageAddresses = By.cssSelector(".box-head>a");
    private By successAddAddress = By.cssSelector(".success-msg>ul>li");
    private By defaultAddressBlock = By.cssSelector(".col-1.addresses-primary>ol");
    private By additionalAddressBlock = By.cssSelector(".col-2.addresses-additional");
    private By editAddress = By.cssSelector(".main .button.button-secondary");
    private By editBillingAddress = By.xpath(".//*[@id='top']/body/div[3]/div/div[2]/div/div[3]/div/div[2]/div[1]/ol/li[1]/p/a");
    private By editShippingAddress = By.xpath(".//*[@id='top']/body/div[3]/div/div[2]/div/div[3]/div/div[2]/div[1]/ol/li[2]/p/a");

    private By accountDashboard = By.cssSelector(".main .block-content li:nth-child(1) a");
    private By accountInformation = By.cssSelector(".main .block-content li:nth-child(2) a");
    private By myOrders = By.cssSelector(".main .block-content li:nth-child(3) a");
    private By addressBook = By.cssSelector(".main .block-content li:nth-child(4) a");
    private By manageCards = By.cssSelector(".main .block-content li:nth-child(5) a");
    private By giftCard = By.cssSelector(".main .block-content li:nth-child(6) a");
    private By myWishList = By.cssSelector(".main .block-content li:nth-child(7) a");

    public String stringMyAccountPageTitle() {

        return myAccountPageTitle;
    }
    public String stringMyAccountRHS(){
        return waitForExpectedElement(myAccountRHS).getText();
    }
    public String stringUserDashboard(){
        return waitForExpectedElement(helloDashboard).getText();
    }
    public String stringMyAccountInformation(){
        return waitForExpectedElement(myAccountInformation).getText();
    }

    public WebElement webElementContactInformation(){
        return waitForExpectedElement(contactInformation);
    }
    public WebElement webElementManageAddresses(){
        return waitForExpectedElement(manageAddresses);
    }
    public WebElement webElementDefaultAddress(){return waitForExpectedElement(defaultAddressBlock);}
    public WebElement webElementAdditionalAddress(){return waitForExpectedElement(additionalAddressBlock);}

    public void myAccountPageCheck(String menu){
        waitForExpectedElement(myAccountLHS).isDisplayed();
        waitForExpectedElement(myAccountRHS).isDisplayed();
        switch (menu) {
            case "accountDashboard":{
                waitForExpectedElement(myAccountBody).isDisplayed();
                waitForExpectedElement(myDashboard).isDisplayed();
                break;
            }
            case "accountInformation":{
                waitForExpectedElement(accountInfomationBody).isDisplayed();
                break;
            }
            case "myOrders":{
                waitForExpectedElement(myOrdersBody).isDisplayed();
                break;
            }
            case "addressBook":{
                waitForExpectedElement(addressBookBody).isDisplayed();
                break;
            }
            case "manageCards":{
                waitForExpectedElement(manageCardsBody).isDisplayed();
                break;
            }
            case "giftCard":{
                waitForExpectedElement(giftCardBody).isDisplayed();
                break;
            }
            case "myWishlist":{
                waitForExpectedElement(myWishListBody).isDisplayed();
                break;
            }
        }
    }
    public void clickMyAccount(String menu ) {
        switch (menu) {
            case "accountDashboard": {
                waitForExpectedElement(accountDashboard).click();
                break;
            }
            case "accountInformation":{
                waitForExpectedElement(accountInformation).click();
                break;
            }
            case "myOrders":{
                waitForExpectedElement(myOrders).click();
                break;
            }
            case "addressBook":{
                waitForExpectedElement(addressBook).click();
                break;
            }
            case "manageCards":{
                waitForExpectedElement(manageCards).click();
                break;
            }
            case "giftCard":{
                waitForExpectedElement(giftCard).click();
                break;
            }
            case "myWishlist":{
                waitForExpectedElement(myWishList).click();
                break;
            }
        }
    }
    public void deleteFirefoxCookies(){
        webDriver.manage().deleteAllCookies();
    }
    public void clickChangePassword() {
        waitForExpectedElement(changePasswordCheckBox).click(); }
    public void changeUserPassword(String currentpw, String newpw){
        waitForExpectedElement(currentPassword).sendKeys(currentpw);
        waitForExpectedElement(newPassword).sendKeys(newpw);
        waitForExpectedElement(confirmNewPassword).sendKeys(newpw);
    }
    public void defaultDashboard(String fullname, String email){
        waitForExpectedElement(helloDashboard).isDisplayed();
    }
    public void clickEditBillingAddress(){waitForExpectedElement(editBillingAddress).click();}
    public void clickEditShippingAddress(){waitForExpectedElement(editShippingAddress).click();}
}
