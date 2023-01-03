package estructuras;
import lang.stride.*;

/**
 * La pila Acotada es donde usamos los metodos push,pop,top,isEmpty e isFull y donde utilizamos el tope 
 * @author (Castillo Cardenas Elia Guadalupe) 
 * @version (1.0 Agosto-2022)
 */
//Se implementa la interface a la clase pila 
public class PilaAcotada implements Pila{
    private char[] pila;
    
    private int tope;

    /**
     * 
     */
    public PilaAcotada() 
    {
        pila=new char[20];
        
    }

    /**
     * 
     */
    public PilaAcotada(int tamaño) 
    {
        
            pila=new char[tamaño];
            
        
    }

    /**
     * Es un metodo para visualizar el ultimo elemento que esta en la pila
     * 
     * @Sin parametros
     * @El ultimo elemento ingresado o lanza una excepcion si no hay
     */
    public boolean isEmpty()
    {
       if(tope==0){
      return true;  
      }else{
     return false;   
     }
        
    }

    /**
     * 
     */
    public boolean isFull()
    {
      if(tope>0){
        return true;
        }else{
        return false;
        }
    }

    /**
     * 
     */
    public void push(char elemento)     {
            pila[tope]=elemento;
            tope++;
        
    }

    /**
     * Es el metodo para eliminar un elemento de la pila regresa el valor que esta en el tope,si existe
     * 
     * @Sin parametros
     * @El ultimo elemento ingresado o lanza una exception si no hay
     */
    public Object pop() throws Exception
    {
        if ( ! isEmpty()) {
            int eliminar;
            eliminar=pila[tope];
            return pila[ -  - tope];
            
        }
        else {
            System.err.println("Error no se puede eliminar elementos de una pila vacia");
            /* Este lo usamos para mostrar los errores al administrador y el .out para mostrar al usuario*/
            throw  new  Exception("Error: pila vacia");
            /* Este lo usamos para mandar una excepcion*/
        }
    }

    /**
     *Indica si esta vacia la pila 
     * 
     * @Sin parametros 
     * @Si esta vacia la pila regresa verdaddero y si no es asi te regresa lo contrario 
     */
    public Object top() throws Exception
    {
     if(!isEmpty()){
        return pila[tope-1];
        
        }else{
        System.err.println("Error la pila se encuentra vacia");
            /* Este lo usamos para mostrar los errores al administrador y el .out para mostrar al usuario*/
            throw  new  Exception("Error: pila vacia");
            /* Este lo usamos para mandar una excepcion*/
        
        }
       
    }


}

