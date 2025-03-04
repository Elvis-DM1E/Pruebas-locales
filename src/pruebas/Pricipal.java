
package pruebas;


public class Pricipal {
    public static void main(String[] args) {
        System.out.println("Estamos haciendo una prueba, aprendiendo Git");
        
        ComoQuieras.pintarMensaje("Otro mensaje");
        
        Rama1 miRama = new Rama1();
        miRama.escribirMensaje("Practicando con la primera rama");
        
        Rama2 miRama2 = new Rama2();
        miRama.escribirMensaje("Practicando merge con conflictos");
    }
}
