package Translator;

public class Portugees implements Translator{
	
	private Translator bt;
	private String competence;
	
	
	public Portugees(Translator bt) {
		super();
		this.bt = bt;
		this.competence = "Portugees, ";
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
