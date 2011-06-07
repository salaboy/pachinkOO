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
public class LeftTupleSource {
    protected List<LeftTupleSink> sinks = new ArrayList<LeftTupleSink>();

    public LeftTupleSource() {
    }
    
    
    public void addTupleSink(final LeftTupleSink tupleSink) {
        sinks.add(tupleSink);
    }
    
    
}
