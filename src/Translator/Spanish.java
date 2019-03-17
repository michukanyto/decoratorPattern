package Translator;

public class Spanish implements Translator {
	
	private Translator bt;
	private String competence;
	
	

	public Spanish(Translator bt) {
		super();
		this.bt = bt;
		this.competence = "Spanish, ";
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
