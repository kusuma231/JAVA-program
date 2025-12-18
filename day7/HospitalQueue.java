import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalQueue {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

        pq.add(new Patient("Ramesh", 5));
        pq.add(new Patient("Anu", 3));

        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " " + p.severity);
        }
    }
}
/*
Ramesh 5
Anu 3
*/
