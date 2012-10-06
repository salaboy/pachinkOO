/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salaboy
 */
public class CompositeObjectSinkAdapter implements ObjectSinkPropagator {
    private List<ObjectSink> sinks = new ArrayList<ObjectSink>();
    
    public void propagateAssertObject(Handle factHandle, PropagationContext context, WorkingMemory wm) {
        for(ObjectSink sink: sinks){
            sink.assertObject(factHandle, context, wm);
        }
    }
    
    public void addObjectSink(ObjectSink sink){
        sinks.add(sink);
    }

    public List<ObjectSink> getSinks() {
        return sinks;
    }

    public void addSinks(List<ObjectSink> sinks) {
        for(ObjectSink sink: sinks){
            this.addObjectSink(sink);
        }
    }
    
}
