package problems;

public class AngleBwClock {

    /*
       ---------------------HOUR-----------------------
       angle made by hour needle 12 h -  360 degree
       12 h -  360 degree
       1 h -> 360/12 = 30
       60 min -> 30/60 = .5 degree
       ---------------------MINUTE---------------------
       angle made by minute needle 1 h -  360 degree
       60 min - 360 degree
       1 min -> 360/60 = 6
       1 min -> 6 degree
       ------------------------------------------------
        */
    private static double findAngle(double h, double m) {

        // corner case
        // validate the input
        if (h < 0 || m < 0 || h > 12 || m > 60) System.out.println("Wrong input");
        if (h == 12) h = 0;
        if (m == 60) m = 0;
        // angle made by hour (h*60 -> made min to sum with min)
        int h_a = (int) (0.5 * (h * 60 + m));
        // angle made by min
        int m_a = (int) (6 * m);
        // angle made
        int hm_angle = Math.abs(h_a - m_a);
        // the smallest angle made by // as whole made 360. so small 360-angle
        return Math.min(360 - hm_angle, hm_angle);
    }


    public static void main(String[] args) {

        double angle = findAngle(9, 0);
        System.err.println(" " + angle + " degree");
    }
}
