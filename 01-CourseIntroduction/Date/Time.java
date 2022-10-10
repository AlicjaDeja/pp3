
public class Time
{
    public static void main(String[ ] args){
        int hour = 11;
        int minute = 56;
        int second = 7;
        int midnight = hour * 3600 + minute * 60 + second;
        
        System.out.print("Number of seconds from midnight: ");
        System.out.println(midnight);
        
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(86400 - midnight);
        
        System.out.print("Percentage of the day that has passed: ");
        System.out.println(midnight * 100 / 86400 + "%");
        
        int c_hour = 12;
        int c_minute = 10;
        int c_second = 9;
        int c_midnight = c_hour * 3600 + c_minute * 60 + c_second;
        
        System.out.print("Seconds that passed since I started working: ");
        System.out.println(c_midnight - midnight);
    }
}
