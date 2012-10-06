/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

/**
 *
 * @author salaboy
 */
public class EmptyBetaConstraints implements BetaConstraints{

    public Object getField() {
        return null;
    }

    public Object getRestriction() {
       return null; 
    }

    public COMPARATOR getComparator() {
        return null;
    }
    
}
