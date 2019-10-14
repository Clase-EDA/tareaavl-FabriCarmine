package avl;

/**
 *
 * @author Miguel Fabrizzio Zamora Hernández 179779
 */
public interface BinarySearchTreeAVL <T>{
    
    public boolean remove(T elem);
    public void add(T elem);   
    public String imprimeIzqDer();
    public T buscar(T elem);
}