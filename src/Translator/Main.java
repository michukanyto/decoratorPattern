package Translator;

public class Main {

	public static void main(String[] args) {
		Translator basicTranslator = new BasicTranslator("Marlon");
		Translator translator = new Spanish(basicTranslator);
		Translator translator2 = new Portugees(translator);
		
		System.out.println(translator2.getName() + "\n" + translator2.getCompetence() + "\n");
		
		
		Translator  translator3 = new Portugees(new Spanish(new Persian(new Chineese(new BasicTranslator("Marlon")))));
		System.out.println(translator3.getName() + "\n" + translator3.getCompetence());

	}

}
