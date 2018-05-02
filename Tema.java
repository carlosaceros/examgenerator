import java.util.*;
/**
 * Tema: permite la administración de temas
 * 
 * @authors Aceros-Lozano
 * @version 0.1
 */
public class Tema
{
    
    private String nombreTema;
    private int idTema;
    private ArrayList<String> temas = new ArrayList<String>();
    
    public Tema(){
        
        this.nombreTema= nombreTema;
        this.idTema = idTema;
        
    
    }
    
    /**
     * Este metodo permite crear un tema
     * 
     * @param nombreTema,idTema
     * @return
     */
    public void crearTema(String nombreTema)
    {
        System.out.println("Ingrese el nombre del tema");
        Scanner nombreT= new Scanner(System.in);
        nombreTema = nombreT.next();
        temas.add(nombreTema);
        System.out.println("Tema agregado a la lista");
        
    }
    
    /**
     * Este metodo permite modificar un tema
     * 
     * @param nombreTema,idTema
     * @return true si es modificado
     */
    public boolean ModificarTema(String NuevoNombre,int idTema)
    {
       return true;
    }
    
    /**
     * Este metodo permite eliminar tema
     * 
     * @param nombreTema
     * @return true si es eliminado
     */
    public boolean EliminarTema(String nombre)
    {
      return true; 
    }
    
    /**
     * Este metodo permite listar temas
     * 
     * @param 
     * @return 
     */
    public void ListarTemas()
    {
        if (temas.size() == 0){
        System.out.println("No hay temas para mostrar");
        }else{
            System.out.println("----Lista de temas---");
       for(String nombreTema : temas) { System.out.println(nombreTema + "\n");
} 
System.out.println("--Fin lista de temas--");
}

}
    }



