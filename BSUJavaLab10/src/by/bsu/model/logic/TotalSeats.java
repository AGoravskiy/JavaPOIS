package by.bsu.model.logic;

import by.bsu.model.container.Company;
import by.bsu.model.entity.Transport;

public class TotalSeats {
    public static double calcTotalSeating(Company company) {
        double totalSeats = 0;
        for (Transport tr : company.getTransports()) {
            totalSeats += tr.getSeats();
        }
        return totalSeats;
    }
}
