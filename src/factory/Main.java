package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		SymptomFactory sy = new SymptomFactory();
		Covid19Pacient p1=new Covid19Pacient("aitor", 35,sy);
		new PacientSymptomGUI(p1);

	}

}
