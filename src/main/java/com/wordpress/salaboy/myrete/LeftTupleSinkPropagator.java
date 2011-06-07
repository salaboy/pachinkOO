/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.myrete;

/**
 *
 * @author salaboy
 */
public interface LeftTupleSinkPropagator {
    public void propagateAssertLeftTuple(LeftTuple tuple,
                                         PropagationContext context, WorkingMemory wm);

    public void createAndPropagateAssertLeftTuple(Handle factHandle,
                                                  PropagationContext context, WorkingMemory wm);
}
