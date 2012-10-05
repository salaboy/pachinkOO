/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

import java.util.List;

/**
 *
 * @author salaboy
 */
public abstract class BetaNode extends LeftTupleSource implements ObjectSink, LeftTupleSink, RightTupleSink{
     /** The left input <code>TupleSource</code>. */
    //protected LeftTupleSource leftInput;

    /** The right input <code>TupleSource</code>. */
    protected ObjectSource    rightInput;

    protected BetaConstraints constraint;
    
    protected BetaMemory memory;

    public BetaNode(BetaConstraints constraint) {
        this.constraint = constraint;
        this.memory = new BetaMemory();
    }

    public BetaConstraints getConstraint() {
        return constraint;
    }

    public void setConstraint(BetaConstraints constraint) {
        this.constraint = constraint;
    }

    public LeftTupleSource getLeftInput() {
        return this;
    }

    public ObjectSource getRightInput() {
        return rightInput;
    }

    public void setRightInput(ObjectSource rightInput) {
        this.rightInput = rightInput;
    }

    public BetaMemory getMemory() {
        return memory;
    }
    
    public List<LeftTuple> getLeftTuples(){
       return getMemory().getLeftTupleMemory();
    }
    
    public List<RightTuple> getRightTuples(){
        return getMemory().getRightTupleMemory();
    }
    
    
}
