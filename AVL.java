package avl;

/**
 *
 * @author Miguel Fabrizzio Zamora Hernández 179779
 */
public class AVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedBSTAVL miArbol= new LinkedBSTAVL();
        System.out.println("Se Crea un AVL");
        
        
        miArbol.add(100);
        miArbol.add(101);
        miArbol.add(102);
        miArbol.add(99);
        miArbol.add(80);
        miArbol.add(50);
        miArbol.add(190);
        
        
        System.out.println("Se imprime el árbol antes de eliminar algún nodo");
        System.out.println(miArbol.imprimeIzqDer());
        
        System.out.println("Se Elimina el 190");
        
        miArbol.remove(190);
        
        
        
        System.out.println("Se imprime el árbol despupés de la eliminación");
        System.out.println(miArbol.imprimeIzqDer());
    }
    
}
