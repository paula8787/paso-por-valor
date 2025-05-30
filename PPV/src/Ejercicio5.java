public class Ejercicio5 {
        public static void modificarCadena(String texto) {
            texto = texto.toUpperCase(); 
            System.out.println("Dentro del método modificarCadena: " + texto);
        }
    
        public static void main(String[] args) {
            String mensaje = "Hola, Paula";
    
            System.out.println("Antes de llamar a modificarCadena: " + mensaje);
            modificarCadena(mensaje);
            System.out.println("Después de llamar a modificarCadena: " + mensaje);
        }
    }