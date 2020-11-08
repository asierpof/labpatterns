package observer;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;


public class SemaphorGUI extends JFrame implements Observer {
	/** stores the associated ConcreteSubject */
	private Container a;
	private Observable obs;
	public SemaphorGUI	(Observable obs)	{
		setSize(150,	150);
		setLocation(350,10);
		Color	c=	Color.green;
		a=getContentPane();
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
		}


	public void update(Observable	o,Object arg)	{
		Covid19Pacient	p=(Covid19Pacient)o;
//			Obtain	the		current covidImpact	to	paint
		int farenheit =	(int)	p.covidImpact();	
//			temperature	gauge	update
		if(5>farenheit)
			a.setBackground(Color.green);
		if(10>farenheit&&farenheit>=5)
			a.setBackground(Color.yellow);
		if(10<=farenheit)
			a.setBackground(Color.red);
		repaint();
		}
	
}     

