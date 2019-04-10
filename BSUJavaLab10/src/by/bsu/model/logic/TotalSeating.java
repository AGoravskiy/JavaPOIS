package by.bsu.model.logic;

import by.bsu.model.container.Company;
import by.bsu.model.entity.Transport;

public class TotalSeating {
    public static double calcTotalSeating(Company company) {
        double totalSeating = 0;
        for (Transport tr : company.getTransports()) {
            totalSeating += tr.getSeating();
        }
        return totalSeating;
    }
}
