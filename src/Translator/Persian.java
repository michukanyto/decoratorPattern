package Translator;

public class Persian implements Translator {
	
	private Translator bt;
	private String competence;
	
	
	public Persian(Translator bt) {
		super();
		this.bt = bt;
		this.competence = "Persian, ";
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

