class Rectangulo {
    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void mostrar() {
        System.out.println("Rectángulo -> Ancho: " + ancho + ", Alto: " + alto);
    }
}

public class Ejercicio2 {

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho *= 2;
        r.alto *= 2;
        System.out.println("Dentro del método modificarRectangulo:");
        r.mostrar();
    }

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(5, 10);

        System.out.println("Antes de modificar:");
        miRectangulo.mostrar();

        modificarRectangulo(miRectangulo);

        System.out.println("Después de modificar:");
        miRectangulo.mostrar();
    }
}
