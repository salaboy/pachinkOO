/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.pachinkoo;

/**
 *
 * @author salaboy
 */
public interface Agenda {
    public void addActivation(Activation activation);
    public Activation getFirstActivation();
    public int fireAllRules();
    public int size();
}
