/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.model.logic;

import by.bsu.model.container.Company;
import by.bsu.model.entity.Transport;
import java.util.ArrayList;
import java.util.List;

public class SearchBySeating {
    public static List<Transport> FindBySeating(Company company, int minSeating,
            int maxSeating){
        List<Transport> suitablePlanes = new ArrayList<>();
        
        for (Transport plane : company.getTransports()) {
            if (plane.getSeats() > minSeating 
                    && plane.getSeats() < maxSeating) {
                suitablePlanes.add(plane);
            }
        }
        
        return suitablePlanes;
    }
}
