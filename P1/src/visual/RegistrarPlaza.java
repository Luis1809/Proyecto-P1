package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RegistrarPlaza extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txtnombreEmpresa;
	private JTextField txtciudadEmpresa;
	private JTextField txttelefonoEmpresa;
	private JTextField textField_4;
	private JPanel panel_principal;
	private JPanel panel_secundario;
	private JButton btnPag;
	private JButton btnPag_1;
	private final ButtonGroup btnGroupSexo = new ButtonGroup();
	private final ButtonGroup btnGroupNivelEducativo = new ButtonGroup();

	public RegistrarPlaza() {
		setResizable(false);
		setTitle("Registrar Empleo");
		setBounds(100, 100, 681, 598);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel_principal = new JPanel();
		panel_principal.setBorder(new TitledBorder(null, "Formulario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_principal.setBackground(new Color(255, 255, 255));
		panel_principal.setBounds(10, 198, 655, 334);
		contentPanel.add(panel_principal);
		panel_principal.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(305, 170, 345, 148);
		panel_principal.add(panel_4);
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setLayout(null);
		
		JPanel pTecnico = new JPanel();
		pTecnico.setBackground(new Color(255, 255, 255));
		pTecnico.setBounds(10, 64, 318, 73);
		panel_4.add(pTecnico);
		pTecnico.setLayout(null);
		
		JLabel label_10 = new JLabel("Institucion:");
		label_10.setBounds(10, 17, 84, 16);
		pTecnico.add(label_10);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBackground(new Color(211, 211, 211));
		comboBox_9.setBounds(86, 11, 222, 20);
		pTecnico.add(comboBox_9);
		
		JLabel label_11 = new JLabel("Carrera:");
		label_11.setBounds(10, 44, 61, 16);
		pTecnico.add(label_11);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBackground(new Color(211, 211, 211));
		comboBox_10.setBounds(86, 42, 222, 20);
		pTecnico.add(comboBox_10);
		
		JLabel label = new JLabel("Nivel educativo:");
		label.setFont(new Font("Dialog", Font.BOLD, 13));
		label.setBounds(92, 11, 115, 16);
		panel_4.add(label);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(92, 25, 109, 12);
		panel_4.add(separator_4);
		
		JRadioButton btnUniversitario = new JRadioButton("Universitario");
		btnGroupNivelEducativo.add(btnUniversitario);
		btnUniversitario.setBackground(Color.WHITE);
		btnUniversitario.setBounds(21, 34, 115, 23);
		panel_4.add(btnUniversitario);
		
		JRadioButton btnTecnico = new JRadioButton("Tecnico");
		btnGroupNivelEducativo.add(btnTecnico);
		btnTecnico.setBackground(Color.WHITE);
		btnTecnico.setBounds(138, 34, 93, 23);
		panel_4.add(btnTecnico);
		
		JRadioButton btnObrero = new JRadioButton("Obrero");
		btnGroupNivelEducativo.add(btnObrero);
		btnObrero.setBackground(Color.WHITE);
		btnObrero.setBounds(233, 34, 76, 23);
		panel_4.add(btnObrero);
		
		JPanel pUniversitario = new JPanel();
		pUniversitario.setBackground(new Color(255, 255, 255));
		pUniversitario.setBounds(10, 64, 318, 73);
		panel_4.add(pUniversitario);
		pUniversitario.setLayout(null);
		
		JLabel label_3 = new JLabel("Institucion:");
		label_3.setBounds(10, 17, 84, 16);
		pUniversitario.add(label_3);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBackground(new Color(211, 211, 211));
		comboBox_7.setBounds(86, 11, 222, 20);
		pUniversitario.add(comboBox_7);
		
		JLabel label_9 = new JLabel("Carrera:");
		label_9.setBounds(10, 44, 61, 16);
		pUniversitario.add(label_9);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBackground(new Color(211, 211, 211));
		comboBox_8.setBounds(86, 42, 222, 20);
		pUniversitario.add(comboBox_8);
		
		JPanel pObrero = new JPanel();
		pObrero.setBackground(new Color(255, 255, 255));
		pObrero.setBounds(10, 64, 318, 73);
		panel_4.add(pObrero);
		pObrero.setLayout(null);
		
		JLabel label_1 = new JLabel("Habilidad:");
		label_1.setBounds(6, 17, 71, 16);
		pObrero.add(label_1);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBackground(new Color(211, 211, 211));
		comboBox_5.setBounds(82, 11, 226, 20);
		pObrero.add(comboBox_5);
		
		JCheckBox checkBox_2 = new JCheckBox("Otro?");
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setBounds(6, 44, 63, 23);
		pObrero.add(checkBox_2);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setEnabled(false);
		comboBox_6.setBackground(new Color(211, 211, 211));
		comboBox_6.setBounds(82, 42, 226, 20);
		pObrero.add(comboBox_6);
		{
			JPanel panelinfo = new JPanel();
			panelinfo.setBounds(313, 11, 329, 148);
			panel_principal.add(panelinfo);
			panelinfo.setBackground(new Color(255, 255, 255));
			panelinfo.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelinfo.setLayout(null);
			
			JRadioButton btnMasculino = new JRadioButton("Masculino");
			btnGroupSexo.add(btnMasculino);
			btnMasculino.setBackground(new Color(255, 255, 255));
			btnMasculino.setBounds(125, 21, 71, 23);
			panelinfo.add(btnMasculino);
			
			JRadioButton btnFemenino = new JRadioButton("Femenino");
			btnGroupSexo.add(btnFemenino);
			btnFemenino.setBackground(new Color(255, 255, 255));
			btnFemenino.setBounds(51, 21, 71, 23);
			panelinfo.add(btnFemenino);
			
			JLabel label_7_1 = new JLabel("Sexo:");
			label_7_1.setBounds(10, 25, 46, 14);
			panelinfo.add(label_7_1);
			
			JRadioButton btnNoAplica = new JRadioButton("N/A");
			btnGroupSexo.add(btnNoAplica);
			btnNoAplica.setBackground(new Color(255, 255, 255));
			btnNoAplica.setBounds(209, 21, 55, 23);
			panelinfo.add(btnNoAplica);
			
			JLabel label_12 = new JLabel("Cuidad:");
			label_12.setBounds(10, 53, 46, 14);
			panelinfo.add(label_12);
			
			JComboBox cbxCuidadSolicitada = new JComboBox();
			cbxCuidadSolicitada.setBackground(new Color(211, 211, 211));
			cbxCuidadSolicitada.setBounds(104, 51, 207, 20);
			panelinfo.add(cbxCuidadSolicitada);
			
			JLabel label_1_1 = new JLabel("Pais:");
			label_1_1.setBounds(10, 82, 46, 14);
			panelinfo.add(label_1_1);
			
			JComboBox cbxPais = new JComboBox();
			cbxPais.setBackground(new Color(211, 211, 211));
			cbxPais.setBounds(104, 80, 207, 20);
			panelinfo.add(cbxPais);
			
			JLabel label_2_1 = new JLabel("Estado Civil:");
			label_2_1.setBounds(10, 107, 101, 16);
			panelinfo.add(label_2_1);
			
			JComboBox cbxEstadoCivil = new JComboBox();
			cbxEstadoCivil.setBackground(new Color(211, 211, 211));
			cbxEstadoCivil.setBounds(104, 107, 207, 20);
			panelinfo.add(cbxEstadoCivil);
		}
		
		JPanel panellaborlal = new JPanel();
		panellaborlal.setBounds(5, 164, 290, 154);
		panel_principal.add(panellaborlal);
		panellaborlal.setBackground(new Color(255, 255, 255));
		panellaborlal.setLayout(null);
		panellaborlal.setBorder(new TitledBorder(null, "Experiencia Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel label_2 = new JLabel("Area de Trabajo:");
		label_2.setBounds(22, 36, 110, 16);
		panellaborlal.add(label_2);
		
		JComboBox cbxAreaTrabajo = new JComboBox();
		cbxAreaTrabajo.setBackground(new Color(211, 211, 211));
		cbxAreaTrabajo.setBounds(139, 34, 142, 20);
		panellaborlal.add(cbxAreaTrabajo);
		
		JLabel label_5 = new JLabel("Tiempo de experiencia:");
		label_5.setBounds(22, 76, 134, 14);
		panellaborlal.add(label_5);
		
		JSpinner snpTiempoExp = new JSpinner();
		snpTiempoExp.setBounds(171, 73, 110, 20);
		panellaborlal.add(snpTiempoExp);
		
		panel_secundario = new JPanel();
		panel_secundario.setBackground(new Color(255, 255, 255));
		panel_secundario.setBounds(0, 198, 675, 313);
		contentPanel.add(panel_secundario);
		panel_secundario.setLayout(null);
		panel_secundario.setVisible(false);
		
		
		JPanel panelPlazaAreaDeExperiencia = new JPanel();
		panelPlazaAreaDeExperiencia.setBounds(372, 21, 293, 256);
		panel_secundario.add(panelPlazaAreaDeExperiencia);
		panelPlazaAreaDeExperiencia.setBackground(new Color(255, 255, 255));
		panelPlazaAreaDeExperiencia.setBorder(new TitledBorder(null, "Solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPlazaAreaDeExperiencia.setLayout(null);
		
		JLabel lblPorcientoAceptable = new JLabel("Porciento aceptable:");
		lblPorcientoAceptable.setBounds(24, 34, 126, 14);
		panelPlazaAreaDeExperiencia.add(lblPorcientoAceptable);
		
		textField = new JTextField();
		textField.setBackground(new Color(211, 211, 211));
		textField.setBounds(157, 31, 126, 20);
		panelPlazaAreaDeExperiencia.add(textField);
		textField.setColumns(10);
		
		JLabel lblPlaza = new JLabel("Plazas:");
		lblPlaza.setBounds(24, 68, 46, 14);
		panelPlazaAreaDeExperiencia.add(lblPlaza);
		
		JSpinner spnPlaza = new JSpinner();
		spnPlaza.setForeground(new Color(255, 248, 220));
		spnPlaza.setBackground(new Color(255, 248, 220));
		spnPlaza.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spnPlaza.setBounds(157, 62, 126, 20);
		panelPlazaAreaDeExperiencia.add(spnPlaza);
		
		JLabel label_6 = new JLabel("Area de interes:");
		label_6.setBounds(24, 99, 126, 14);
		panelPlazaAreaDeExperiencia.add(label_6);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(new Color(211, 211, 211));
		comboBox_4.setBounds(157, 93, 126, 20);
		panelPlazaAreaDeExperiencia.add(comboBox_4);
		
		JLabel label_7 = new JLabel("Salario solicitado (Mensual):");
		label_7.setBounds(24, 135, 173, 14);
		panelPlazaAreaDeExperiencia.add(label_7);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBackground(new Color(255, 248, 220));
		spinner_1.setModel(new SpinnerNumberModel(10000, 10000, 1000000, 500));
		spinner_1.setBounds(24, 160, 126, 20);
		panelPlazaAreaDeExperiencia.add(spinner_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 21, 358, 256);
		panel_secundario.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Datos de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 49, 157, 12);
		panel_1.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(27, 104, 126, 12);
		panel_1.add(separator_2);
		
		JRadioButton radioButton = new JRadioButton("Si");
		radioButton.setBackground(new Color(255, 255, 255));
		radioButton.setBounds(37, 58, 54, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBackground(new Color(255, 255, 255));
		radioButton_1.setBounds(93, 58, 54, 23);
		panel_1.add(radioButton_1);
		
		JLabel label_4 = new JLabel("Idioma:");
		label_4.setBounds(210, 32, 61, 16);
		panel_1.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(211, 211, 211));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(210, 52, 134, 20);
		panel_1.add(comboBox_1);
		
		JRadioButton radioButton_4 = new JRadioButton("No");
		radioButton_4.setBackground(new Color(255, 255, 255));
		radioButton_4.setBounds(93, 112, 54, 23);
		panel_1.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Si");
		radioButton_5.setBackground(new Color(255, 255, 255));
		radioButton_5.setBounds(37, 112, 54, 23);
		panel_1.add(radioButton_5);
		
		JCheckBox checkBox = new JCheckBox("A\u00F1adir otro idioma");
		checkBox.setBackground(new Color(255, 255, 255));
		checkBox.setBounds(210, 79, 134, 23);
		panel_1.add(checkBox);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(211, 211, 211));
		comboBox_2.setEnabled(false);
		comboBox_2.setBounds(210, 109, 134, 20);
		panel_1.add(comboBox_2);
		
		JCheckBox checkBox_1 = new JCheckBox("A\u00F1adir otro idioma");
		checkBox_1.setBackground(new Color(255, 255, 255));
		checkBox_1.setBounds(210, 137, 134, 23);
		panel_1.add(checkBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(new Color(211, 211, 211));
		comboBox_3.setEnabled(false);
		comboBox_3.setBounds(210, 167, 134, 20);
		panel_1.add(comboBox_3);
		
		JLabel label_8 = new JLabel("Disponibilidad de viajar:");
		label_8.setBounds(27, 146, 173, 14);
		panel_1.add(label_8);
		
		JRadioButton radioButton_6 = new JRadioButton("Si");
		radioButton_6.setBackground(new Color(255, 255, 255));
		radioButton_6.setBounds(37, 164, 54, 23);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("No");
		radioButton_7.setBackground(new Color(255, 255, 255));
		radioButton_7.setBounds(93, 164, 54, 23);
		panel_1.add(radioButton_7);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(27, 161, 134, 12);
		panel_1.add(separator_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 205, 134, 12);
		panel_1.add(separator_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Medio Tiempo");
		radioButton_2.setBackground(new Color(255, 255, 255));
		radioButton_2.setBounds(33, 213, 120, 23);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Tiempo Completo");
		radioButton_3.setBackground(new Color(255, 255, 255));
		radioButton_3.setBounds(167, 213, 126, 23);
		panel_1.add(radioButton_3);
		
		JLabel lblTipoDeJornada = new JLabel("Tipo de jornada laboral:");
		lblTipoDeJornada.setBounds(27, 190, 173, 14);
		panel_1.add(lblTipoDeJornada);
		
		JLabel lblLicenciaDeConducir = new JLabel("Licencia de conducir:");
		lblLicenciaDeConducir.setBounds(27, 90, 173, 14);
		panel_1.add(lblLicenciaDeConducir);
		
		JLabel lblDisponibilidadDeMudarse = new JLabel("Disponibilidad de mudarse:");
		lblDisponibilidadDeMudarse.setBounds(27, 35, 173, 14);
		panel_1.add(lblDisponibilidadDeMudarse);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 47, 677, 108);
		contentPanel.add(panel_2);
		
		JLabel lblIngreseRnc = new JLabel("Ingrese RNC :");
		lblIngreseRnc.setBackground(new Color(255, 255, 255));
		lblIngreseRnc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIngreseRnc.setBounds(24, 11, 177, 28);
		panel_2.add(lblIngreseRnc);
		
		JFormattedTextField txtRNC = new JFormattedTextField();
		txtRNC.setForeground(new Color(0, 0, 0));
		txtRNC.setColumns(10);
		txtRNC.setBackground(new Color(211, 211, 211));
		txtRNC.setBounds(164, 18, 158, 20);
		panel_2.add(txtRNC);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.setActionCommand("OK");
		btnBuscar.setBounds(218, 42, 104, 27);
		panel_2.add(btnBuscar);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(360, 20, 68, 14);
		panel_2.add(lblNewLabel);
		
		txtnombreEmpresa = new JTextField();
		txtnombreEmpresa.setForeground(new Color(0, 0, 0));
		txtnombreEmpresa.setBackground(new Color(211, 211, 211));
		txtnombreEmpresa.setBounds(438, 18, 177, 20);
		panel_2.add(txtnombreEmpresa);
		txtnombreEmpresa.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefono:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(360, 75, 81, 14);
		panel_2.add(lblNewLabel_1);
		
		txtciudadEmpresa = new JTextField();
		txtciudadEmpresa.setForeground(new Color(0, 0, 0));
		txtciudadEmpresa.setBackground(new Color(211, 211, 211));
		txtciudadEmpresa.setBounds(438, 45, 177, 20);
		panel_2.add(txtciudadEmpresa);
		txtciudadEmpresa.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ciudad:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(360, 49, 93, 14);
		panel_2.add(lblNewLabel_2);
		
		txttelefonoEmpresa = new JTextField();
		txttelefonoEmpresa.setForeground(Color.BLACK);
		txttelefonoEmpresa.setColumns(10);
		txttelefonoEmpresa.setBackground(new Color(211, 211, 211));
		txttelefonoEmpresa.setBounds(438, 73, 177, 20);
		panel_2.add(txttelefonoEmpresa);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(220, 20, 60));
		panel_3.setBounds(0, 0, 677, 48);
		contentPanel.add(panel_3);
		
		JLabel lblIngresarSolicitud = new JLabel("Ingresar solicitud");
		lblIngresarSolicitud.setForeground(Color.WHITE);
		lblIngresarSolicitud.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblIngresarSolicitud.setBounds(234, 0, 316, 46);
		panel_3.add(lblIngresarSolicitud);
		
		JLabel label_12 = new JLabel("Fecha de Solicitud:");
		label_12.setBounds(356, 171, 123, 16);
		contentPanel.add(label_12);
		
		textField_4 = new JTextField();
		textField_4.setText("  2017-11-24");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(470, 166, 146, 26);
		contentPanel.add(textField_4);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btncancel = new JButton("Cancel");
				btncancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				
				btnPag = new JButton("Pagina Anterior <");
				btnPag.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_principal.setVisible(true);
						panel_secundario.setVisible(false);
						btnPag.setEnabled(false);
						btnPag_1.setEnabled(true);
					}
				});
				btnPag.setEnabled(false);
				btnPag.setActionCommand("Cancel");
				buttonPane.add(btnPag);
				
				btnPag_1 = new JButton("> Pagina Siguiente ");
				btnPag_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_principal.setVisible(false);
						panel_secundario.setVisible(true);
						btnPag.setEnabled(true);
						btnPag_1.setEnabled(false);
					}
				});
				btnPag_1.setActionCommand("Cancel");
				buttonPane.add(btnPag_1);
				btncancel.setActionCommand("Cancel");
				buttonPane.add(btncancel);
			}
		}
	}
}
