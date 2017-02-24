import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.Messaging.SyncScopeHelper;

public class MojeOkienko extends JFrame implements ActionListener {

	JButton bPodajDate, bWyjscie;
	JLabel lWyswietlDate; //deklarujemy pole etykiety
	
	public MojeOkienko() { // tworzymy konstruktor

		setSize(300, 200);// ustalamy rozmiar okienka
		setTitle("Moje pierwsze okienko");// ustalamy tytu� okienka
		setLayout(null);//Layout managera 
		setLocation(300, 300);// ustalamy lokalizacj� okienka na ekranie
		
		bPodajDate = new JButton("Podaj dat�");//tworzymy nowy przycisk
		bPodajDate.setBounds(50,50,100,20);//przyciskowi nadajemy pozycj� i rozmiary
		bPodajDate.setFont(new Font("fonft", Font.BOLD, 12));
		add(bPodajDate);//dodajemy stworzony przycisk
		bPodajDate.addActionListener(this); //dodajemy ActionListenera do przycisku this- bo sluchaczem zdarzen jest ca�a nasza ramka
		
		
		bWyjscie = new JButton("Wyjscie");
		bWyjscie.setBounds(150, 50, 100, 20);
		bWyjscie.setForeground(Color.RED);
		add(bWyjscie);
		bWyjscie.addActionListener(this);
		
		lWyswietlDate = new JLabel(" ");
		lWyswietlDate.setBounds(50, 100, 200, 20);
		lWyswietlDate.setForeground(Color.BLUE); //ustalamy kolor
		lWyswietlDate.setFont(new Font("SansSerif", Font.ITALIC, 12)); //definiujemy styl czcionki
		add(lWyswietlDate);
	
	}

	public static void main(String[] args) {

		MojeOkienko okienko = new MojeOkienko();// tworzymy nowy obiekt typu
												// okienko
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ustalamy, �e
																// po zamkni�ciu
																// okienka
																// zamykamy
																// program
		okienko.setVisible(true);// w��czamy widoczno�� okienka

	}

	@Override  //metoda nadpisana z interfejsu ActionListener - s�uchacz zdarze� - definiujemy to co chcemy, zeby si� sta�o po naci�ni�ciu przycisku
	public void actionPerformed(ActionEvent e) {

		Object zrodlo = e.getSource();//tworzymy zmienna zrodlo i przypisujemy do niej obiekt, ktory byl zrodlem zdarzenia
		
		if (zrodlo == bPodajDate) {
			
			lWyswietlDate.setText("Data: " +(new Date()).toString()); //wyswietlamy wynik w aplecie
		}
		else dispose();
		
	}

}
