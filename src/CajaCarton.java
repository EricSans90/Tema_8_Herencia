public class CajaCarton extends Caja{
    private Unidad unidad = Unidad.CM;

    CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM);
        if (this.unidad != Unidad.CM) {
            System.out.println("La unidad de medida de la caja de cartón debe ser en centímetros (CM)");
        }
    }
    @Override
    public double getVolumen(){
        double volumenTotal=0;
            volumenTotal = super.getVolumen();
            return 0.8*volumenTotal;
        }

    // miramos la cantidad de cartón que necesitamos en una CajaCarton en centímetros cuadrados
    public double getSuperficie(){
        double areaBase = this.ancho * this.fondo;
        double areaLateral1 = this.ancho * this.alto;
        double areaLateral2 = this.fondo * this.alto;
        return 2*(areaBase+areaLateral1+areaLateral2);
    }
    /*Si en vez de protected en Caja hubiésemos usado private tendríamos que haber hecho esto:
    * En la clase Caja:
    * public double getSuperficie() {
        double areaBase = this.ancho * this.fondo;
        double areaLateral1 = this.ancho * this.alto;
        double areaLateral2 = this.fondo * this.alto;
        return 2 * areaBase + areaLateral1 + areaLateral2;
    }
}
    * y en la clase CajaCartón:
    * @Override
    public double getSuperficie() {
        double superficie = super.getSuperficie();
    * */
}

