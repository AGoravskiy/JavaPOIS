/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.model.logic;

import by.bsu.model.entity.Transport;
import java.util.Comparator;

public class MaxRangeComparator implements Comparator<Transport>{

    @Override
    public int compare(Transport tr1, Transport tr2) {
        return (int) (tr1.getCarrying() - tr2.getCarrying());
    }   
}
