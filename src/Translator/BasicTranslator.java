package Translator;

public class BasicTranslator implements Translator {
	
	private String name;
	
	public BasicTranslator(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Translator name is : " + name;
	}

	@Override
	public String getCompetence() {
		// TODO Auto-generated method stub
		return "His/Her competences are : ";
	}

}
