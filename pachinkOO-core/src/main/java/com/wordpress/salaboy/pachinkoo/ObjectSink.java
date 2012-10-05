/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

/**
 *
 * @author salaboy
 */
public interface ObjectSink extends NetworkNode {
     public void assertObject(Handle factHandle,
                             PropagationContext propagationContext, WorkingMemory wm);
}
