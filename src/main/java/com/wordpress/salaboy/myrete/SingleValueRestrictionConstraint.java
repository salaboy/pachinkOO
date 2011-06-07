/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.myrete;

/**
 *
 * @author salaboy
 */
public class SingleValueRestrictionConstraint implements BetaConstraints{

    private String field;
    private String restriction;
    private COMPARATOR comparator;

    public SingleValueRestrictionConstraint(String field, String restriction, COMPARATOR comparator) {
        this.field = field;
        this.restriction = restriction;
        this.comparator = comparator;
    }
    
    public Object getField() {
        return field;
    }

    public Object getRestriction() {
        return restriction;
    }

    public COMPARATOR getComparator() {
       return comparator;
    }
    
}
