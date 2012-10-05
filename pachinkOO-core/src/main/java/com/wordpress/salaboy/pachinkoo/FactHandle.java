/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

/**
 *
 * @author salaboy
 */
public class FactHandle implements Handle{
    private Object object;

    public FactHandle(Object object) {
        this.object = object;
    }
    
    
    public long getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getObject() {
        return object;
    }
    
    public void setObject(Object object){
        this.object = object;
    }

    @Override
    public String toString() {
        return "FactHandle{" + "object=" + object + '}';
    }
    
    
    
}
