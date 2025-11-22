/*
Feedback: 
Nice
*/

// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your codefo
		int N= Integer.parseInt(args[0]);
		int one=1;
		double sum =0.0;

		for (int i=0; i<N; i++)
		{
			double plus = (double) one/ (2*i+1);
			if (i%2==0)
			{sum = sum + plus;}
			else
			{sum = sum - plus;}
		}
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:     "+ sum*4.0);
	}
}

