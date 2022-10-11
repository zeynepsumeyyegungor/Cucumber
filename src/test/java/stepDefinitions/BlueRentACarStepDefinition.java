package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentACarStepDefinition {
    BrcPage brcPage = new BrcPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.brclogin.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.userEmail.sendKeys("gecersiz@gmail.com",Keys.TAB);
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        actions.sendKeys("gecersizsifre8888").perform();
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        actions.sendKeys(Keys.TAB,Keys.ENTER);
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
