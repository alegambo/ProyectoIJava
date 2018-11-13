/*
Clase Control, reliza el enlace entre el modelo y la ventana, llena el contenedor de valores y envía mensajes.
Autor: Alejandro Gamboa Barahona
09/05/2017
 */
package ProyectoPrograaControl;

import ProyectoPrograaModelo.Contenedor;
import java.util.Observer;
import java.util.Vector;

/**
 *
 * @author Alejandro
 */
public class ControlAplicacion {
    public ControlAplicacion(){
    this(new Contenedor()); 
    }
    public ControlAplicacion(Contenedor nuevosDatos){
    modelo= nuevosDatos;
    }
    public void registrarObservador(Observer v){
    modelo.addObserver(v);
    }
    public void mensajeMasPartido(){
    modelo.mensajeMasPartido();
    }
    public void mensajeMenosPartido(){
    modelo.mensajeMenosPartido();
    }
    public void mensajeMasCurules(){
    modelo.mensajeMasCurules();
    }
    public void mensajeMenosCurules(){
    modelo.mensajeMenosCurules();
    }
    public void llenandoContainer(int x){
       for(int i=0;i<x;i++){
           contenedor1.addElement(new Contenedor());
           
       }
    }
    public Vector<Contenedor> obtenerContainer(){
    return contenedor1;
    }
    public void generarContainer(int y){
    contenedor1 = new Vector<>(y);
    }
    public void setearValor(int pos, String[] fila){
    contenedor1.elementAt(pos-1).setValor(Integer.parseInt(fila[pos]));
    }
    
   public void agregarValor(int pos,int value){
   contenedor1.elementAt(pos-1).setValor(value);
   }
   private Contenedor modelo;
   public Vector<Contenedor> contenedor1;
}  
    

