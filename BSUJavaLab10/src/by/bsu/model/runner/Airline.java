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
import java.util.Collections;
import javafx.print.Collation;

public class Airline {

    public static void main(String[] args) {
        Transport transport = new Plane("TU", "134", 6.7, 36, 1800);
        Transport transport2 = new Plane("AIRBUS", "A300", 99, 300, 7500);
        Transport transport3 = new Plane("BOEING", "737", 12, 176, 3150);
        
        Company company = new Company();
        company.add(transport);
        company.add(transport2);
        company.add(transport3);
               
        System.out.println(company);
//        Company companyList = new Company();
//        companyList.setPlane();
        System.out.println("----- Список самолётов до сортировки -----");
        for (Transport tr : company.getTransports()) {
            System.out.println(tr.toString());
        }
//        companyList.printPlane(companyList.getPlane());
//        companyList.sortPlane();
        System.out.println("----- Список самолётов по дальности полета -----");
        
        Collections.sort(company.getTransports(), new MaxRangeComparator());
        
        for (Transport tr : company.getTransports()) {
            System.out.println(tr.toString());
        }
//        companyList.printPlane(companyList.getPlane());
//        System.out.println("----- Список самолётов  по скорости -----");
//        companyList.findBySpeed(100, 150);
;
    }
    
}
