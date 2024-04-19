package ar.edu.utn.frba.dds.Prendas;

public class Tipo {
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public CategoriaDePrenda getCategoria() {
        return categoria;
    }

    CategoriaDePrenda categoria;

    public Tipo(String nombre, CategoriaDePrenda categoriaDePrenda) {
        this.nombre = nombre;
        this.categoria = categoriaDePrenda;
    }
}
