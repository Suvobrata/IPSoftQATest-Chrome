package ipsoft.com.qaTest.steps.serenity;

import ipsoft.com.qaTest.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@SuppressWarnings("serial")
public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;
    
    @Step
    public void openEnglishLink(){
    	dictionaryPage.clickEnglish();
    }

    @Step
    public void seeArticlesInEnglish(String definition) {
    	assertThat(dictionaryPage.findTheWordEnglish(),containsString(definition));
    }

    @Step
    public void openWiki() {
        dictionaryPage.open();
    }

}