package ar.edu.utn.frba.dds.Prendas;

public class Uniforme {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;

    public Uniforme(){
        this.prendaSuperior.tipo.categoria = new CategoriaDePrenda("Parte Superior");
        this.prendaInferior.tipo.categoria = new CategoriaDePrenda("Parte Inferior");
        this.calzado.tipo.categoria = new CategoriaDePrenda("Calzado");
    }

    public Prenda getPrendaSuperior() {
        return prendaSuperior;
    }

    public Prenda getPrendaInferior() {
        return prendaInferior;
    }

    public Prenda getCalzado() {
        return calzado;
    }
}
