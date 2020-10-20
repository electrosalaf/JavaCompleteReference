public class LightTravel {
    public static void main(String[] args) {
        int lightSpeed;
        int days;
        long seconds;
        long distance;

        //  approximate speed of light in miles per second
        lightSpeed = 186000;

        days = 1000;    //  specify the number of days here
        seconds = 1000 * 24 * 60 * 60;  //  convert number of days to seconds
        distance = lightSpeed * seconds;
        System.out.println("In " + days + " days, light will travel about " + distance + " miles.");
}
}