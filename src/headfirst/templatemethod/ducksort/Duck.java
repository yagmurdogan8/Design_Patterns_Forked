package headfirst.templatemethod.ducksort;

public class Duck implements Comparable<Duck> {
	String name;
	int weight;
  
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
 
	public String toString() {
		return name + " weighs " + weight;
	}

	public int compareTo(Duck object) {
		return Integer.compare(this.weight, object.weight);
	}
}
