/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seak.architecture.enumeration;

import seak.architecture.pattern.ArchitecturalDecision;
import java.util.Collection;

/**
 *
 * @author nozomihitomi
 */
public interface Enumeration{
    
    public Collection<ArchitecturalDecision> enumerate();
    
}
