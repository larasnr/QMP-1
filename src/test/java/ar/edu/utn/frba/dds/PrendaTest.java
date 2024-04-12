package ar.edu.utn.frba.dds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrendaTest {
    Prenda prenda = null;
    CategoriaDePrenda calzado;
    Tipo zapatos;
     Color marron;
    @BeforeEach
    public void init(){
        calzado = new CategoriaDePrenda("Calzado");
        zapatos = new Tipo("Zapatos",calzado);
    }

    @Test
    public void cargarZapatos(){
        prenda = new Prenda(zapatos,marron,null,null);
        Assertions.assertEquals("Zapatos",prenda.getTipo().nombre);
    }
}
