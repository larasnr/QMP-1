package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Excepciones.PrendaException;
import ar.edu.utn.frba.dds.Prendas.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrendaTest {
    Prenda prenda = null;
    CategoriaDePrenda calzado;
    Tipo zapatos;
    Color marron;
    Tela jean;



    @BeforeEach
    public void init(){
        calzado = new CategoriaDePrenda("Calzado");
        zapatos = new Tipo("Zapatos",calzado);
        marron = new Color("Marron");
        jean = new Tela("Jean");

    }

    @Test
    public void cargarZapatos(){
        prenda = new Prenda(zapatos,marron,null,null);
        Assertions.assertEquals("Zapatos",prenda.getTipo().getNombre());
    }

    @Test
    public void generarPrendaValida(){
        Assertions.assertDoesNotThrow(() -> { Prenda.generarPrenda(zapatos,marron,null,null);},"Seleccionar color principal");
    }
    @Test
    public void generarPrendaInvalidaColor(){
        Assertions.assertThrows(PrendaException.class,() -> { Prenda.generarPrenda(zapatos,null,null,null);});
    }
    @Test
    public void generarPrendaInvalidaTipo(){
        Assertions.assertThrows(PrendaException.class,() -> { Prenda.generarPrenda(null,marron,null,null);});
    }

    @Test
    public void generarPrendaLisa(){
        Assertions.assertEquals(Trama.LISA, Prenda.generarPrenda(zapatos,marron,null,jean).getTela().getTrama());
    }

    @Test
    public void generarUniforme(){
        //Assertions.assertEquals(Trama.LISA, Prenda.generarPrenda(zapatos,marron,null,jean).getTela().getTrama());
    }


}
