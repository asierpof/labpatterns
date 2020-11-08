package adapter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

public class AdapterMain {

	public static void main(String[] args) {
		ArrayList<Symptom> sList = new ArrayList<Symptom>();
		SymptomFactory sy = new SymptomFactory();
		Covid19Pacient p=new Covid19Pacient("Ane", 29,sy);
		Comparator ic = new IndexComparator();
		Comparator cc = new SymptomNameComparator();
		Sorting s = new Sorting();
		p.addSymptom(new Symptom("s1", 10, 5), 1);
		p.addSymptom(new Symptom("s2", 10, 6), 2);
		p.addSymptom(new Symptom("s3", 10, 7), 3);
		p.addSymptom(new Symptom("s4", 10, 8), 4);
		p.addSymptom(new Symptom("s5", 10, 9), 5);
		InvertedIterator it = new InvertedIteratorCovid19Patient(new ArrayList<Symptom>(p.getSymptoms()));
		Iterator i=s.sortedIterator(it,cc);
		while(i.hasNext())
			System.out.println(i.next());

		System.out.println();
	Iterator j = s.sortedIterator(it,ic);
	while(j.hasNext())
		System.out.println(j.next());
	}
}
	

		
	


