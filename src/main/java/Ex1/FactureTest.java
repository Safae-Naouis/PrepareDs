package Ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactureTest {
    Facture facture;
    @Before
    public void setUp() {
        this.facture = new Facture();
    }
    @After
    public void tearDown() {
        facture = null;
    }
    @Test
    public void testgetFraisTransport(){
        assertEquals(45, facture.getFraisTransport(200), 0);
        assertEquals(0, facture.getFraisTransport(600), 0);
        if (facture.getFraisTransport(700)!=0)
            fail("faux pour un montant qui dépasse 600");
        if (facture.getFraisTransport(200)!=45)
            fail("faux pour un montant qui ne dépasse pas 600");

    }

}
