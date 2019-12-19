
public class Time {
	public static void main(String[]args){
		
	int hour=21, min=58, second=21 , minsecond=60 ,hoursecond=3600 ,midnight=min * minsecond +hour*hoursecond+second, 
	minds=(24-hour)*3600+(60-min)*60+(60-second);
	
		System.out.println("the time is " + hour +":"+ min+":"+second);
		System.out.println("the second midnight " +midnight);
		System.out.println("the second remaining " +minds);
}
}