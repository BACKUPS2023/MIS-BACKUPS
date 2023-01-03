package estructuras.estructuras_listas_u3;

/**
 * Una implementación básica de "LISTA ENLAZADA SIMPLE" (doblemente enlazada)
 * 
 * @author (SANCHEZ FLORES ALEKSANDRA ESTEFANIA) 
 * @version (v1.0 OCTUBRE 2022)
 */
public class ListaEnlazadaSimple<E>{ 
    //---------------- nested Node class ----------------
    private static class Node<E> { 
        private E element; // reference to the element stored at this node
        private Node<E> prev; // reference to the previous node in the list
        private Node<E> next; // reference to the subsequent node in the list
        public Node(E e, Node<E> p, Node<E> n){ 
            element = e;
            prev = p;
            next = n;
        } 

        public E getElement( ){
            return element; 
        }

        public Node<E> getPrev( ){ 
            return prev; 
        } 

        public Node<E> getNext( ){
            return next; 
        } 

        public void setPrev(Node<E> p){ 
            prev = p; 
        }

        public void setNext(Node<E> n){ 
            next = n; 
        } 
    }//----------- end of nested Node class -----------

    // instance variables of the DoublyLinkedList
    private Node<E> header; // header sentinel
    private Node<E> trailer; // trailer sentinel
    private int size = 0; // number of elements in the list

    /**
     * Construye una nueva lista vacía
     * 
     */
    public ListaEnlazadaSimple(){ 
        header = new Node<>(null, null, null); // create header
        trailer = new Node<>(null, header, null); // trailer is preceded by header
        header.setNext(trailer); // header is followed by trailer
    } 

    /**
     * Devuelve el número de elementos de la lista enlazada.
     * 
     */
    public int size(){ 
        return size; 
    }

    /**
     * Comprueba si la lista enlazada está vacía.
     * 
     */
    public boolean estaVacia(){
        return size == 0; 
    } 

    /**
     * Devuelve (pero no elimina) el primer elemento de la lista.
     * 
     */
    public E primero(){ 
        if (estaVacia()) return null;
        return header.getNext().getElement(); // primero element is beyond header
    } 
    
    /**
     * Devuelve (pero no elimina) el ultimo elemento de la lista.
     * 
     */
    public E ultimo(){ 
        if (estaVacia()) return null;
        return trailer.getPrev().getElement(); // ultimo element is before trailer
    }  

    // public update methods
    /**
     * Añade el elemento e al principio de la lista.
     * 
     */
    public void addprimero(E e){ 
        addBetween(e, header, header.getNext( )); // place just after the header
    } 
    
    /**
     * Agrega el elemento e al final de la lista.
     * 
     */
    public void addultimo(E e){ 
        addBetween(e, trailer.getPrev( ), trailer); // place just before the trailer
    } 
    
    /**
     * Elimina y devuelve el primer elemento de la lista.
     * 
     */
    public E removeprimero(){ 
        if (estaVacia( )) return null; // nothing to remove
        return remove(header.getNext( )); // primero element is beyond header
    } 
    
    /**
     * Elimina y devuelve el último elemento de la lista.
     * 
     */
    public E removeultimo(){ 
        if (estaVacia( )) return null; // nothing to remove
        return remove(trailer.getPrev( )); // ultimo element is before trailer
    } 

    // private update methods
    /**
     * Agrega el elemento e a la lista enlazada entre los nodos dados.
     * 
     */
    private void addBetween(E e, Node<E> predecessor, Node<E> successor){ 
        // create and link a new node
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    } 
    
    /**
     * Elimina el nodo dado de la lista y devuelve su elemento.
     * 
     */
    private E remove(Node<E> node) { 
        Node<E> predecessor = node.getPrev( );
        Node<E> successor = node.getNext( );
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        --size;
        return node.getElement( );
    } 
} //----------- Fin de la clase ListaEnlazadaSimple -----------