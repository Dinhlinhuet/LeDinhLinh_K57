package default1;

public class Program1 {
	public static void BubbleSort( int [ ] num )
	{
	     int j;int x;
	     boolean flag = true;   
	     int temp;  

	     while ( flag )
	     {
	            flag= false;    
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] < num[j+1] )  
	                   {
	                           temp = num[ j ];              
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;            
	                  } 
	            } 
	      } 
	} 
	public static void Print(int [] num) {
		for(int i=0;i<num.length-1;i++) {
			System.out.println(num[i]);
		}
	}
	public static void main(String []args) {
		int Arr[] = {5,6,10,1,2,4};
		BubbleSort(Arr);
		Print(Arr);
	}//no changing
}
