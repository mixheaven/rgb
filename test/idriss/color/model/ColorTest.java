package idriss.color.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    private Color color;

    @BeforeEach
    public void setUp()  {
        color = new Color(12, 108, 17 );
    }

    @Test
    public void colorTestException(){
        assertThrows(IllegalArgumentException.class, () -> new Color(-1, 320, 2128));
    }
    @Test
    public void testGetRed(){
        assertEquals(12, color.getRed());
    }
    @Test
    public void contructeurHexa(){
        assertThrows(IllegalArgumentException.class, () -> new Color("#D58D35"));
    }
    @Test
    public void colorHexaValueFirstCharTestException(){
        assertThrows(IllegalArgumentException.class, () -> new Color("@heueud"));
    }
    @Test
    public void colorHexaValueOtherCharTestExecption(){
        assertThrows(IllegalArgumentException.class, () -> new Color("#00ji00" ));
    }
    @Test
    public void testSetRed(){
        color.setRed(225);
        assertAll("l'objet de couleur",
                () -> assertEquals(225, color.getRed(), "getRed() ne marche pas"),
                () -> assertEquals(108, color.getGreen(), "getGreen() ne marche pas "),
                () -> assertEquals(17, color.getBlue(), "getBlue() ne marche pas"),
                () -> assertEquals("#0C6C11", color.getHexValue(), "getHexValue() ne marche pas")
        );
    }

    @Test
    public void testGetGreen() {
        assertEquals(108, color.getGreen());
    }
    @Test
    public void testSetGreen(){
        color.setGreen(225);
        assertAll("l'objet de couleur",
                () -> assertEquals(12, color.getRed(), "getRed() ne marche pas"),
                () -> assertEquals(225, color.getGreen(), "getGreen() ne marche pas "),
                () -> assertEquals(17, color.getBlue(), "getBlue() ne marche pas"),
                () -> assertEquals("#0C6C11", color.getHexValue(), "getHexValue() ne marche pas")
        );
    }
    @Test
    public void testGetBlue() {
        assertEquals(17, color.getBlue());
    }
    @Test
    public void testSetBlue(){
        color.setBlue(225);
        assertAll("l'objet de couleur",
                () -> assertEquals(12, color.getRed(), "getRed() ne marche pas"),
                () -> assertEquals(108, color.getGreen(), "getGreen() ne marche pas "),
                () -> assertEquals(225, color.getBlue(), "getBlue() ne marche pas"),
                () -> assertEquals("#0C6C11", color.getHexValue(), "getHexValue() ne marche pas")
        );
    }
    @Test
    public void testGetHexValue(){
        assertEquals("#0C6C11", color.getHexValue());
    }
    @Test
    public void testSetHexValue(){
        color.setHexValue("#800000");
        assertEquals("#800000", color.getHexValue(), "getHexaValue() ne fonctionne pas");
    }
    @Test
    public void testToString(){
        color.toString();
        assertEquals("Couleur hexadécimal : #0C6C11, couleur bleu : 17, couleur vert : 108, couleur rouge : 12", color.toString(),"toString() est incorrect");
    }

    @AfterEach
    public void tearDown(){
        color = null;
    }
}
