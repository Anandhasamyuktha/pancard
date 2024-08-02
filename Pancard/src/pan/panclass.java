package pan;
import java.util.*;

public class panclass {

	
		
		private static final String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		private static final String numbers="0123456789";
		private static final Random RANDOM=new Random();
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name:");
			String name=sc.next();
			System.out.println("Enter your corresponding:1.Individual 2.Firm 3.Company 4.HUF 5.Association 6.Trust");
			int num=sc.nextInt();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<3;i++) {
				int idx=0;
				try {
					idx = RANDOM.nextInt(alphabets.length());
					sb.append(alphabets.charAt(idx));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(num==1) {
				sb.append("P");
			}
			else if(num==2) {
				sb.append("F");
			}
			else if(num==3) {
				sb.append("C");
			}
			else if(num==4) {
				sb.append("H");
			}
			else if(num==5) {
				sb.append("A");
			}
			else {
				sb.append("T");
			}
			sb.append(name.charAt(0));
			for(int i=0;i<4;i++) {
				int idx=0;
				idx=RANDOM.nextInt(numbers.length());
				sb.append(numbers.charAt(idx));
			}
			int ind=RANDOM.nextInt(alphabets.length());
			sb.append(alphabets.charAt(ind));
			System.out.println("The PANCARD number is:"+sb.toString());
			sc.close();
	

}
}
