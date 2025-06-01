import StructuralDP.Proxy.Image;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAssignment {
    public static void main(String[] args) {
        Job j1 = new Job(10, 1, 5, "abc");
        Job j2 = new Job(20, 2, 5, "pqr");
        Job j3 = new Job(30, 3, 10, "xyz");
        Job j4 = new Job(40, 4, 2, "sdf");

        List<Job> jobs = new ArrayList<Job>();
        jobs.add(j1);
        jobs.add(j2);
        jobs.add(j3);
        jobs.add(j4);

        Collections.sort(jobs, new JobComparator());

        for(int i=0; i<jobs.size(); i++){
            System.out.println(jobs.get(i).id);
        }

    }
}


class Job {
    int priority;
    int order;
    int id;
    String name;

    public Job(int id, int order, int priority, String name) {
        this.priority = priority;
        this.order = order;
        this.id = id;
        this.name = name;
    }
}

class JobComparator implements Comparator<Job> {
    public int compare(Job o1, Job o2) {
        if (o1.priority != o2.priority) {
            return Integer.compare(o2.priority, o1.priority);  //by default comparator returns smaller element
        }
        return o1.name.compareTo(o2.name);
//        return Integer.compare(o1.order, o2.order);
    }
}





