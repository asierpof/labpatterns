package adapter;

import java.util.List;

import domain.Symptom;

public class InvertedIteratorCovid19Patient implements InvertedIterator {
	List<Symptom> symptoms;
	int position=0;
	public InvertedIteratorCovid19Patient(List<Symptom> sy) {
		symptoms=sy;
		position=sy.size();
	}
	@Override
	public Object previous() {
		Symptom symptom=symptoms.get(position--);
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
	   return position>=0;
        }

	@Override
	public void goLast() {
		this.position= this.symptoms.size()-1;
		
	}
}




