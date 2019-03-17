package Translator;

public class Punjabi implements Translator {
	
	private Translator bt;
	private String competence;
	
	
	public Punjabi(Translator bt) {
		super();
		this.bt = bt;
		this.competence = "Punjabu, ";
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return bt.getName();
	}


	@Override
	public String getCompetence() {
		// TODO Auto-generated method stub
		return bt.getCompetence() + this.competence  ;
	}
	
	
	
	
	

}
