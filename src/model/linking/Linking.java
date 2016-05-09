/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.linking;

/**
 *
 * @author scheldejonas
 */
public class Linking {
    
    private String description;
    //private java.lang.object objData
    private Linking next; //Peger på det næste object af typen Linking

    public Linking() {
    }
    
    public Linking(String description) {
        this.description = description;
    }

    public Linking(String description, Linking next) {
        this.description = description;
        this.next = next;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Linking getNext() {
        return next;
    }

    public void setNext(Linking next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Linking object: " + "description= " + description + "\n";
    }
    
}
