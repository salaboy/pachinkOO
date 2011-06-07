/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.myrete.rhs;

import com.wordpress.salaboy.myrete.PropagationContext;
import com.wordpress.salaboy.myrete.Tuple;

/**
 *
 * @author salaboy
 */
public interface Action {
    public void execute(Tuple tuple, PropagationContext context);
}
