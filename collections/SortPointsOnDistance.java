import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
// class Sorting implements Comparator<Point>{
//     public int compare(Point p1,Point p2)
//     {
//         if( Math.sqrt(Math.pow(p1.x,2)+Math.pow(p1.y,2))<Math.sqrt(Math.pow(p2.x,2)+Math.pow(p2.y,2))) return -1;
//         else return 1;
//     }
// }
class Point{
    int x,y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;

    }
    public String toString()
    {
        return "("+this.x+","+this.y+")";
    }
}
public class SortPointsOnDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Point> list=new ArrayList<>();
        int n=sc.nextInt();
        while(n-->0)
        {
            list.add(new Point(sc.nextInt(),sc.nextInt()));
        }
        //Collections.sort(list,new Sorting());
        Collections.sort(list,(p1,p2)->{
            double dist1= Math.sqrt(Math.pow(p1.x,2)+Math.pow(p1.y,2));
            double dist2=Math.sqrt(Math.pow(p2.x,2)+Math.pow(p2.y,2));
            if(dist1<dist2) return -1;
            else if(dist1> dist2) return 1;
            else return 0;
        //     if( Math.sqrt(Math.pow(p1.x,2)+Math.pow(p1.y,2))<Math.sqrt(Math.pow(p2.x,2)+Math.pow(p2.y,2))) return -1;
        // else return 1;
        });
        System.out.println(list);
    }
}
