
/**
 * Classe enumerada Size - Classe onde estão os 3 tamanhos de bebidas quentes com as
 * respetivas descrições
 *
 * @author Alexandre Almeida
 * @version 1.2 04/03/2021
 */
public enum Size
{
    //Tamanhos das bebidas quentes
    SMALL(32, 36, "Pequeno", 'S'),
    MEDIUM(37, 44, "Médio", 'M'),
    LARGE(45, 52, "Grande", 'L');
    
    //Instâncias
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
    private int counter;
    /**
     * Método onde guarda os dados do valor minimo,maximo, a descrição e a letra de código
     * indicando qual é o tamanho da bebida quente.
     * Foi incluido um contador onde incrementa sempre que um objeto é criado
     * 
     */
    private Size(int minValue, int maxValue,String description, char code)
    {
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.code = code;
        counter++;
        this.counter = counter;
    }
    
    /**
     * Método onde retorna a descrição da bebida
     */
    @Override
    public String toString()
    {
        return this.description;
    }
    
    /**
     * Método onde retorna a descrição da bebida
     */
    public String getDescription()
    {
         return description;   
    }
    
    /**
     * Método onde retorna o valor minimo da bebida
     */
    public int getMinValue()
    {
         return minValue;   
    }
    
    /**
     * Método onde retorna o valor minimo da bebida
     */
    public int getMaxValue()
    {
         return maxValue;   
    }
    
    /**
     * Método onde retorna o símbolo do tamanho da bebida
     */
    public char getCode()
    {
         return code;   
    }
    
    /**
     * Método onde retorna o valor do contador da ordem da bebida
     */
    public int getCounter()
    {
        return counter;
    }
}
