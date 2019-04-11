/*
Авиакомпания (Airline). Определить иерархию самолетов. Создать авиакомпанию. 
Посчитать общую вместимость и грузоподъемность. 
Провести сортировку самолетов компании по дальности полета. 
Найти самолет в компании, соответствующий заданному диапазону параметров.
 */
package by.bsu.model.runner;

import by.bsu.model.container.Company;
import by.bsu.model.entity.Plane;
import by.bsu.model.entity.Transport;
import by.bsu.model.entity.View;
import by.bsu.model.logic.MaxRangeComparator;
import by.bsu.model.logic.SearchBySeating;
import by.bsu.model.logic.TotalCarrying;
import by.bsu.model.logic.TotalSeats;
import java.util.Collections;

public class Airline {

    public static void main(String[] args) {
        Transport transport = new Plane("TU", "134", 6.7, 36, 1800);
        Transport transport2 = new Plane("AIRBUS", "A300", 99, 300, 7500);
        Transport transport3 = new Plane("BOEING", "737", 12, 176, 3150);
        
        Company company = new Company();
        company.add(transport);
        company.add(transport2);
        company.add(transport3);
        
        System.out.println("----- List of aircraft before sorting -----");
        for (Transport tr : company.getTransports()) {
            System.out.println(tr.toString());
        }    
        System.out.println("----- List of aircraft sorted by flight range -----");
        
        Collections.sort(company.getTransports(), new MaxRangeComparator());
        
        for (Transport tr1 : company.getTransports()) {
            System.out.println(tr1.toString());
        }
        
        View.print("---- Total carruing ---- ");
        View.print(TotalCarrying.calcTotalCarrying(company) + "");
        
        View.print("---- Total seats---- ");
        View.print(TotalSeats.calcTotalSeating(company) + "");
        
        
        View.print("---- Aircraft having the number of seats from 20 to 180 ---- ");
        View.printList(SearchBySeating.FindBySeating(company, 20, 180));
    }
}
