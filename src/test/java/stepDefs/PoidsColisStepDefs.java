package stepDefs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import livraison_oiseau.Package;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoidsColisStepDefs {

    Package pack1 = new Package(0.9);
    double charge1 = 1.1;

    @Given("le poids total du colis {Package} avec un poids initial weight1 de 0.1 {double}")
    public void poidsColis() throws Exception {
        throw new PendingException();
    }
    @When("le client charge le colis")
    public void chargeColis() throws Exception {
        double weight1 = pack1.getWeight();
        assertTrue(weight1 != 0);
        throw new PendingException();
    }
    @Then("le poids du colis weight2 {double} sera automatiquement calculé")
    public void calculPoids(double charge1) throws Exception {
        double weight1 = pack1.getWeight();
        double weight2 = weight1 + charge1;
        assertTrue(weight1 != 0);
        throw new PendingException();
    }
}
