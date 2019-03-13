/**
 * 
 */
import java.io.*;
import java.util.*;
/**
 * @author sagnik
 *
 */
 
/**
 * 
 */

/**
 * @author sagnik
 *
 */
class Student {
	String name;
	double cgpa;
	int token;
	Student(String n, double c, int t) {
		name = n;
		cgpa = c;
		token = t;
	}
	
}

 
class Ideone {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number of events");
		int n = sc.nextInt();
		PriorityQueue<Student> pq = new PriorityQueue<Student>(1, new StudentCompare());
		
		while(n-- > 0) {
			
			String str = sc.next();
			if(str.equals("ENTER") == true) {
				
				String name = sc.next();
				double cgpa = sc.nextDouble();
				int token = sc.nextInt();
				Student obj = new Student(name, cgpa, token);
				pq.add(obj);
			}
			else {
				pq.remove();
			}
		}
		
		if(pq.isEmpty()) {
			System.out.println("EMPTY");
		}
		else {
				while(!pq.isEmpty()) {
					System.out.println(pq.poll().name);
				}
			
		}

	}

}

class StudentCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if(s1.cgpa < s2.cgpa)
			return 1;
		else if(s1.cgpa == s2.cgpa && s1.name.compareTo(s2.name) > 0)
			return 1;
		else if(s1.cgpa == s2.cgpa && s1.name.equals(s2.name) && s1.token > s2.token) 
			return 1;
		else return -1;
	}
}
