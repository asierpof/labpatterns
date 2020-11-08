package adapter;

import java.util.Comparator;

import domain.Symptom;

public class IndexComparator implements Comparator<Symptom>{
	public int compare(Symptom o1, Symptom o2) {
		if(o1.getSeverityIndex()<o2.getSeverityIndex())
		return 1;
		if(o1.getSeverityIndex()>o2.getSeverityIndex())
		return -1;
		return 0;
		
	}
}

