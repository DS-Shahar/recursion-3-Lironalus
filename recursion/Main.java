package recursion;

public class Main {

	public static void main(String[] args) {

		public static int factorial(int n) {
			if(n == 1) {
				return 1;
			}
			return factorial(n-1) * n;
		}
		public static int odd_summery(int n) {                        
			if(n ==1) { 
				return 1;
			}
			if(n % 2 != 0) {
				return odd_summery(n-1) + n;
			}
			else {
				return odd_summery(n-1);
			}
		}
		public static int sum_digits(int n) {
			if(n/10 == 0) {
				return 1;                                      
			}
			n = n /10;
				return sum_digits(n) + 1;
			
		}
		public static int quotient(int a, int b) {
			if(b>a) {
				return 0;    //13 4
			}
			
			return quotient(a-b,b) +1 ;
		}
		public static int modulu(int a, int b) {
			if(b>a) {
				return a;       
			}
			
			return modulu(a-b,b) ;
		}
	    // כתוב פעולה רקורסיביצ בוליאנית המקבלת 2 מספרים שלמים ומחזירה טרו אם X 
		public static boolean x_divide_by_y(int x, int y) {  // 21 5    16 5   11 5    6 5    1 5     25 5   20 5   15 5     10 5    5  5     0 5
			if(x<y) {                            
				return false;
			}
			if(x == y) {
				return true;
			}
			return x_divide_by_y(x-y, y);
		}
		
		public static boolean prime(int a, int p) {  
			if(p == 1 ) {   
				return true;
			}
			if(a%p == 0 && p != a) {            
				return false;
			}
			return prime(a, p-1);         
			
		}
		//כל הספרות זוגיות או כל הספרות אי זוגיות טרו
		public static boolean all_digits_are_odd_or_even(int a) {   //2
			if(a/10 == 0) {
				return true;
			}
			int x = a%10;
			int y = (a/10) % 10;
			if(x%2 != y%2) {
				return false;
			}
			
			else {
				return all_digits_are_odd_or_even(a/10);
			}
		}
		
		public static boolean ascending(int num) {      // 123
			if(num/10 == 0) {
				return true;
			}
			int x = num%10;
			int y = (num/10)%10;
			if(y>=x) {
				return false;
			}
		
		return ascending(num/10);
		}

		public static int number_appear(int [] a, int count, int num) {
			if (count == -1) {
				return 0;
			}
			if(a[count] == num) {
				return number_appear(a,count-1,num) + 1;
				
			}
			else {
			return number_appear(a,count-1,num);
		}

	}
		public static int sum(int [] a, int i) {
			if( i == 0) {
				return a[0];
			}
			return sum(a, i-1) + a[i];
		}
		
		public static int positive(int a [], int i) {
			if(i == 0) {
				if(a[0]<0) {                   //2, -1, 3 , 5   i = 3
					return 0;
				}
				else {
					return 1;
				}
			}
			if(a[i]>0) {
				return positive(a,i-1) + 1;
			}
			else {
				return positive(a,i-1);
			}
		}


		public static int indexNumInArray(int [] a, int num, int count) {
			if(count == 0) {
				return -1;
			}
			
			if(a[count] == num) {
				return count;
			}
			
			return indexNumInArray(a, num, count-1);	
		}

		public static boolean ascending(int [] a, int count) {
			if(count == 0) {
				return true;
			}
			if(a[count]>a[count-1]) {
				return ascending(a,count-1);
			}
			else {
				return false;
			}
		}

		public static boolean no_prime_numbers(int [] a, int count) {
			if(count == -1) {          // 6,8,4,10   count = גודל מערך
				return true;
			}
			if(prime(a[count],a[count])) {
				return false;
			}
			else {
				return no_prime_numbers(a, count-1);
			}
		}

		public static int sum_for_each_digit(int [] a, int n, int count) {
			if(count == -1) {   //14, 53, 23,65, 11112   5, 
				return 0;
			}
			if(sum(a[count]) == n) {
				return  sum_for_each_digit(a, n, count-1) + 1;
			}
			
		return sum_for_each_digit(a, n, count-1);
			
		}
		
		
		private static int sum(int number) {
			int sum = 0;
			while(number/10>0) {
				sum += number%10;
				number = number/10;
			}
			return sum + number % 10;
		}
		
		
		
		
		public static int sum_digit(int num) {
			int sum = 0;    
			if(num/10== 0) {
				return num%10;
			}
			else {
				sum+= num%10;   
			}
		
		return sum_digit(num/10) + sum;
	}
		
		public static int max_sum_digits(int [] a, int count,int max) {
			if(count == -1) {            // 45,53,213
				return max;
			}
			if(sum_digit(a[count])>max) {
				 max = sum_digit(a[count]);
			}
			return max_sum_digits(a,count-1,max) ;
		
	}
		public static int num_of_abc_in_string(String a, int count) {
			if(count == -1) {
				return 0;
			}
			if(a.charAt(count) == 'a' || a.charAt(count) == 'b' || a.charAt(count) == 'c' ) {
				return num_of_abc_in_string(a,count-1) + 1;
			}
			return num_of_abc_in_string(a,count-1);
		}
		
		public static void reverse_order_string(String a, int count, int countend) {///abc     --->  cba  0 2
			if(count == countend + 1) {
				return;
			}
			else if (count < countend+1) {                                  
				System.out.print(a.charAt(countend));
				reverse_order_string(a, count, countend-1);
				
			}
		}
		public static boolean palindrome(char[] arr, int i, int j) 
		{
			if(i >= j)
			{
				return true;
			}
			if(arr[i] != arr[j])
			{
				return false;
			}
			return palindrome(arr, i+1, j-1);
		}


}
