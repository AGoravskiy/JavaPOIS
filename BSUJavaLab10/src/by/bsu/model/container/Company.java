package by.bsu.model.container;
 
import by.bsu.model.entity.Plane;
import by.bsu.model.entity.Transport;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Company {
    
    List<Transport> transports = new ArrayList<>();
    
    public Company() {
        transports = new ArrayList<Transport>();
    }
    
    public void add(Transport transport){
        transports.add(transport);
    }

    public ArrayList<Transport> getTransports() {
        return (ArrayList<Transport>) transports;
    }
    
    // 
//        public Company() {
//            planes.add(new Plane("G", "B", 1, 1, 1, 1));
//            planes.add(new Plane("P", "T", 2, 2, 2, 2));
//            planes.add(new Plane("G", "B", 3, 3, 3, 3));
//            planes.add(new Plane("P", "A", 4, 4, 4, 4));
//            planes.add(new Plane("P", "B", 5, 5, 5, 5));
//            planes.add(new Plane("P", "B", 11, 11, 11, 11));
//            planes.add(new Plane("G", "T", 6, 6, 6, 6));
//            planes.add(new Plane("G", "A", 9, 9, 9, 9));
//            planes.add(new Plane("P", "B", 8, 8, 8, 8));
//            planes.add(new Plane("P", "A", 7, 7, 7, 7));
//        }
// 
//        public void sortPlane() {
//            Plane temp = new Plane();
//            for (int i = 0; i < plane.length - 1; i++) {
//                for (int j = 0; j < plane.length - 1; j++) {
//                    if (plane[j].getFuelRate() > plane[j + 1].getFuelRate()) {
//                        temp = plane[j + 1];
//                        plane[j + 1] = plane[j];
//                        plane[j] = temp;
//                    }
//                }
//            }
//        }
// 
//        public void printPlane(Plane[] taxi) {
//            for (Plane i : plane) {
//                System.out.println("Скорость самолёта " + i.getSpeed()
//                    + " расход топлива " + i.getFuelRate());
//            }
//        }
// 
//        public void setPlane() {
//            Random rand = new Random();
//            for (int i = 0; i < plane.length; i++) {
//                plane[i] = new Plane("Plane" + i, rand.nextInt(5) + 7, 20 * (i + 1));
//            }
//        }
// 
//        public Plane[] getPlane() {
//            return (Plane[]) plane;
//        }
// 
//        public void findBySpeed(int first, int end) {
//            int count = 0;
//            for (Plane i : plane) {
//                if (i.getSpeed() > first && i.getSpeed() < end) {
//                    count++;
//                    System.out.println("Скорость самолёта " + i.getName() + " " 
//                            + i.getSpeed() + " расход топлива " 
//                            + i.getFuelRate());
//                }
//            }
//            if (count == 0){
//                System.out.println(" Подходящих по скорости "
//                        + "самолётов нет в нашей авиакомпании.");
//            }
//        }
//
//            public static void sortCompany() {
//                // TODO Auto-generated method stub
//
//            }
//
//            public static void printCompany(Plane[] plane2) {
//                // TODO Auto-generated method stub
//
//            }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Vehicle fleet:\n");
        
        transports.forEach((ob) -> {
            builder.append(ob).append("\n");
        });
        return builder.toString();
    }
}