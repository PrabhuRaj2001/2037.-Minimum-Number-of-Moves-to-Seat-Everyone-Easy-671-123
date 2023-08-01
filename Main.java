package sample;
import java.util.*;

public class Mains {

	public static void main(String[] args) {
		
		int seats[] = {12,14,19,19,12}, students[] = {19,2,17,20,7};
		
		Arrays.sort(seats);
		Arrays.sort(students);
		int total=0,sum=0;
		
		for(int i=0;i<students.length;i++)
		{
			total=Math.abs(students[i]-seats[i]);
			sum=sum+total;
			
		}
		
		System.out.println(Math.abs(sum));
	}

}
