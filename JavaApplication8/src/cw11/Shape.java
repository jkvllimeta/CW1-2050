/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw11;

/**
 *
 * @author M00607647
 */
public abstract class Shape {

    
        private int noOfSides;
        private String name;
        
        public String getName(){
            return name;
        }
        
        public int getNoOfSides(){
            return noOfSides;
        }
        
        public Shape(String name, int noOfSides){
            this.name = name;
            this.noOfSides = noOfSides;
        }
        
        public abstract double getArea();
        
        public void displayDescription(){
            System.out.println("I am a shape named " + name);
        }
    
    }
