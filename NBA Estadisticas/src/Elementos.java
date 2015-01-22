import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class Elementos extends JFrame {

	private JPanel contentPane;
	private JTextField MediaOfensivosA;
	private JTextField MediaOfensivosB;
	private JTextField MediaDefensivosA;
	private JTextField MediaDefensivosB;
	private JTextField MediaPuntosA;
	private JTextField MediaPuntosB;
	private JTextField PuntosOfensivosEquipos;
	private JTextField PuntosPartidoEquipos;
	private JTextField MediaGlobalEquipos;
	
	//Variables
	private String equipos []={"Golden State","Dallas","Toronto","Phoenix","LA Clippers","Portland","Atlanta","Boston","Denver","San Antonio","Sacramento","Chicago","Houston","Memphis","LA Lakers","New Orleans","Cleveland","Washington","Oklahoma City","Milwaukee","Minesota","Detroit","Charlotte","Utah","Brooklyn","Indiana","Orlando","Miami","New York","Philadelphia"};
	private float mediaofensivos []={109.2f,108.8f,107.8f,107f,106.4f,103.8f,102.9f,102.6f,102.3f,102.3f,102.2f,102.1f,101.8f,101.8f,101.4f,101.3f,99.8f,99.6f,98.8f,98.5f,98.2f,97.7f,96f,96f,95.6f,95.3f,94.2f,94f,92.9f,90.6f};
	private float mediadefensivos []={98.2f,102.5f,101.9f,105f,100f,96.4f,97.2f,103.8f,103.6f,98.4f,103.7f,99.1f,96.9f,98.1f,107.5f,101f,99.9f,97.6f,98f,97.7f,108.3f,99.8f,98.9f,99.1f,98.1f,96.7f,99.7f,98f,101.9f,103f};
	
	
	public Elementos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//JLabels que definen en la parte fisual.
			JLabel lblEquipoA = new JLabel("Equipo A");
			lblEquipoA.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblEquipoA.setBounds(10, 25, 95, 18);
			contentPane.add(lblEquipoA);
		
			JLabel lblEquipoB = new JLabel("Equipo B");
			lblEquipoB.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblEquipoB.setBounds(297, 25, 95, 18);
			contentPane.add(lblEquipoB);
		
			JLabel PuntosAtaqueA = new JLabel("Puntos Ofensivos Equipo B");
			PuntosAtaqueA.setFont(new Font("Tahoma", Font.PLAIN, 14));
			PuntosAtaqueA.setBounds(297, 106, 177, 18);
			contentPane.add(PuntosAtaqueA);
		
			JLabel PuntosAtaqueB = new JLabel("Puntos Ofensivos Equipo A");
			PuntosAtaqueB.setFont(new Font("Tahoma", Font.PLAIN, 14));
			PuntosAtaqueB.setBounds(10, 106, 177, 18);
			contentPane.add(PuntosAtaqueB);
		
			JLabel PuntosDefensivosA = new JLabel("Puntos Defensivos Equipo A");
			PuntosDefensivosA.setFont(new Font("Tahoma", Font.PLAIN, 14));
			PuntosDefensivosA.setBounds(10, 166, 177, 18);
			contentPane.add(PuntosDefensivosA);
		
			JLabel PuntosDefensivosB = new JLabel("Puntos Defensivos Equipo B");
			PuntosDefensivosB.setFont(new Font("Tahoma", Font.PLAIN, 14));
			PuntosDefensivosB.setBounds(297, 166, 177, 18);
			contentPane.add(PuntosDefensivosB);
		
			JLabel PuntosPartidoEquipoA = new JLabel("Media Puntos Partido Equipo A");
			PuntosPartidoEquipoA.setFont(new Font("Tahoma", Font.PLAIN, 14));
			PuntosPartidoEquipoA.setBounds(10, 226, 201, 18);
			contentPane.add(PuntosPartidoEquipoA);
		
			JLabel PuntosPartidoEquipo = new JLabel("Media Puntos Partido Equipo B");
			PuntosPartidoEquipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			PuntosPartidoEquipo.setBounds(290, 226, 201, 18);
			contentPane.add(PuntosPartidoEquipo);
		
			JLabel lblMediaPuntosPartido = new JLabel("Media Puntos Ofensivos 2 Equipos");
			lblMediaPuntosPartido.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblMediaPuntosPartido.setBounds(40, 324, 230, 18);
			contentPane.add(lblMediaPuntosPartido);
		
			JLabel lblM = new JLabel("Media Puntos Partido 2 Equipos");
			lblM.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblM.setBounds(40, 363, 201, 18);
			contentPane.add(lblM);
		
			JLabel lblMediaPuntosPartido_1 = new JLabel("Media Puntos Partido Global");
			lblMediaPuntosPartido_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblMediaPuntosPartido_1.setBounds(40, 401, 201, 18);
			contentPane.add(lblMediaPuntosPartido_1);
		
		
		//JTextField donde salen los valores de las medias
			MediaOfensivosA = new JTextField();
			MediaOfensivosA.setBounds(10, 135, 86, 20);
			contentPane.add(MediaOfensivosA);
			MediaOfensivosA.setColumns(10);
		
			MediaOfensivosB = new JTextField();
			MediaOfensivosB.setBounds(297, 135, 86, 20);
			contentPane.add(MediaOfensivosB);
			MediaOfensivosB.setColumns(10);
		
			MediaDefensivosA = new JTextField();
			MediaDefensivosA.setBounds(10, 195, 86, 20);
			contentPane.add(MediaDefensivosA);
			MediaDefensivosA.setColumns(10);
		
			MediaDefensivosB = new JTextField();
			MediaDefensivosB.setBounds(297, 195, 86, 20);
			contentPane.add(MediaDefensivosB);
			MediaDefensivosB.setColumns(10);
		
			MediaPuntosA = new JTextField();
			MediaPuntosA.setBounds(10, 257, 86, 20);
			contentPane.add(MediaPuntosA);
			MediaPuntosA.setColumns(10);
		
			MediaPuntosB = new JTextField();
			MediaPuntosB.setBounds(297, 255, 86, 20);
			contentPane.add(MediaPuntosB);
			MediaPuntosB.setColumns(10);
		
			PuntosOfensivosEquipos = new JTextField();
			PuntosOfensivosEquipos.setBounds(280, 325, 86, 20);
			contentPane.add(PuntosOfensivosEquipos);
			PuntosOfensivosEquipos.setColumns(10);
		
			PuntosPartidoEquipos = new JTextField();
			PuntosPartidoEquipos.setBounds(280, 364, 86, 20);
			contentPane.add(PuntosPartidoEquipos);
			PuntosPartidoEquipos.setColumns(10);
		
			MediaGlobalEquipos = new JTextField();
			MediaGlobalEquipos.setBounds(280, 402, 86, 20);
			contentPane.add(MediaGlobalEquipos);
			MediaGlobalEquipos.setColumns(10);
		
		
			//JComboBoxs que nos permitiran seleccionar los equipos.
			JComboBox BoxEquipoA = new JComboBox();
			BoxEquipoA.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
					int posicionA=BoxEquipoA.getSelectedIndex();
					MediaOfensivosA.setText(String.valueOf(mediaofensivos[posicionA]));
					MediaDefensivosA.setText(String.valueOf(mediadefensivos[posicionA]));
					MediaPuntosA.setText(String.valueOf(mediaofensivos[posicionA]+mediadefensivos[posicionA]));
				}
			});
			BoxEquipoA.setBounds(10, 54, 120, 20);
			contentPane.add(BoxEquipoA);
			
				
			JComboBox BoxEquipoB = new JComboBox();
			BoxEquipoB.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
					int posicionB=BoxEquipoB.getSelectedIndex();
					MediaOfensivosB.setText(String.valueOf(mediaofensivos[posicionB]));
					MediaDefensivosB.setText(String.valueOf(mediadefensivos[posicionB]));
					MediaPuntosB.setText(String.valueOf(mediaofensivos[posicionB]+mediadefensivos[posicionB]));
				}
			});
			BoxEquipoB.setBounds(297, 54, 120, 20);
			contentPane.add(BoxEquipoB);
			
			//Rellenado de los ComboBox
			for(int i=0;i<equipos.length;i++)
			{
				BoxEquipoA.addItem(equipos[i]);
				BoxEquipoB.addItem(equipos[i]);
			}
			
			//Medias Puntos Ofensivos de los dos Equipos.
			int posicionA=BoxEquipoA.getSelectedIndex();
			int posicionB=BoxEquipoB.getSelectedIndex();
			
			PuntosOfensivosEquipos.setText(String.valueOf(mediaofensivos[posicionA]+mediaofensivos[posicionA]));
	}
}
