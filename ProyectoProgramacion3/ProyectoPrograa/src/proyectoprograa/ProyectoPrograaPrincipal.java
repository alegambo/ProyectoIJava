/*
Clase Main
Autor: Alejandro Gamboa Barahona
09/05/2017
 */
package proyectoprograa;

import ProyectoPrograaControl.ControlAplicacion;
import ProyectoPrograaVista.VentanaAplicacion;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alejandro
 */
public class ProyectoPrograaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(()->{mostrar();});
    }
    public static void mostrar(){
        new VentanaAplicacion("Proyecto",new ControlAplicacion()).init();
    
}
}
