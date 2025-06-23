/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Objects;

/**
 *
 * @author tungi
 */
public class BeeColony extends Colony implements Role {
    String type;

    public BeeColony() {
    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony’s type is " +  getType()
                + ", size is about " + getSize() 
                + ", and the place is " + getPlace();
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BeeColony other = (BeeColony) obj;
        return Objects.equals(this.type, other.type) 
                && Objects.equals(this.size, other.size) 
                && Objects.equals(this.place, other.place) ;
    }
    
    
}
