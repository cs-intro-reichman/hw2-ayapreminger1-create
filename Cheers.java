//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name= args [0];
            int Time= Integer.parseInt(args[1]);
            int letter= name.length();
            for (int i=0 ; i<letter; i++)
            {
                char bigletter= Character.toUpperCase(name.charAt(i));
                if 
                (bigletter=='A'|| bigletter=='E'|| bigletter=='F'|| bigletter=='H'||bigletter=='I'|| bigletter=='L'|| bigletter=='M'|| bigletter=='N'||bigletter=='O'||bigletter=='R'|| bigletter=='S'|| bigletter=='X')
                {System.out.println("Give me an " +bigletter+ ": " +bigletter+ "!");}
                else
                {System.out.println("Give me a  " +bigletter+ ": " +bigletter+ "!");}
            }
            System.out.println("What does that spell?");
            while (Time>0) {
                System.out.println(name.toUpperCase()+"!!!");
                Time= Time-1;
            }
        }
}
