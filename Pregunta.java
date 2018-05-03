import java.util.*;
/**
 * Permite la administracion de las preguntas
 * 
 * @authors Aceros-Lozano
 * @version 0.1
 */
public class Pregunta
{
    String enunciado;
    String respuesta;
    ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>(enunciado,respuesta);
    
    
    public Pregunta(String enunciado, String respuesta){
    this.enunciado = enunciado;
    this.respuesta = respuesta;
    this.preguntas = new ArrayList<Pregunta>(enunciado,respuesta);
    }
    /**
     * Este metodo permite crear una pregunta
     * 
     * @param nombrePregunta,idPregunta
     * @return
     */
    public void crearPregunta()
    {
        
        System.out.println("Ingrese el enunciado de la pregunta: ");
        Scanner enunciadoPregunta = new Scanner(System.in);
        enunciado = enunciadoPregunta.next();
        System.out.println("Ingrese la respuesta correcta de la pregunta: ");
        Scanner respuestaCorrecta = new Scanner(System.in);
        respuesta = respuestaCorrecta.next();
        preguntas.add(enunciado,respuesta);
        System.out.println("Pregunta agregada exitosamente");
        
        
       
    }

    
    /**
     * Este metodo permite modificar un Pregunta
     * 
     * @param nombrePregunta,idPregunta
     * @return true si es modificado
     */
    public void modificarPregunta()
    {
       
    }
    
    /**
     * Este metodo permite eliminar Pregunta
     * 
     * @param nombrePregunta
     * @return true si es eliminado
     */
    public boolean eliminarPregunta(String nombre)
    {
      return true; 
    }
    
    /**
     * Este metodo permite listar Preguntas
     * 
     * @param 
     * @return 
     */
    public void listarPreguntas()
    {
       for(Pregunta preguntas : bancoPreguntas){
           System.out.println(preguntas.enunciado + ", "+ preguntas.respuesta);
        
        }
    }
}

