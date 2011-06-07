/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.myrete;

/**
 *
 * @author salaboy
 */
public class LeftInputAdapterNode extends LeftTupleSource implements ObjectSink {
    //HardCoded composite
    CompositeLeftTupleSinkAdapter sinkAdapter = new CompositeLeftTupleSinkAdapter();
    
    public long getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void assertObject(Handle factHandle, PropagationContext propagationContext, WorkingMemory wm) {
        
      sinkAdapter.createAndPropagateAssertLeftTuple(factHandle, propagationContext, wm);
        
        
    }
    
    @Override
    public void addTupleSink(final LeftTupleSink tupleSink) {
        sinkAdapter.addTupleSink(tupleSink);
    }
           

    
    
}
