package ar.edu.utn.frba.dds.Prendas;

import ar.edu.utn.frba.dds.Excepciones.PrendaException;

import static ar.edu.utn.frba.dds.Prendas.Trama.LISA;

public class Prenda {
    Tipo tipo;
    Color colorPrincipal;
    Color colorSecundario;
    Tela tela;
    Boolean esBorrador;

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

    public void setEsBorrador(Boolean esBorrador) {
        this.esBorrador = esBorrador;
    }

    public static void validarMaterial(Tela tela){
        if(tela != null){
            if(tela.trama == null){
                tela.setTrama(Trama.LISA);
            }
        }
    }

    public static String validarPrenda(Tipo tipo,Tela tela,Color colorPrincipal){
        String mensaje = null;
        if(tipo != null){
            if(colorPrincipal != null){
                validarMaterial(tela);
            }
            else{
                System.out.print("color 2 = "+colorPrincipal);
                mensaje = "Seleccionar color principal";
        }
        }else{
            mensaje = "Seleccionar tipo";
        }
        return mensaje;
    }
    static public Prenda generarPrenda(Tipo tipo, Color colorPrincipal, Color colorSecundario, Tela tela) {
        String resultado = validarPrenda(tipo,tela,colorPrincipal);
        if( resultado == null){
            return new Prenda(tipo,colorPrincipal,colorSecundario,tela);
        }
        throw new PrendaException(resultado);
    }

    public Prenda guardarBorrador(Tipo tipo, Color colorPrincipal, Color colorSecundario, Tela tela){
        Prenda prenda =  new Prenda(tipo,colorPrincipal,colorSecundario,tela);
        prenda.setEsBorrador(true);
        return prenda;
    }
}
