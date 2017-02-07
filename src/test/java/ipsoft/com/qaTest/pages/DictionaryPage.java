package ipsoft.com.qaTest.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.wikipedia.org/")
public class DictionaryPage extends PageObject {
	
	@FindBy(id="js-link-box-en")
	private WebElementFacade englishLink;
    
    public void clickEnglish(){
    	englishLink.click();
    }

    public String findTheWordEnglish() {
        WebElementFacade divElement = find(By.id("articlecount"));
        String word = divElement.findElement(By.xpath("//a[@href='/wiki/English_language']")).getText();
        return word;
    }
    
}