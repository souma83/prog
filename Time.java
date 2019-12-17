
public class Time {
	public static void main(String[]args){
		
	int hour=00, min=46, second=38 , minsecond=60 ,hoursecond=3600 ,midnight=min * minsecond +hour*hoursecond+second;
	
		System.out.println("the time is " + hour +":"+ min+":"+second);
		System.out.println("the second midnight " +midnight);		
}
}