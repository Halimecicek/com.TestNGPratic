package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TripadvisorPage {
    public TripadvisorPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="(//input[@title='Search'])[2]")
    public WebElement AramaKutusu;

    @FindBy(xpath ="(//span[@class='title-match'])[1]" )
    public WebElement sonucYaziElementi;
}
