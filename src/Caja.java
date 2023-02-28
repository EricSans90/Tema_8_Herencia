public class Caja {
    private int ancho;
    private int alto;
    private int fondo;
    private String etiqueta;
    private Unidad unidad;

    Caja (int ancho, int alto, int fondo, Unidad unidad){
        this.ancho=ancho;
        this.alto=alto;
        this.fondo=fondo;
        if (unidad == Unidad.CM || unidad == Unidad.M){
            this.unidad=unidad;
        } else {
            System.out.println("Unidad de medida incorrecta");
        }
        this.etiqueta="";
    }

    double getVolumen(){
        double volumenTotal=0;
        if (this.unidad == Unidad.M){
            volumenTotal = this.ancho*this.alto*this.fondo;
            return volumenTotal;
        } else {
            volumenTotal = this.ancho/100*this.alto/100*this.fondo/100;
            return volumenTotal;
        }
    }

    void setEtiqueta(String etiqueta){
        this.etiqueta=etiqueta;
    }

    @Override
    public String toString() {
        return "La caja tiene de ancho: " + ancho +", de alto: " + alto +", de fondo:" + fondo +
                ", medido en: " + unidad + ", con la etiqueta: " + etiqueta + '.';
    }

}
