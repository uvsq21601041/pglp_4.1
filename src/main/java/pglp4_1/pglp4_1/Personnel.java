package pglp4_1.pglp4_1;

import java.time.LocalDate;
import java.util.ArrayList;


interface Person{
	public void print();
	
}

public final class Personnel implements Person{
    private final String nom;
    private final String prenom;
    private final String fonction;
    private final LocalDate  Datenaissance;
    private final ArrayList<Integer> telephone;
    
    
    public static class Builder{
    	private String nom;
        private  String prenom;
        private  String fonction;
        private  LocalDate  Datenaissance;
        private  ArrayList<Integer> telephone;
        
        public Builder(String nom,String prenom,String fonction,LocalDate Datenaissance,ArrayList<Integer> telephone) {
        	this.nom=nom;
        	this.prenom=prenom;
        	this.fonction=fonction;
        	this.Datenaissance=Datenaissance;
        	this.telephone=telephone;
        	
        }
        public Builder setnom(String name) {
        nom = name;
        return this;
        }
    	public Personnel build() {
    		return new Personnel(this);
    	}
    }
    private Personnel(Builder builder) {
    	nom=builder.nom;
    	prenom=builder.prenom;
    	fonction=builder.fonction;
    	Datenaissance=builder.Datenaissance;
    	telephone=builder.telephone;
    	
    }
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("nom :"+nom);
		System.out.println("prenom :"+prenom);
		System.out.println("fonction :"+fonction);
		System.out.println("Date de naissance :"+Datenaissance);
		System.out.println("telephone :"+telephone);
		
		
	}
	
    
    
}

