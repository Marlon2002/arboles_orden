/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_main;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class arbol {
      public Nodo inicial;

    
    public arbol()
    {
        inicial=null;
    }
    
    public void insertar(int valor)
    {
        if(inicial==null)
        {
            inicial=new Nodo(valor);
        }else
        {
            inicial.insert(valor);
        }
    }
    
    public void PreOrden() throws IOException
    {
        this.PreOrden(this.inicial);
    }
    
    public void PreOrden(Nodo nodo) throws IOException
    {
       
        if(nodo == null)
        {
            return;
        }else
        {
            System.out.print(nodo.getKey() + ", ");
            
            PreOrden(nodo.getIzq());
            PreOrden(nodo.getDer());
        }
    }
    
    
    public void InOrden() throws IOException
    {
        this.InOrden(this.inicial);
    }
    
    public void InOrden(Nodo nodo) throws IOException
    {
  
        if(nodo == null)
        {
            return;
        }else
        {
            InOrden(nodo.getIzq());
            System.out.print(nodo.getKey() + ", ");
          
            InOrden(nodo.getDer());
            //imprimir.close();
        }
    }
    
    
    
    public void PosOrden() throws IOException
    {
        this.PosOrden(this.inicial);
    }
    
    public void PosOrden(Nodo nodo) throws IOException
    {
        
        if(nodo == null)
        {
            return;
        }else
        {
            PosOrden(nodo.getIzq());
            PosOrden(nodo.getDer());
            System.out.print(nodo.getKey() + ", ");
           
        }
    }
}
