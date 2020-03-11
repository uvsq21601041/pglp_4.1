package pglp4_1.pglp4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;



public class TestIterator {
	
	
	@org.junit.Test
	public void test() {
		LocalDate l = LocalDate.now();
	Iterator<Personnel> p = new AffichepersonGroupe(null);
	ArrayList<Integer> list=new ArrayList<>();
	for(int i = 0;i<10;i++){
		list.add(i);
		list.add(i);
	}
	Personnel a =new Personnel.Builder("aaa", "bbb","ccc", l,list);
	p.add(a);
	
    Iterator<Personnel> i = p.iterator();
    while (i.hasNext()){
        System.out.println(i.next());
    }
}
}


