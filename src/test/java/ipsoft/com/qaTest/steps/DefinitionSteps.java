package ipsoft.com.qaTest.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


import ipsoft.com.qaTest.steps.serenity.EndUserSteps;

public class DefinitionSteps {
	
    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikipedia home page")
    public void givenTheUserIsOnTheWikipediaHomePage() {
        endUser.openWiki();
    }

    @When("the user clicks on the English link")
    public void whenTheUserClicksOnTheEnglishLink() {
        endUser.openEnglishLink();
    }

    @Then("they should see articles in '$definition'")
    public void thenTheyShouldSeeArticlesInEnglish(String definition) {
        endUser.seeArticlesInEnglish(definition);
    }

}
