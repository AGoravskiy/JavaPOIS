package by.bsu.model.logic;

import by.bsu.model.container.Company;
import by.bsu.model.entity.Transport;

public class TotalCarrying {
    public static double calcTotalCarrying(Company company) {
        double totalCarrying = 0;
        for (Transport tr : company.getTransports()) {
            totalCarrying += tr.getCarrying();
        }
        return totalCarrying;
    }
}
