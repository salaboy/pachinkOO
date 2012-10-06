/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

import java.util.Map;

/**
 *
 * @author salaboy
 */
public interface WorkingMemory {
    
    public Agenda getAgenda();
    
    public int fireAllRules();
    
    public Rete getRete();
    
    public Handle insert(Object fact);
    
    public Map<Object, Object> getAssertedFacts();
}
