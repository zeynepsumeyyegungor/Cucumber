package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guruPage = new GuruPage();
    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("kullanici {string} sutunundaki tum degerleri yazdirir")
    public void kullaniciSutunundakiTumDegerleriYazdirir(String baslik) {
        int index = 0;
        for (int i = 0; i < guruPage.basliklar.size(); i++) {
            if(guruPage.basliklar.get(i).getText().equals(baslik)){
                System.out.println(guruPage.basliklar.get(i).getText());
                index = i+1;
                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("(//tbody)[2]//tr//td["+index+"]")); //
                sutunElement.forEach(t-> System.out.println(t.getText()));

                //for (WebElement w:sutunElement) {
                //    System.out.println(w.getText());
                //}

            }
        }
    }
}