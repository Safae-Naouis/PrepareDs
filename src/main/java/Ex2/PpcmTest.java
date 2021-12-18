package Ex2;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PpcmTest {
    Ppcm p;
    @Before
    public void setUp() {
        this.p = new Ppcm();
    }
    @After
    public void tearDown() {
        p = null;
    }
    @Test
    public void testPpcm() {
        assertEquals(72, p.ppcm(8, 9));
        assertEquals(63, p.ppcm(9, 7));
        //assertEquals(0, p.ppcm(0, 7));
    }
    @Ignore
    @Test
    public void testPpcm3(){
        try{
            p.ppcm(0,8);
            fail("ehoooo");
        }catch(ArithmeticException e){}
    }
    @Test(expected = ArithmeticException.class)
        public void testPpcm1(){
           p.ppcm(0,0);

        }
    }

