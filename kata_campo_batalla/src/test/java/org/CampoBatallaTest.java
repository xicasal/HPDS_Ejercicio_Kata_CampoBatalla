package org;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CampoBatallaTest {
    private CampoBatalla campoBatalla;

    @Before
    public void init(){
        campoBatalla = new CampoBatalla();
    }

    @Test
    public void test_no_bombs(){
        assertEquals("abdefghijk", campoBatalla.supervivientes("abde[fgh]ijk"));
    }

    @Test
    public void test_letras_fuera_del_refugio_mueren(){
        assertEquals("fgh", campoBatalla.supervivientes("ab#de[fgh]ijk"));
    }

    @Test
    public void test_todas_las_letras_mueren_dos_bombas(){
        assertEquals("", campoBatalla.supervivientes("ab#de[fgh]ij#k"));
        assertEquals("", campoBatalla.supervivientes("a##bde[fgh]ijk"));
    }
}
