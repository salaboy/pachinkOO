/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo.rhs;

import com.wordpress.salaboy.pachinkoo.PropagationContext;
import com.wordpress.salaboy.pachinkoo.Tuple;

/**
 *
 * @author salaboy
 */
public interface Action {
    public void execute(Tuple tuple, PropagationContext context);
}
