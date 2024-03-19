package application;

import java.util.InputMismatchException;

public class ShawqiShreteh {
	public static void main(String[] args) {
	
	printN(0);	
	System.out.println(power(1,1));	
	System.out.println(Str("shawqii", 'i'));
	System.out.println(sum(sum(8888)));
	//System.out.println(count("shawqi",));
		 
		
	}
	public static int power(int m ,int n ) {
		if(n < 0) {
			System.out.println("can be less than ZERO");
		}
		return power(m , n , 1);
	}
	
	 private static int power(int m , int n , int result) {
	
		if(n ==0) {
			return result;
		}
		else
		return power(m , n-1, result *m);
		
	}
	 
	public static int Str(String st , char s  ) {
			if(st.length() < 1 || st == null) 	
			   return 0;
			if(st.charAt(0)==s) 
			return 1+ Str(st.substring(1), s);	
			return Str(st.substring(1), s);
			 
		
			
					
				
			}
	
	
		public static int count(String s , char c , int i) {
			if( i >= s.length())
				return 0 ;
			if (s.charAt(i)==c)
				return 1 + count(s,c,++i);
			return i;
		}
		
		
		public static int sum(int n) {
			try {
		if(n < 10) 
			return n;
			}catch(InputMismatchException ec) {
				System.out.println("error");
			}
		 return n % 10 +(sum(n /10));
		 
		
		}
		public static String sum(String s) {
			return sum(s);
			
		}
		
		
		public static String rev(String s) {
			 if (s == null || !s.contains(" ")) {
		            return s;
		        }
		        int lIndex = s.lastIndexOf(' ');
		        String lWord = s.substring(lIndex + 1);
		        String remain = s.substring(0, lIndex);
		        return lWord + " " +rev(remain) ;
		    }
		

		   public  static int binarySearch(int arr[], int less, int more, int tar) {
		        if (more >= less) {
		            int mid = less + (more - less) / 2;
		            if (arr[mid] == tar)
		                return mid;
		            if (arr[mid] > tar)
		                return binarySearch(arr, less, mid - 1, tar);
		            return binarySearch(arr, mid + 1, more, tar);
		        }
		        return -1;
		    }
		public static int binarySearch(int arr[]) {
			   if(arr.length == 0) {
				   return 0 ;
			   }
			  
			return binarySearch(arr, 2, 1, 0);
		   }

		   
			
			
		
	 
	 
	 
	public static  void printN(int a) {
	if(a>=0) {
		printN(a-1);
		System.out.print(a + ">>>> ");
	}
	
	//public static int bys(int [])
	
	
	
	
	
		
	
	
	}
	
	
}
