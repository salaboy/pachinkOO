/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author salaboy
 */
public class RightTuple {

    private LinkedList<Handle> handles = new LinkedList<Handle>();
    protected RightTupleSink sink;

    public RightTuple(Handle handle, RightTupleSink sink) {
        this.sink = sink;
        handles.add(handle);
    }

    public Handle get(int pattern) {
        return handles.get(pattern);
    }

    public List<Handle> getFactHandles() {

        return handles;
    }

    public int size() {
        return handles.size();
    }

    @Override
    public String toString() {
        return "RightTuple{" + "handles=" + handles + ", sink=" + sink + '}';
    }
    
    
}
