package ar.edu.utn.frba.dds;

public class Prenda {
    Tipo tipo;
    Color colorPrincipal;
    Color colorSecundario;
    Tela tela;

    public Prenda(Tipo tipo, Color colorPrincipal, Color colorSecundario, Tela tela) {
        this.tipo = tipo;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.tela = tela;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Tela getTela() {
        return tela;
    }
}
