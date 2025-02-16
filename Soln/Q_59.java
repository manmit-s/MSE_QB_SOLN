import java.util.Scanner;

//Write OOJP to calculate time elapsed between two time instances
//t1(hr,min,sec) and t2(hr, min, sec)
public class Q_59 {
    static class Time{
        private int hr, min, s;
        public Time(int hr, int min, int s){
            this.hr = hr;
            this.min = min;
            this.s = s;
        }
        void timeElapsed(Time other){
            int elapsedHr = (hr - other.hr);
            int elapsedMin = (min - other.min);
            int elapsedSec = (s - other.s);

            //Time adjustments checker to handle negative values of min and sec
            if(elapsedSec < 0){
                elapsedSec += 60;
                elapsedMin--;
            }
            if(elapsedMin < 0){
                elapsedMin += 60;
                elapsedHr--;
            }
            System.out.printf("Time elapsed is %d hour(s), %d minute(s), %d second(s)", elapsedHr, elapsedMin, elapsedSec);
        }
    }
    public static void main(String[] args) {
        int h1, h2, m1, m2, s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time 1: ");
        h1 = in.nextInt();
        m1 = in.nextInt();
        s1 = in.nextInt();
        System.out.println("Enter time 2: ");
        h2 = in.nextInt();
        m2 = in.nextInt();
        s2 = in.nextInt();
        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);
        t1.timeElapsed(t2);
    }
}
