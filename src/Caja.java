public class Caja {
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected String etiqueta;
    // Unidad en private para que no exista un método público para modificar la unidad y que se quede la definida en
    // el constructor de Caja
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

    public double getVolumen(){
        double volumenTotal=0;
        if (this.unidad == Unidad.M){
            volumenTotal = this.ancho*this.alto*this.fondo;
            return volumenTotal;
        } else {
            volumenTotal = this.ancho/100*this.alto/100*this.fondo/100;
            return volumenTotal;
        }
    }

    public void setEtiqueta(String etiqueta){
        this.etiqueta=etiqueta;
    }

    @Override
    public String toString() {
        return "La caja tiene de ancho: " + ancho +", de alto: " + alto +", de fondo:" + fondo +
                ", medido en: " + unidad + ", con la etiqueta: " + etiqueta + '.';
    }

}
