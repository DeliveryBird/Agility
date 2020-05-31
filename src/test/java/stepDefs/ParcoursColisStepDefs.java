package stepDefs;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java8.Pa;
import livraison_oiseau.Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParcoursColisStepDefs {

    Package pack1 = new Package(0.9);
    Package pack2 = new Package();
    Package pack3= new Package();
    Package pack4= new Package();
    Package p ;

    Iterator<Package> i = pack1.createIterator();



    @Given("Un colis contient d'autres colis")
    public void EmpilageColis() throws Exception {
        pack1.add(pack2);
        pack1.add(pack3);
        pack2.add(pack4);

        assertTrue(!pack1.getChildren().isEmpty());

    }
    @When("le vendeur parcourt la composition de son colis <pack1>")
    public void chargeColis() throws Exception {
        List<Package> liste= Arrays.asList(pack2,pack3,pack4);
        int indice=0;
        while(i.hasNext()){
            p=i.next();
        }
        assertTrue(p.equals(liste.get(indice)));
        indice++;
    }
    @Then("trouver facilement les colis lors de la livraison")
    public void c() throws Exception {
    }
}
