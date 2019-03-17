package Translator;

public class Chineese implements Translator {
	
	private Translator bt;
	private String competence;
	
	
	public Chineese(Translator bt) {
		super();
		this.bt = bt;
		this.competence = "Chinese, ";
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
