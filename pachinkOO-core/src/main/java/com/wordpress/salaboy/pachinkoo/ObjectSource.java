/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

/**
 *
 * @author salaboy
 */
public class ObjectSource {
    //Hard Coded Composite Object Sink
    protected ObjectSinkPropagator sinkPropagator = new CompositeObjectSinkAdapter();
    protected ObjectSource         source; 
    
    
    public void addObjectSink(ObjectSink sink){
        //Implement Single as well
        
        //Composite Sink for multiple propagations
        
        ((CompositeObjectSinkAdapter)sinkPropagator).addObjectSink(sink);
       
       
    }
}
