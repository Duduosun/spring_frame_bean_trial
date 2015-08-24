package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by tfasoyiro on 14/08/2015.
 */
public class GridViewPage extends PageObject{

    private String gridViewPageTitle = "Selfridges | Shop Online";

    //Products
    private By productIndexOne = By.className("(productContainer)[0]");
    private By productIndexTwo = By.className("(productContainer)[1]");
    private By productIndexThree = By.className("productContainer[2]");
    private By productIndexFour = By.className("productContainer[3]");
    private By productIndexTen = By.className("productContainer[9]");

    private By productIndexEleven = By.className("(productContainer)[10]");
    private By productIndexSixteen = By.className("productContainer[15]");
    private By productIndexTwentyOne = By.className("productContainer[20]");
    private By productIndexTwentySeven = By.className("productContainer[26]");
    private By productIndexThirty = By.className("productContainer[29]");

    //Product with xpath - private By xProduct = By.xpath("");
    private By xProductOne = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[1]/a[2]");
    private By xProductTwo = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[2]/a[2]");
    private By xProductThree = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[3]/a[2]");
    private By xProductFour = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[4]/a[2]");
    private By xProductFive = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[5]/a[2]");

    private By xProductTen = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[10]/a[2]");
    private By xProductTwelve = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[12]/a[2]");
    private By xProductEighteen = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[18]/a[2]");
    private By xProductTwentyEight = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[28]/a[2]");
    private By xProductThirty = By.xpath("//*[@id='masterContent']/div/div[1]/div/div[30]/a[2]");

    public void clickProduct(String product) {

        switch (product) {
            case "ProductOne": {
                waitForExpectedElement(xProductOne).click();
                break;
            }
            case "ProductTwo": {
                waitForExpectedElement(xProductTwo).click();
                break;
            }
            case "ProductThree": {
                waitForExpectedElement(xProductThree).click();
                break;
            }
            case "ProductFour": {
                waitForExpectedElement(xProductFour).click();
                break;
            }
            case "ProductFive": {
                waitForExpectedElement(xProductFive).click();
                break;
            }
            case "ProductTen": {
                waitForExpectedElement(xProductTen).click();
                break;
            }
            case "ProductTwelve": {
                waitForExpectedElement(xProductTwelve).click();
                break;
            }
            case "ProductEighteen": {
                waitForExpectedElement(xProductEighteen).click();
                break;
            }
            case "ProductTwentyEight": {
                waitForExpectedElement(xProductTwentyEight).click();
                break;
            }
            case "ProductThirty": {
                waitForExpectedElement(xProductThirty).click();
                break;
            }
        }
    }

}
