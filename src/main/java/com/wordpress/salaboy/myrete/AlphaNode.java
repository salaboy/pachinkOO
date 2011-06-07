/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.myrete;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salaboy
 */
public class AlphaNode extends ObjectSource implements ObjectSink{
    
    private COMPARATOR comparator;
    private String fieldName;
    private String value;

    public AlphaNode(COMPARATOR comparator, String fieldName, String value) {
        this.comparator = comparator;
        this.fieldName = fieldName;
        this.value = value;
    }
    
    
    public void assertObject(Handle factHandle, PropagationContext propagationContext, WorkingMemory wm) {
        try {
            Object object = factHandle.getObject();
            Class clazz = object.getClass();
            Method method = clazz.getMethod("get"+fieldName);
            Object result = method.invoke(object);
            if(((String)result).equals(value)){
                sinkPropagator.propagateAssertObject(factHandle, propagationContext, wm);
            }
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AlphaNode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(AlphaNode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(AlphaNode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(AlphaNode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(AlphaNode.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public long getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
