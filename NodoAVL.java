package avl;

/**
 *
 * @author Miguel Fabrizzio Zamora Hernández 179779
 */
public class NodoAVL <T extends Comparable<T>>{
    //Atributos
    private T elem; //Elemento que guarda el Nodo
    private NodoAVL<T> izq, der, papa; //Nodo hijo derecho, izquierdo y papá
    private int fe,altura; //factor de equilibrio y altura del nodo

    public NodoAVL(T elem) { //Se inicializa el nodo con elemento de tipo T
        this.elem = elem;
        izq=null; 
        der=null;
        papa=null;
        fe=0;
        altura=0;
    }
    
    //Regresa la altura del nodo
    public int getAltura(){
        return altura;
    }
    
    //Regresa el elemento que guarda el nodo
    public T getElem(){
        return elem;
    }
    
    //Recibe un elemento de tipo T y reemplaza el elemento que tiene el nodo
    public void setElem(T elem){
        this.elem=elem;
    }
    
    //Regresa al Nodo hijo izquierdo
    public NodoAVL<T> getIzq(){
        return izq;
    }
    
     //Regresa el factor de equilibrio del nodo
    public int getFe(){
        return fe;
    }
    
    //Recibe un entero que reemplaza la altura del nodo
    public void setAltura(int alt){
        this.altura=alt;
    }
   
    //Regresa al nodo hijo derecho
    public NodoAVL<T> getDer(){
        return der;
    }
    
    //Recibe un entero que reemplaza el factor de equilibrio
    public void setFe(int unFactor){
        fe=unFactor;
    }
    
    //Ajusta el Nodo hijo izquierdo
    public void setIzq(NodoAVL<T> nuevo){
        izq=nuevo;
    }
    
    //Ajusta el Nodo hijo derecho
    public void setDer(NodoAVL<T> nuevo){
        der=nuevo;
    }
    
    //Ajusta el Nodo papa
    public void setPapa(NodoAVL<T> nuevo){
        papa=nuevo;
    }
    
    //Regresa el nodo papa
    public NodoAVL<T> getPapa(){
        return papa;
    }
    
    //Determina y ajusta el lugar donde va el nodo que recibe
    public void cuelga(NodoAVL<T> n){
        if(n.getElem().compareTo(elem)<0){
            izq=n;
        }
        else{
            der=n;
        }
       
    }
    
    //Regresa el número de Descendientes
    public int numDesc(){
        int hijos=0;
        
        if(izq!=null){
            hijos+=izq.numDesc();
        }
        if(der!=null){
            hijos+=der.numDesc();
        }
        
        return hijos;
    }

    
}