public class ques7 {
    public static void main(String[] args) {
        int rad_km = 6378;
        double rad_miles = rad_km*0.6;
        double vol_km =((Math.PI*4/3)*(Math.pow(rad_km,3)));
        double vol_miles=((Math.PI*4/3)*(Math.pow(rad_miles,3)));
        System.out.println("The volume of earth in cubic kilometers is "+vol_km+" and cubic miles is "+vol_miles);
    }
}