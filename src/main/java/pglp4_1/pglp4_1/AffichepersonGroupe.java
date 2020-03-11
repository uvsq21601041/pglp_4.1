package pglp4_1.pglp4_1;

import java.util.ArrayList;
import java.util.List;

interface Iterator {
	
    boolean hasNext();
    Personnel  next();
    void add(Personnel obj);
    
}
public class AffichepersonGroupe implements Iterator{
	private List<Personnel> list = new ArrayList<Personnel>();
	private int cursor = 0;
	
	public void add(Personnel p) {
        list.add(p);
    }
	public AffichepersonGroupe(List<Personnel> list){
		this.list=list;
		
		
	}
	
	public Personnel next() {
        Personnel p = null;
        if(this.hasNext()) {
            p = this.list.get(cursor++);
        }
        return p;
    }

	 public boolean hasNext() {
	        return cursor != list.size();
	    }


}