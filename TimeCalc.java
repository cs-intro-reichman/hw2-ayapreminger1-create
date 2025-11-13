public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0)+ args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3)+ args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(""+args[1]);

        int Totalminutes= ((hours*60)+minutes+minutesToAdd);
        int TotalHours= (Totalminutes/60);
        int NowHoure= (TotalHours%24);
        int NowMinutes= (Totalminutes - (TotalHours*60));
        
        System.out.println(String.format ("%02d:%02d", NowHoure,NowMinutes));
        
    }
}
