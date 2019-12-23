/*1) Escribir un programa que permita a una persona jugar a las tres en línea (TA-TE-TI) 
con la computadora. Escribir el programa de forma que la computadora pueda ser 
tanto el primero como el segundo jugador. Si la computadora es el primer jugador,
el primer movimiento se generará al azar y el resto mediante una estrategia tiene 
que jugar a ganarle a la persona y tapando las jugadas posibles que realice la persona.
Mostrar el estado del juego tras cada movimiento. La computadora debe avisar cuando gana cada jugador, 
y al final de la sesión de juego, si ha ganado la computadora o la persona.
 */
package tateticeleste;

public class TatetiAutomatico {

    public static void main(String[] args) {
        Seleccion seleccion = new Seleccion();
        seleccion.setVisible(true);

    }

}
