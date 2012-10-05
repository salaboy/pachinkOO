/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

/**
 *
 * @author salaboy
 */
public interface LeftTupleSink {
     void assertLeftTuple(LeftTuple leftTuple,
                         PropagationContext context, WorkingMemory wm);
}
