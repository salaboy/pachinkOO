/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author salaboy
 */
public class WorkingMemoryImpl implements WorkingMemory {
    private Agenda agenda = new AgendaImpl();
    private Rete rete;
    private Map<Object, Object> assertStore;

    public WorkingMemoryImpl() {
        rete = new Rete(this);
        assertStore = new HashMap<Object, Object>();   
    }
    
    
    public Agenda getAgenda() {
        return this.agenda;
    }

    public int fireAllRules() {
        return this.agenda.fireAllRules();
    }

    public Rete getRete() {
        return rete;
    }
    
    public Handle insert(Object object){
       Handle handle = createHandle(object);
       rete.assertObject(handle, null, this);
       return handle;
    }

    private Handle createHandle(Object object) {
        FactHandle factHandle = new FactHandle(object);
        assertStore.put(factHandle, object);
        return factHandle;
    }
    
    public Object getObjectForFactHandle(Handle handle){
        return assertStore.get(handle);
    }

    public Map<Object, Object> getAssertedFacts() {
        return assertStore;
    }
    
    
}
