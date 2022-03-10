/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_main;

/**
 *
 * @author HP
 */
public class Nodo {
     public Nodo izq, der;
    public int key;
    
    public Nodo(int key)
    {
        this.key=key;
        this.izq=null;
        this.der=null;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der= der;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    public void insert(int numero)
    {
        if(numero<this.key)
        {
            if(this.izq == null)
            {
                this.izq = new Nodo(numero);
            } else
            {
                this.izq.insert(numero);
            }
        }else
        {
            if(this.der == null )
            {
                this.der = new Nodo (numero);
            }else
            {
                this.der.insert(numero);
            }
        }
    }
}
