package stepDefs;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java8.Pa;
import livraison_oiseau.Package;

<<<<<<< HEAD
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
=======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

>>>>>>> 83652f84d29e63074536b7eb8481058d59986d36
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParcoursColisStepDefs {

    Package pack1 = new Package(0.9);
    Package pack2 = new Package();
    Package pack3= new Package();
    Package pack4= new Package();
<<<<<<< HEAD
    Package p = new Package();
    Package lastPackage = new Package();

    Iterator<Package> i;
=======
    Package p ;

    Iterator<Package> i = pack1.createIterator();
>>>>>>> 83652f84d29e63074536b7eb8481058d59986d36



    @Given("Un colis contient d'autres colis")
<<<<<<< HEAD
    public void empilageColis() throws Exception {
            pack1.add(pack2);
            pack1.add(pack3);
            i = pack1.createIterator();
            pack2.add(pack4);

            assertTrue(!pack1.getChildren().isEmpty());
    }
    @When("le vendeur parcourt la composition de son colis <pack1>")
    public void chargeColis() throws Exception {
            ArrayList<Package> list = new ArrayList<>();
            list.add(pack2);
            list.add(pack3);
            list.add(pack4);
            Iterable<Package> iterator = list;

            for (Package pe : iterator) lastPackage = pe;
            while (i.hasNext())
                p= i.next();

        }
    @Then("trouver facilement les colis lors de la livraison")
    public void c() throws Exception {
        assertFalse(p.equals(lastPackage));
=======
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
>>>>>>> 83652f84d29e63074536b7eb8481058d59986d36
    }
}
