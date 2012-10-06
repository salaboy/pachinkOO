/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

import com.wordpress.salaboy.pachinkoo.rhs.Action;

/**
 *
 * @author salaboy
 */
public class Activation {
    private String ruleName;
    private Action action;
    private Tuple tuple;

    public Activation(String ruleName, Action action, Tuple tuple) {
        this.ruleName = ruleName;
        this.action = action;
        this.tuple = tuple;
    }

    public Action getAction() {
        return action;
    }

    public String getRuleName() {
        return ruleName;
    }

    public Tuple getTuple() {
        return tuple;
    }

    @Override
    public String toString() {
        return "Activation{" + "ruleName=" + ruleName + ", action=" + action + ", tuple=" + tuple + '}';
    }
    
    public void execute(){
        action.execute(tuple, null);
    }
    
        
    
}
