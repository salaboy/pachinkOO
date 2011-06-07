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
public class RuleTerminalNode extends ObjectSource implements LeftTupleSink{

    private String rule;
    private Action action;

    public RuleTerminalNode(String rule, Action action) {
        this.rule = rule;
        this.action = action;
    }
    

    public long getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void assertLeftTuple(LeftTuple leftTuple, PropagationContext context, WorkingMemory wm) {
        //Create ActivationItem and place it into the agenda that should be contained inside the working memory
        Agenda agenda = wm.getAgenda();
        agenda.addActivation(new Activation(this.rule, action, leftTuple));
        
    }
    
}
