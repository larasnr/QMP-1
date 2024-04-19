package ar.edu.utn.frba.dds.Prendas;

public class Tela {
    public Tela(String nombre) {
        this.nombre = nombre;
    }

    String nombre;
    Trama trama;

    public Trama getTrama() {
        return trama;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }
}
