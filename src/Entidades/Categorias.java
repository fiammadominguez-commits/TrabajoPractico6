/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author fatimaalcaraz
 */
public enum Categorias {
    ELECTRONICA,
    ROPA,
    ALIMENTOS,
    HOGAR;

    @Override
    public String toString() {
       
        return  this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
    
    
    
}
