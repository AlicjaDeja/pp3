
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
        
        int cHour = 12;
        int cMinute = 10;
        int cSecond = 9;
        int cMidnight = cHour * 3600 + cMinute * 60 + cSecond;
        
        System.out.print("Seconds that passed since I started working: ");
        System.out.println(cMidnight - midnight);
    }
}
