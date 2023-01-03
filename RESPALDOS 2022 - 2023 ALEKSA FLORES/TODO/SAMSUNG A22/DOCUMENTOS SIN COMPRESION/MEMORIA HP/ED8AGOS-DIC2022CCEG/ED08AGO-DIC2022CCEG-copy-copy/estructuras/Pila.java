package estructuras;


/**
 * Es una interface (como un contrato) donde se definelo que debe de hacer una pila ,solo especifica lo que debe hacer .
 * Una pila es una estructura cuyo acceso es por un mismo lado por lo que si comportamiento es LIFO(last in first out).
 * 
 * @author (Castillo Cardenas Elia Guadalupe ) 
 * @version (1.0 Septimbre-2022)
 */

public interface Pila
{
    //Todos los atributos de una interface son public static fiinal aunque no se especifique 
    /**
     * Metodo para insertar elemento en la pila
     * 
     * @Elemento elemento a insertar en la pila
     * @return  Sin valor de retorno 
     */
    //Todos los metodos con public abstract , no tienen cuerpo(llaves) o codigo .
    void push(char elemento);
    /**
     * Es el metodo para eliminar un elemento de la pila regresa el valor que esta en el tope,si existe
     * 
     * @Sin parametros
     * @El ultimo elemento ingresado o lanza una exception si no hay
     */
    //Todos los metodos con public abstract , no tienen cuerpo(llaves) o codigo .
    Object pop() throws Exception;
    /**
     * Es un metodo para visualizar el ultimo elemento que esta en la pila
     * 
     * @Sin parametros
     * @El ultimo elemento ingresado o lanza una excepcion si no hay
     */
    //Todos los metodos con public abstract , no tienen cuerpo(llaves) o codigo .
    Object top()throws Exception;
    /**
     *Indica si esta vacia la pila 
     * 
     * @Sin parametros 
     * @Si esta vacia la pila regresa verdaddero y si no es asi te regresa lo contrario 
     */
    //Todos los metodos con public abstract , no tienen cuerpo(llaves) o codigo .
    boolean isEmpty();
   
}
