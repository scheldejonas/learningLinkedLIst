/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Slot;
import model.linking.Linking;

/**
 *
 * @author scheldejonas
 */
public class Control {
    
    public static void main(String[] args) {
//        Slot slot = new Slot("Krongborg","This is the place of hamlet");
//        Slot slot2 = new Slot("Amalienborg","This is the place of queen's home");
//        
//        ArrayList<Slot> danskeSlotte = new ArrayList();
//        danskeSlotte.add(slot);
//        danskeSlotte.add(slot2);
//        
//        for (Slot slot : danskeSlotte) {
//            System.out.println(slot.toString());
//        }

        LinkingManager linkManage = new LinkingManager();
        
        Linking li1 = new Linking("Jeg er et");
        Linking li2 = new Linking("Jeg er to");
        Linking li3 = new Linking("Jeg er tre");
        Linking li4 = new Linking("Jeg er fire");
        Linking li5 = new Linking("jeg er fem");
        Linking li6 = new Linking("Jeg er seks");
        
        linkManage.addFirst(li1);
        linkManage.addFirst(li2);
        linkManage.addFirst(li3);
        linkManage.addFirst(li5);
        linkManage.addFirst(li6);
        
        System.out.println("Printing List: ");
        System.out.println(linkManage.toString());
        
        
        linkManage.addLast(li4);
        
        System.out.println("Printing List (fire tilføjet til slutningen): ");
        System.out.println(linkManage.toString());
        
        Linking lastLink = linkManage.removeLast();
        
        System.out.println("Printing List (sidste link object fjernet): ");
        System.out.println(linkManage.toString());
        System.out.println("Removed Linking object, from the end: ");
        System.out.println(lastLink.toString());
        
        
        Linking firstRemovedLink = linkManage.removeFirst();
        
        System.out.println("Printing List (Først link objekt fjernet): ");
        System.out.println(linkManage.toString());
        System.out.println("Removed Linking object, from the start: ");
        System.out.println(firstRemovedLink.toString());

        
    }
    
}
