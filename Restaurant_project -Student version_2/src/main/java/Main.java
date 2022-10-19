import java.time.LocalTime;

public class Main {

    public static void main(String args[]) {

        LocalTime openTime = LocalTime.parse("10:30:00");
        LocalTime closeTime = LocalTime.parse("22:00:00");
        Restaurant restaurant = new Restaurant("Amelei's cafe", "Chennai",openTime,closeTime);
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne",269);
    }
}
