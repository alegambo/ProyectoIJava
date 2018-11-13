/*
 Clase Contenedora, guarda el dato de votos y de curules ganadas.
Autor: Alejandro Gamboa Barahona
09/05/2017
 */
package ProyectoPrograaModelo;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alejandro
 */
public class Contenedor extends Observable {
    public Contenedor(){
    this.valor=0;
    this.curulesGanadas=0;
    }
    public int getValor(){
    return valor;
    }
    public void setValor(int valor){
    this.valor=valor;
    }
    public int getCurulesGanadas(){
    return curulesGanadas;
    }
    public void setCurulesGanadas(int CurulesGanadas){
    this.curulesGanadas=CurulesGanadas;
    }
    public int aumentoGane(){
    return curulesGanadas++;
    }
    public int decrementoGane(){
    return curulesGanadas--;
    }
    public void actualizar(Object msj){
    setChanged();
    notifyObservers(msj);
    }
    @Override
    public void addObserver(Observer o){
    super.addObserver(o);
    setChanged();
    notifyObservers();
    }
    public void mensajeMasPartido(){
    System.out.println("Partido Nuevo");
    }
    public void mensajeMenosPartido(){
    System.out.println("Partido eliminado");
    }
     public void mensajeMasCurules(){
    actualizar("Nuevo Escaño");
    }
     public void mensajeMenosCurules(){
    actualizar("Escaño eliminado");
    }
    private int curulesGanadas;
    private int valor;
    
}
