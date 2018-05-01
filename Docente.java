
/**
 * El docente prepara examenes, crea temas y preguntas para cada tema
 * 
 * @authors Aceros-Lozano 
 * @version 0.1
 */
public class Docente
{
    

   

    /**
     * Método que permite preparar un examen
     * 
     * @param  tema,pregunta
     * @return     the sum of x and y 
     */
    public Examen preparaExamen(Tema tema, Pregunta pregunta)
    {
        Examen examen= new Examen();
        return examen;
    }
    
    
    /**
     * Método que permite agregar un tema
     * 
     * @param  tema
     * @return     true si el tema se agrega correctamente, false si ya existe
     */
    public boolean agregaTema(Tema tema)
    {
        return true;
    }
    
    /**
     * Método que permite agregar una pregunta   
     * @param  pregunta
     * @return     true si el tema se agrega correctamente, false si ya existe
     */
    public boolean agregaPregunta(Pregunta pregunta)
    {
        return true;
    }
}
