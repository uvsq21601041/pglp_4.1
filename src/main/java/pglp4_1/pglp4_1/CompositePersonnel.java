package pglp4_1.pglp4_1;

import java.util.ArrayList;
import java.util.List;

public class CompositePersonnel implements Person{
	private List<Personnel> people = new ArrayList<Personnel>();
	public void print() {
		for (Personnel personnel : people) {
			personnel.print();
		}
	}
		public void add(Personnel personnel) {
			people.add(personnel);
		}
		public void remove(Personnel personnel) {
			people.remove(personnel);
		}
		public List<Personnel> getPersonnel(){
			return people;
		}

		
	

}
