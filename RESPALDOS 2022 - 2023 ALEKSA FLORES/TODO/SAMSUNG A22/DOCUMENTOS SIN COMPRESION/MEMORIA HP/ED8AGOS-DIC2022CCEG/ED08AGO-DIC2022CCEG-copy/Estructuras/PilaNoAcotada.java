package Estructuras;


/**
 * Una pila no acotada es una pila donde unicamente se utilizan los metodos push y pop y no necesitamos el tope.
 * 
 * @author (Castillo Cardenas Elia Guadalupe) 
 * @version (1.0 Septiembre-2022)
 */
public class PilaNoAcotada implements Pila
{
    // instance variables - replace the example below with your own
    private char[] pila;
    public PilaNoAcotada(int tamaño) 
    {
        
            pila=new char[tamaño];
            
        
    }
    /**
     * Metodo para insertar elemento en la pila
     * 
     * @Elemento elemento a insertar en la pila
     * @return  Sin valor de retorno 
     */
    public void push(char elemento){
        //Declarar variable 
       char[] copia;
       //Crear arreglo y asignarlo a la referencia
       copia= new char[pila.length+1];
       //Se usa el menor 
       //Vas a copiar los elementos de copia en el cicl for 
       for(int i=0;i<pila.length;i++){
        copia[i]=pila[i];
       }
       //Agregar el elemento al final de la copia 
       copia[copia.length-1]=elemento;
       //Actualizar que la pila ya no es la original y copia 
       pila=copia;
    }
    public boolean isEmpty()
    {
        if(pila.length==0){
        return true;
        }else{
        return false;
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
        return pila[pila.length-1];
        
        }else{
        System.err.println("Error la pila se encuentra vacia");
            /* Este lo usamos para mostrar los errores al administrador y el .out para mostrar al usuario*/
            throw  new  Exception("Error: pila vacia");
            /* Este lo usamos para mandar una excepcion*/
        
        }
       
    }
    /**
     * Es el metodo para eliminar un elemento de la pila regresa el valor que esta en el tope,si existe
     * 
     * @Sin parametros
     * @El ultimo elemento ingresado o lanza una exception si no hay
     */
    public Object pop() throws Exception{
       char[]copia;
       char temporal;
       copia=new char[pila.length-1];
       //Siempre usar el arreglo de tamaño menor 
       for(int i=0;i<copia.length;i++){
        copia[i]=pila[i];
        }
       temporal=pila[pila.length-1];
       pila=copia;
       return pila;
    }

    
    }

