
package projetoimc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class ProjetoIMCTest {
    
    //Homem abaixo do peso
    @Test
    public void testHomemAbaixoDoPeso() {
        ProjetoIMC projeto = new ProjetoIMC("M", 1.90, 50);
        
        int esperado = 0;
        int resultado = projeto.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Homem no peso ideal
    @Test
    public void testHomemNoPesoIdeal() {
        ProjetoIMC projeto = new ProjetoIMC("M", 1.70, 70);
        
        int esperado = 1;
        int resultado = projeto.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Homem acima do peso
    @Test
    public void testHomemAcimaDoPeso() {
        ProjetoIMC projeto = new ProjetoIMC("M", 1.50, 90);
        
        int esperado = 2;
        int resultado = projeto.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Mulher abaixo do peso
    @Test
    public void testMulherAbaixoDoPeso() {
        ProjetoIMC projeto = new ProjetoIMC("F", 1.90, 40);
        
        int esperado = 0;
        int resultado = projeto.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Mulher no peso ideal
    @Test
    public void testMulherNoPesoIdeal() {
        ProjetoIMC projeto = new ProjetoIMC("F", 1.70, 60);
        
        int esperado = 1;
        int resultado = projeto.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Mulher acima do peso
    @Test
    public void testMulherAcimaDoPeso() {
        ProjetoIMC projeto = new ProjetoIMC("F", 1.50, 90);
        
        int esperado = 2;
        int resultado = projeto.calcular();
        
        assertEquals(esperado, resultado);
    }
    
}
