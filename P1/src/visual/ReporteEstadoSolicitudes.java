package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import logico.Bolsa;
import logico.EmpresaSolicitadora;
import logico.Obrero;
import logico.SolicitudesObrero;
import logico.SolicitudesTecnico;
import logico.SolicitudesUni;
import logico.Tecnico;
import logico.Universitario;

import javax.swing.JFormattedTextField;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class ReporteEstadoSolicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombreEmpresa;
	private JTextField txtciudadEmpresa;
	private static MaskFormatter formatoRNC;
	private EmpresaSolicitadora miEmpresa;
	private JTable table;
	private JFormattedTextField txttelefonoEmpresa;
	private static Object[] fila;
	private static DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReporteEstadoSolicitudes dialog = new ReporteEstadoSolicitudes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ReporteEstadoSolicitudes() {
		setResizable(false);
		setBounds(100, 100, 681, 474);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 675, 48);
		contentPanel.add(panel);
		
		JLabel lblEstadoDeSolicitudes = new JLabel("Estado de solicitudes");
		lblEstadoDeSolicitudes.setForeground(Color.WHITE);
		lblEstadoDeSolicitudes.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblEstadoDeSolicitudes.setBounds(227, 0, 281, 46);
		panel.add(lblEstadoDeSolicitudes);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 47, 675, 108);
		contentPanel.add(panel_1);
		
		JLabel label = new JLabel("Ingrese el RNC :");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 191, 28);
		panel_1.add(label);
		
		JFormattedTextField txtRNC = new JFormattedTextField();
		txtRNC.setForeground(Color.BLACK);
		txtRNC.setColumns(10);
		txtRNC.setBackground(new Color(211, 211, 211));
		txtRNC.setBounds(164, 18, 158, 23);
		panel_1.add(txtRNC);
		
		JButton button = new JButton("Buscar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtRNC.getText().toString().equalsIgnoreCase("")||Bolsa.buscarEmpresa(txtRNC.getText().toString())==null){
					JOptionPane.showMessageDialog(null, "No se ha encontrado la empresa", "Informaci�n", JOptionPane.WARNING_MESSAGE);
				}
				else{
				miEmpresa = Bolsa.buscarEmpresa(txtRNC.getText().toString());
				txtnombreEmpresa.setText(miEmpresa.getNombreEmpresa());
				txtciudadEmpresa.setText(miEmpresa.getCiudad());
				txttelefonoEmpresa.setText(miEmpresa.getTelefonoEmpresa());	
				loadTable();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setActionCommand("OK");
		button.setBounds(218, 42, 104, 27);
		panel_1.add(button);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(360, 20, 68, 14);
		panel_1.add(label_1);
		
		txtnombreEmpresa = new JTextField();
		txtnombreEmpresa.setForeground(Color.BLACK);
		txtnombreEmpresa.setEditable(false);
		txtnombreEmpresa.setColumns(10);
		txtnombreEmpresa.setBackground(new Color(211, 211, 211));
		txtnombreEmpresa.setBounds(438, 18, 177, 23);
		panel_1.add(txtnombreEmpresa);
		
		JLabel label_2 = new JLabel("Telefono:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(360, 75, 81, 14);
		panel_1.add(label_2);
		
		txtciudadEmpresa = new JTextField();
		txtciudadEmpresa.setForeground(Color.BLACK);
		txtciudadEmpresa.setEditable(false);
		txtciudadEmpresa.setColumns(10);
		txtciudadEmpresa.setBackground(new Color(211, 211, 211));
		txtciudadEmpresa.setBounds(438, 45, 177, 23);
		panel_1.add(txtciudadEmpresa);
		
		JLabel label_3 = new JLabel("Ciudad:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(360, 49, 93, 14);
		panel_1.add(label_3);
		
		txttelefonoEmpresa = new JFormattedTextField();
		txttelefonoEmpresa.setForeground(Color.BLACK);
		txttelefonoEmpresa.setEditable(false);
		txttelefonoEmpresa.setColumns(10);
		txttelefonoEmpresa.setBackground(new Color(211, 211, 211));
		txttelefonoEmpresa.setBounds(438, 73, 177, 23);
		panel_1.add(txttelefonoEmpresa);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 156, 675, 256);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		String[] columnName = {"Categoria","Profesion","Salario","Contraciones","Plazas","Satisfecho"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columnName);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 655, 234);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setForeground(Color.WHITE);
		table.setBackground(new Color(220, 20, 60));
		table.setModel(model);
		scrollPane.setViewportView(table);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	public void loadTable() {
		int a=0;
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int b=0; b<miEmpresa.getMiSolicitudes().size();b++){
				String tipo="";
				if(miEmpresa.getMiSolicitudes().get(b) instanceof SolicitudesUni)
					tipo="Universitario";
				if(miEmpresa.getMiSolicitudes().get(b) instanceof SolicitudesObrero)
					tipo="Obrero";
				if(miEmpresa.getMiSolicitudes().get(b) instanceof SolicitudesTecnico)
					tipo="Tecnico";
				
				fila[0]=tipo;
				String profesion="";
				if(miEmpresa.getMiSolicitudes().get(b) instanceof SolicitudesUni)
					profesion = (String) ((SolicitudesUni) miEmpresa.getMiSolicitudes().get(b)).getCarrera();
				if(miEmpresa.getMiSolicitudes().get(b) instanceof SolicitudesObrero)
					profesion = (String) ((SolicitudesObrero) miEmpresa.getMiSolicitudes().get(b)).getListaHabilidades().get(0);
				if(miEmpresa.getMiSolicitudes().get(b) instanceof SolicitudesTecnico)
					profesion = (String) ((SolicitudesTecnico) miEmpresa.getMiSolicitudes().get(b)).getTecnico();
				 
				fila[1]= profesion;
				fila[2] = miEmpresa.getMiSolicitudes().get(b).getSalirioSolicitado();
				fila[3] = miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().size();
				fila[4] = miEmpresa.getMiSolicitudes().get(b).getPlaza();
				fila[5] = miEmpresa.getMiSolicitudes().get(b).isSatisfecho();
				model.addRow(fila);
					
		}
	}
}
