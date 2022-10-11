package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolMorhipoPage {
    public TrendyolMorhipoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleSearchBox;

    @FindBy (xpath = "(//div[@class='TbwUpd NJjxre'])[1]")
    public WebElement trendyolFirstLink;

    @FindBy (xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement trendyolCokieAccept;

    @FindBy (xpath = "//input[@class='vQI670rJ']")
    public WebElement trendyolSearchBox;

    @FindBy (xpath = "//div[@class='dscrptn']")
    public WebElement trendyolMakasResult;



}
