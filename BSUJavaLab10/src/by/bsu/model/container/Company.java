package by.bsu.model.container;

import by.bsu.model.entity.Transport;
import java.util.ArrayList;
import java.util.List;

public class Company {
    
    List<Transport> transports = new ArrayList<>();
    
    public Company() {
        transports = new ArrayList<>();
    }
    
    public void add(Transport transport){
        transports.add(transport);
    }

    public ArrayList<Transport> getTransports() {
        return (ArrayList<Transport>) transports;
    }
}