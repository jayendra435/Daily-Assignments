package day08;

import java.util.Arrays;
import java.util.Comparator;

public class Q02_ObjectSortedByAge {
	public static void main(String[] args) {
		Details p1 = new Details("jay",29);
		Details p2 = new Details("Satish",22);
		Details p3 = new Details("Chakitha",25);
		Details p4 = new Details("jahnavi",15);
		Details objArr[] = new Details[] {p1,p2,p3,p4};
		Arrays.sort(objArr);
		for(Object obj:objArr) {
			System.out.println(obj);
		}
	}
}
class Details implements Comparable<Details>{
	private String name;
	private int age;
	Details(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "name: "+name+" "+"age: "+age;
	}
	public int compareTo(Details obj) {
		//return this.name.compareTo(obj.name);
		return this.age-obj.age;
	}
//	public int compare(Details ob1, Details ob2) {
//		return ob1.age-ob2.age;
//	}
}
