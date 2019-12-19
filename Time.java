
public class Time {
	public static void main(String[]args){
		
	int hour=21, min=12, second=40 , minsecond=60 ,hoursecond=3600 ,midnight=min * minsecond +hour*hoursecond+second, 
	minds=(24-hour)*3600+(0-min)*60+(0-second);
	double proc=(midnight*100)/(24*3600);
		System.out.println("the time is " + hour +":"+ min+":"+second);
		System.out.println("the second midnight " +midnight);
		System.out.println("the second remaining " +minds);
		System.out.println("the second porcentage " +proc);

}
}