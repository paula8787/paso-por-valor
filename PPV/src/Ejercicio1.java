public class Ejercicio1 {

    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Dentro del método intercambiar: a = " + x + ", b = " + y);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes de llamar a intercambiar: a = " + a + ", b = " + b);
        intercambiar(a, b);
        System.out.println("Después de llamar a intercambiar: a = " + a + ", b = " + b);
    }
}