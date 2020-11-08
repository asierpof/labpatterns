package observer;

import java.util.Observable;
import java.util.Observer;
import factory.SymptomFactory;
import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			SymptomFactory sy = new SymptomFactory();
			Observable pacient=new Covid19Pacient("aitor", 35,sy);
			Observable pacient1=new Covid19Pacient("asier", 65,sy);
			PacientObserverGUI pacientGUI= new PacientObserverGUI ( pacient);
			PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient) pacient);
			PacientThermometerGUI pther = new PacientThermometerGUI((Observable) pacient);
			SemaphorGUI se = new SemaphorGUI(pacient);
			PacientObserverGUI pacientGUI1= new PacientObserverGUI ( pacient1);
			PacientSymptomGUI frame1 = new PacientSymptomGUI ((Covid19Pacient) pacient1);
			PacientThermometerGUI pther1 = new PacientThermometerGUI((Observable) pacient1);
			SemaphorGUI se1 = new SemaphorGUI(pacient1);	
	}


}
