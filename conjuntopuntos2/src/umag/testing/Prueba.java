/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.testing;

import javax.swing.JOptionPane;
import umag.datos.FormulaDistancia2P;
import umag.datos.Punto;

/**
 *
 * @author Breiner
 */
public class Prueba {
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(5, 3);
        FormulaDistancia2P formula = new FormulaDistancia2P();
        float distanciaEntre2P = formula.formula(p1, p2);
        
        JOptionPane.showMessageDialog(null,"La distancia entre estos puntos es: "+distanciaEntre2P);
    }
}
