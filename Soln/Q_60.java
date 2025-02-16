//Write OOJP to calculate total period by adding two periods specified in
//terms of hours, mins and sec
public class Q_60 {
    static class TimePeriod{
        private int hr, min, s;
        public TimePeriod(int hr, int min, int s){
            this.hr = hr;
            this.min = min;
            this.s = s;
        }
        public TimePeriod add(TimePeriod other){
            int totalSec = (s + other.s);
            int totalMin = (min + other.min) + totalSec/60;
            int totalHr = (hr + other.hr) + totalMin/60;

            return new TimePeriod(totalHr, totalMin%60, totalSec%60); //returns a new instance
        }
        @Override //Polymorphism
        public String toString(){
            return hr + "hrs"+min+"mins"+s+"sec";
        }
    }
    public static void main(String[] args) {
    }
}
