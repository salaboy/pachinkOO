/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.myrete;

import java.util.List;

/**
 *
 * @author salaboy
 */
public interface ObjectSinkPropagator {
    public void propagateAssertObject(Handle factHandle,
                                      PropagationContext context, WorkingMemory wm);
    public List<ObjectSink> getSinks();
    
    public void addSinks(List<ObjectSink> sinks);
}
