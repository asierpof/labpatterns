package adapter;

import java.util.Comparator;

import domain.Covid19Pacient;
import domain.Symptom;

public class SymptomNameComparator implements Comparator<Symptom> {
	
	public int compare(Symptom o1, Symptom o2) {
		if(o1.getName().compareTo(o2.getName())>0)
		return 1;
		if(o1.getName().compareTo(o2.getName())<0)
		return -1;
		return 0;

	}

}

