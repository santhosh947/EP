//We are given a specific time(like 02:23), we need to get the angle between hour and minute(less than 180)


public class angle {

	public static void main(String[] args){
		angle("2:30");
		angle("2:50");
	}

	public static void angle(String str){
	   String[] time=str.split(":");
	   double angle=Math.abs(((5.5*Integer.parseInt(time[1]))-(30*Integer.parseInt(time[0]))));
	   if (angle>180) {
		angle=360-angle;
	   }
	   System.out.println("Angle is : " + angle);
	}

}
