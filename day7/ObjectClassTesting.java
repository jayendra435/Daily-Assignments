package day7;
import java.util.Objects;
public class ObjectClassTesting {
	private String name;
	private int id;
	
	ObjectClassTesting(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	
	public String toString() {
		return "For toString() method We are returning some String which describes the object";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || obj.getClass()!=this.getClass()) {
			return false;
		}
		ObjectClassTesting oct = (ObjectClassTesting)obj;
		
		return this.name == oct.name && this.id==oct.id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,id);
	}
}
