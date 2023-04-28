package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {

    public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu1;

    @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginButonu;

    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement basariliGirisElementi;

    @FindBy(xpath = "//div[@class='icon']")
    public WebElement basariliGirisElementi1;


    @FindBy(xpath = "//a[.='Accept']")
    public WebElement cookies;


    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement cookieaccept1;
}






