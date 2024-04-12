package ar.edu.utn.frba.dds;

import java.util.List;

public class Atuendo {
    List<Prenda> prendas;

    public Atuendo(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    public Atuendo generarAtuendo(List <Prenda> prendas){
        return new Atuendo(prendas);
    }
}
