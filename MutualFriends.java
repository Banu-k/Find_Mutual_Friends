import java.util.HashMap;
import java.util.Scanner;

public class MutualFriends {
	static Scanner sc = new Scanner(System.in);
	public static void values(HashMap<Integer,String[]> hm) {
		System.out.println("Enter First Person Num: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Person Num: ");
		int num2 = sc.nextInt();
		
		String[] s1 = hm.get(num1);
		String[] s2 = hm.get(num2);
		
		System.out.println("Person " +num1 +" & Person " +num2 +" Common Friends: ");
		
		for(int i = 0; i<s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i].equals(s2[j])) {
					System.out.println(s1[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		String[] person1 = {"BANU", "REKHA", "PRIYA", "HASINI", "DHEEKSHA", "SUGUNTHAN" };
		String[] person2 = {"VICKY", "LOHIT", "PRIYA", "HASINI", "DHEEKSHA", "TANYA" };
		String[] person3 = {"VICKY", "LOHIT", "MOKSHI", "AJJU", "ANU", "TANYA" };
		String[] person4 = {"REKHA", "LOHIT", "BANU", "HASINI", "JILLU", "TANYA" };
		String[] person5 = {"VICKY", "SHESAI", "BHUNA", "HASINI", "SUGUNTHAN", "TANYA" };
		
		HashMap<Integer, String[]> hm = new HashMap<>();
		hm.put(1, person1);
		hm.put(2, person2);
		hm.put(3, person3);
		hm.put(4, person4);
		hm.put(5, person5);
		values(hm);
		
	}
}
