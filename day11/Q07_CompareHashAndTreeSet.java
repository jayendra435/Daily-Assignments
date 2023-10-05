package day11;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Q07_CompareHashAndTreeSet {
	public static void main(String[] args) {
		HashSet<Object> one = new HashSet <Object>();
		TreeSet<Object> two = new TreeSet <Object>();
		
		one.add(new Circle(1,2));
		one.add(new Circle(3,4));
		one.add(new Circle(1,2));
		for(Object obj:one) {
			System.out.println(obj);
		}
		System.out.println("------------");
		two.add(new Circle(1,2));
		two.add(new Circle(3,4));
		two.add(new Circle(1,2));
		for(Object obj:two) {
			System.out.println(obj);
		}
	}
}
class Circle implements Comparable<Circle>{
	private int x,y;
	Circle(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "x: "+this.x+" y: "+this.y;
	}
	public int compareTo(Circle c) {
		return this.x-c.x;
	}
	public int hashCode() {
		return Objects.hash(2,4);
	}
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(this.x == c.x && this.y==c.y) {
			return true;
		}
		else {
			return false;
		}
	}
}
