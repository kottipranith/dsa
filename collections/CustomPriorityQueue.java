import java.util.PriorityQueue;

public class CustomPriorityQueue{
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>((s1,s2)->{
            //if we return -ve value s1 object wiil be at 1st position else  s2 object wil be at 1st
            if(s1.marks<s2.marks) return 1;
            else if (s1.marks>s2.marks) return -1;
            else{
                if(s1.age < s2.age) return -1;
                else if (s1.age >s2.age) return 1;
                else return s1.name.compareTo(s2.name);
            }
        });

        pq.add(new Student(100, 18, "sai"));
        pq.add(new Student(100,18,"sammy"));
        pq.add(new Student(100,19,"dasarath"));
        pq.add(new Student(99, 19, "bheem"));

        System.out.println(pq);
    }
}