package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    
    public ArrayList<Paralelo> paralelos;

     public ArrayList<Paralelo> paralelos(){
        return paralelos;
    }
    
    public void setParalelos(ArrayList<Paralelo> paralelos){
        this.paralelos = this.paralelos;
    }
    
    public void MostrarInfoParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
