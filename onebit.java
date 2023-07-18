package Nobit;
import java.util.*;
public class Nobit {

	
		
		 public static boolean check(int n, int i){
		        boolean str=false;
		        if((n&(1<<i))!=0) {
		            str=true;
		        }
		       
		        return str;

		    }
		    public static int count(int n) {
		        int c=0;
		        for(int i=0;i<n;i++){
		            if(check(n,i)){
		                c++;
		            }
		        }
		        return c;
		    }
		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int value=count(n);
		        System.out.println(value);
		    }
		

	}


