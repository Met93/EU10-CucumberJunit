package cydeoo.pages;

import cydeoo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class GoogleSearchPage {

    //create constructor
    // initialize the driver instance and this class' instance using PageFactory.initElements
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='Tümünü kabul et']")
    public WebElement acceptButton;
    //We can start locating web elements using @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;


//    public WebElement capitalElement(String capital){
//        return Driver.getDriver().findElement(By.linkText(capital));
//    }
    @FindBy(xpath = "//a[@class='FLP8od']")
    public WebElement getCapital;
/*
public String getCapital(){
        return Driver.getDriver().findElement(By.xpath("//a[@class='FLP8od']")).getText();
    }
 */


}
