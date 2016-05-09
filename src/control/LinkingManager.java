/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.linking.Linking;

/**
 *
 * @author scheldejonas
 */
public class LinkingManager {
    
    private Linking first;
    
    /**
     * This method adds  a new linking object to the list.
     * First time it starts it points off course on null
     * @param newLink 
     */
    public void addFirst( Linking newLink ) {
        if( first == null) { //at first it consists of null
            first = newLink; //This is first time, the top list
        }
        else { //else there is something in the list
            newLink.setNext(first); //Point on the object, which first is pointing on
            first = newLink; //And then poiint the first ON the newLink instead.
        }
        
    }
    
    /**
     * The method goes to the end of the linked list and insert's the next to the recieved element
     */
    public void addLast(Linking newLinking) {
        Linking add = newLinking; //Temp
        Linking lastLinking = first; //Adding the object, from where to start in the linked LIst
        
        while (lastLinking.getNext() != null) { //run to the end of the linked list
            lastLinking = lastLinking.getNext();//Set the next element
        }
        lastLinking.setNext(newLinking);
    }
    
    public Linking removeFirst() {
        Linking firstLinking = first;//get the first element
        Linking secondLinking = first.getNext();//Get the next element after the first
        first = secondLinking; //Change first fo the Linking Manager to be the secong element.

        return firstLinking; //Returns the first temp saved element, which is lost from the first, because it is overriden by second Linking element
    }
    
    
    
    /**
     * The method to remove the ending object of the list.
     * @return the object of Linking to be removed
     */
    public Linking removeLast() {
        Linking remove = first;
        
        //Rolling until remove is the second to last element in the linked list.
        while (remove.getNext().getNext() != null) {
            //Moving reference one element and gets the description
            remove = remove.getNext();
        }
        //remove is now the second to last element
        Linking toBeRemoved;
        toBeRemoved = remove.getNext();
        remove.setNext(null); //Removing last element, by setting i tto null.
        
        return toBeRemoved;
    }

    /**
     * The first and old way to make a tostring, the problem is you have to insert println, from every addFirst.
     */
//    @Override
//    public String toString() {
//        return "first=" + first + "\n";
//    }
    
    /**
     * The new version of toString, where it is possible just to fire it once and se the historic
     */
    @Override
    public String toString() {
        String tempString = "";
        Linking temp = first;
        
        tempString += temp.getDescription() + "\n";
        
        while (temp.getNext() != null) {
            //Moving reference one element and gets the description
            temp = temp.getNext();
            tempString += temp.getDescription() + "\n";
        }
        
        return tempString;
    }
}
