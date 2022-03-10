/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generarNumero_main;

import arbol_main.*;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author HP
 */
public class GenerarNumero {
    
    
    public arbol Generar() throws IOException {
        
        arbol arbol = new arbol();
        for (int i =0; i<1000000;i++)
        {
            int random = ThreadLocalRandom.current().nextInt(10000000+1);
            arbol.insertar(random);
        }
        return arbol;
    }
    
    
}

