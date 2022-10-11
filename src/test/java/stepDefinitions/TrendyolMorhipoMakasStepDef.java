package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendyolMorhipoPage;
import utilities.Driver;

import java.util.List;

public class TrendyolMorhipoMakasStepDef {
    TrendyolMorhipoPage trendyolMorhipoPage;
    Actions actions;
    @Given("www.google.com adresine gider")
    public void wwwGoogleComAdresineGider() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @Then("googleda trendyol aratir")
    public void googledaTrendyolAratir() {
        trendyolMorhipoPage = new TrendyolMorhipoPage();
        trendyolMorhipoPage.googleSearchBox.sendKeys("trendyol", Keys.ENTER);
    }

    @And("trendyol linkini bulup siteye gider")
    public void trendyolLinkiniBulupSiteyeGider() {
        trendyolMorhipoPage.trendyolFirstLink.click();
    }

    @Then("Trendyol'da makas aratir")
    public void trendyolDaMakasAratir() {
        trendyolMorhipoPage.trendyolCokieAccept.click();
        trendyolMorhipoPage.trendyolSearchBox.sendKeys("makas",Keys.ENTER);
    }

    @And("Bulunan toplam urun sayisini kaydeder")
    public void bulunanToplamUrunSayisiniKaydeder() {
        String[] sonucText = trendyolMorhipoPage.trendyolMakasResult.getText().split(" ");
        int trendyolResaultCount = Integer.parseInt(sonucText[3]);
        String trendyolWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println("trendyolResaultCount = " + trendyolResaultCount);
        System.out.println("trendyolWindowHandle.toString() = " + trendyolWindowHandle.toString());

    }

    @Then("Ayni browser'da yeni sekmede www.morhipo.com adresine gider")
    public void ayniBrowserDaYeniSekmedeWwwMorhipoComAdresineGider() {
        actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL).sendKeys("t").perform();
    }

    @Then("morhipo'da makas aratir")
    public void morhipoDaMakasAratir() {
    }

    @And("iki sitedeki toplam makas sayisini karsilastirir")
    public void ikiSitedekiToplamMakasSayisiniKarsilastirir() {
    }

    @And("Once urun sayisi fazla olan sekmeyikapatir")
    public void onceUrunSayisiFazlaOlanSekmeyikapatir() {
    }

    @Then("Sonra diger sekmeyi kapatir")
    public void sonraDigerSekmeyiKapatir() {
    }


}
