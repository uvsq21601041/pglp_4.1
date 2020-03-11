package pglp4_1.pglp4_1;
interface Iterator {
    boolean hasNext();
    Object  next();
}
public class AffichepersonGroupe implements Iterator{
	
	Person person;
	List<String> list;
	int index=0;
	int length=0;
	
	public TvIterator(Tv tv){
		this.tv=tv;
		this.list=tv.getChannels();
		length=list.size();
	}
	
	public Object next(){
		return list.get(index++);
	}
	public boolean hasNext(){
		if(index>=length){
			return false;
		}
		else{
			return true;
		}
	}


}