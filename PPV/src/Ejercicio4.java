public class Ejercicio4 {
        public static int incrementar(int x) {
            x += 1;
            System.out.println("Dentro del método incrementar: x = " + x);
            return x;
        }
    
        public static void main(String[] args) {
            int x = 5;
    
            System.out.println("Antes de llamar a incrementar: x = " + x);
            incrementar(x);
            System.out.println("Después de llamar a incrementar (sin asignación): x = " + x);
    
            x = incrementar(x);
            System.out.println("Después de llamar a incrementar (con asignación): x = " + x);
        }
    }

