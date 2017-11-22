package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Solicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFechaSolicitud;
	
	ButtonGroup sexo =new ButtonGroup();
	ButtonGroup mudarse =new ButtonGroup();
	ButtonGroup conducir =new ButtonGroup();
	ButtonGroup jornada =new ButtonGroup();
	ButtonGroup nivelEducativo =new ButtonGroup();
	
	//_____Solicitante_______________________//
	private String nombreSolicitante;
	private String apellidoSolicitante;
	private String cedulaSolicitante;
	private String telefonoSolicitante;
    private String sexoSolicitante;
    private String estadoCivilSolicitante;
    private String direccionSolicitante;
    private String paisSolicitante;
  //_______Experiencia laboral_______________//
    private String nombreEmpresa;
    private String areTrabajo;
    private String nombreReferente;
    private String telReferente;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCedula;
    private JTextField txtTelefono;
    private JTextField txtDireccion;
    private JTextField txtFechaNacionalidad;
    private JTextField txtEmail;
    private JTextField txtInstitucionUni;
    private JTextField txtInstitucionTecnico;
    private JTextField txtEmpresa;
    private JTextField txtNombreReferente;
    private JTextField txtNumeroReferente;
    
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Solicitudes dialog = new Solicitudes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Solicitudes() {
		setResizable(false);
		setBounds(100, 100, 810, 710);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			txtFechaSolicitud = new JTextField();
			txtFechaSolicitud.setEditable(false);
			txtFechaSolicitud.setBounds(634, 11, 146, 26);
			panel.add(txtFechaSolicitud);
			txtFechaSolicitud.setColumns(10);
			
			JLabel lblFecha = new JLabel("Fecha de Solicitud:");
			lblFecha.setBounds(501, 16, 123, 16);
			panel.add(lblFecha);
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(198, 48, 582, 207);
			panel.add(panel_1);
			
			JLabel label = new JLabel("Nombres:");
			label.setBounds(30, 30, 61, 16);
			panel_1.add(label);
			
			txtNombre = new JTextField();
			txtNombre.setColumns(10);
			txtNombre.setBounds(101, 28, 177, 20);
			panel_1.add(txtNombre);
			
			JLabel label_1 = new JLabel("Apellidos:");
			label_1.setBounds(300, 30, 73, 16);
			panel_1.add(label_1);
			
			txtApellido = new JTextField();
			txtApellido.setColumns(10);
			txtApellido.setBounds(369, 28, 196, 20);
			panel_1.add(txtApellido);
			
			JLabel label_2 = new JLabel("Cedula:");
			label_2.setBounds(30, 59, 61, 16);
			panel_1.add(label_2);
			
			txtCedula = new JTextField();
			txtCedula.setColumns(10);
			txtCedula.setBounds(101, 57, 177, 20);
			panel_1.add(txtCedula);
			
			JLabel label_3 = new JLabel("Sexo:");
			label_3.setBounds(300, 118, 61, 16);
			panel_1.add(label_3);
			
			JLabel label_4 = new JLabel("Telefono:");
			label_4.setBounds(300, 59, 61, 16);
			panel_1.add(label_4);
			
			txtTelefono = new JTextField();
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(369, 59, 196, 20);
			panel_1.add(txtTelefono);
			
			JRadioButton btnMasculino = new JRadioButton("Masculino");
			sexo.add(btnMasculino);
			btnMasculino.setBounds(367, 115, 93, 23);
			panel_1.add(btnMasculino);
			
			JRadioButton btnFemenino = new JRadioButton("Femenino");
			sexo.add(btnFemenino);
			btnFemenino.setBounds(462, 115, 94, 23);
			panel_1.add(btnFemenino);
			
			JLabel label_5 = new JLabel("Estado Civil:");
			label_5.setBounds(30, 172, 84, 16);
			panel_1.add(label_5);
			
			JLabel label_6 = new JLabel("Direccion:");
			label_6.setBounds(30, 86, 84, 16);
			panel_1.add(label_6);
			
			txtDireccion = new JTextField();
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(101, 86, 177, 20);
			panel_1.add(txtDireccion);
			
			JLabel label_7 = new JLabel("Nacionalidad:");
			label_7.setBounds(300, 172, 84, 16);
			panel_1.add(label_7);
			
			JComboBox cbxNacionalidad = new JComboBox();
			cbxNacionalidad.setBounds(395, 172, 170, 20);
			panel_1.add(cbxNacionalidad);
			
			JComboBox cbxEstadoCivil = new JComboBox();
			cbxEstadoCivil.setBounds(101, 172, 177, 20);
			panel_1.add(cbxEstadoCivil);
			
			JLabel label_8 = new JLabel("Cuidad:");
			label_8.setBounds(30, 118, 46, 14);
			panel_1.add(label_8);
			
			JComboBox cbxCiudad = new JComboBox();
			cbxCiudad.setBounds(101, 116, 177, 20);
			panel_1.add(cbxCiudad);
			
			JLabel label_9 = new JLabel("Pais:");
			label_9.setBounds(30, 147, 46, 14);
			panel_1.add(label_9);
			
			JComboBox cbxPais = new JComboBox();
			cbxPais.setBounds(101, 145, 177, 20);
			panel_1.add(cbxPais);
			
			JLabel label_10 = new JLabel("Fecha Nacimiento:");
			label_10.setBounds(300, 147, 107, 14);
			panel_1.add(label_10);
			
			txtFechaNacionalidad = new JTextField();
			txtFechaNacionalidad.setColumns(10);
			txtFechaNacionalidad.setBounds(412, 145, 153, 20);
			panel_1.add(txtFechaNacionalidad);
			
			JLabel label_11 = new JLabel("Email:");
			label_11.setBounds(300, 86, 46, 14);
			panel_1.add(label_11);
			
			txtEmail = new JTextField();
			txtEmail.setColumns(10);
			txtEmail.setBounds(369, 86, 196, 20);
			panel_1.add(txtEmail);
			
			JPanel panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBorder(new TitledBorder(null, "Educacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(10, 266, 358, 170);
			panel.add(panel_2);
			
			JPanel pTecnico = new JPanel();
			pTecnico.setLayout(null);
			pTecnico.setBounds(6, 64, 314, 100);
			panel_2.add(pTecnico);
			
			JLabel label_14 = new JLabel("Institucion:");
			label_14.setBounds(6, 6, 84, 16);
			pTecnico.add(label_14);
			
			txtInstitucionTecnico = new JTextField();
			txtInstitucionTecnico.setColumns(10);
			txtInstitucionTecnico.setBounds(82, 5, 226, 20);
			pTecnico.add(txtInstitucionTecnico);
			
			JLabel label_15 = new JLabel("Tecnico:");
			label_15.setBounds(6, 47, 61, 16);
			pTecnico.add(label_15);
			
			JComboBox cbxTecnico = new JComboBox();
			cbxTecnico.setBounds(82, 45, 226, 20);
			pTecnico.add(cbxTecnico);
			
			JPanel pUniversitario = new JPanel();
			pUniversitario.setLayout(null);
			pUniversitario.setBounds(6, 64, 314, 100);
			panel_2.add(pUniversitario);
			
			JLabel label_12 = new JLabel("Institucion:");
			label_12.setBounds(6, 6, 84, 16);
			pUniversitario.add(label_12);
			
			txtInstitucionUni = new JTextField();
			txtInstitucionUni.setColumns(10);
			txtInstitucionUni.setBounds(82, 5, 226, 20);
			pUniversitario.add(txtInstitucionUni);
			
			JLabel label_13 = new JLabel("Carrera:");
			label_13.setBounds(6, 47, 61, 16);
			pUniversitario.add(label_13);
			
			JComboBox cbxCarrera = new JComboBox();
			cbxCarrera.setBounds(82, 45, 135, 20);
			pUniversitario.add(cbxCarrera);
			
			JPanel pObrero = new JPanel();
			pObrero.setLayout(null);
			pObrero.setBounds(6, 64, 314, 100);
			panel_2.add(pObrero);
			
			JLabel label_16 = new JLabel("Habilidad:");
			label_16.setBounds(10, 41, 71, 16);
			pObrero.add(label_16);
			
			JComboBox cbxHabilidad = new JComboBox();
			cbxHabilidad.setBounds(82, 39, 226, 20);
			pObrero.add(cbxHabilidad);
			
			JLabel label_17 = new JLabel("Nivel educativo:");
			label_17.setFont(new Font("Dialog", Font.BOLD, 13));
			label_17.setBounds(103, 11, 115, 16);
			panel_2.add(label_17);
			
			JRadioButton btnProfesional = new JRadioButton("Profesional");
			nivelEducativo.add(btnProfesional);
			btnProfesional.setBounds(6, 34, 115, 23);
			panel_2.add(btnProfesional);
			
			JRadioButton btnTecnico = new JRadioButton("Tecnico");
			nivelEducativo.add(btnTecnico);
			btnTecnico.setBounds(123, 34, 93, 23);
			panel_2.add(btnTecnico);
			
			JRadioButton btnObrero = new JRadioButton("Obrero");
			nivelEducativo.add(btnObrero);
			btnObrero.setBounds(218, 34, 76, 23);
			panel_2.add(btnObrero);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(103, 25, 109, 12);
			panel_2.add(separator);
			
			JPanel panel_6 = new JPanel();
			panel_6.setLayout(null);
			panel_6.setBorder(new TitledBorder(null, "Datos de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_6.setBounds(378, 266, 402, 361);
			panel.add(panel_6);
			
			JLabel label_18 = new JLabel("Disponibilidad de Mudarse:");
			label_18.setFont(new Font("Dialog", Font.BOLD, 13));
			label_18.setBounds(27, 35, 192, 16);
			panel_6.add(label_18);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(27, 49, 173, 12);
			panel_6.add(separator_1);
			
			JLabel label_19 = new JLabel("Tipo de Jornada:");
			label_19.setFont(new Font("Dialog", Font.BOLD, 13));
			label_19.setBounds(229, 35, 148, 16);
			panel_6.add(label_19);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBounds(229, 49, 103, 12);
			panel_6.add(separator_2);
			
			JLabel label_20 = new JLabel("Licencia de conducir:");
			label_20.setFont(new Font("Dialog", Font.BOLD, 13));
			label_20.setBounds(27, 89, 160, 16);
			panel_6.add(label_20);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBounds(27, 103, 134, 12);
			panel_6.add(separator_3);
			
			JRadioButton btnDispMudarseY = new JRadioButton("Si");
			mudarse.add(btnDispMudarseY);
			btnDispMudarseY.setBounds(37, 58, 54, 23);
			panel_6.add(btnDispMudarseY);
			
			JRadioButton btnDispMudarseN = new JRadioButton("No");
			mudarse.add(btnDispMudarseN);
			btnDispMudarseN.setBounds(93, 58, 54, 23);
			panel_6.add(btnDispMudarseN);
			
			JLabel label_21 = new JLabel("Idioma:");
			label_21.setBounds(27, 142, 61, 16);
			panel_6.add(label_21);
			
			JComboBox cbxIdioma1 = new JComboBox();
			cbxIdioma1.setEditable(true);
			cbxIdioma1.setBounds(27, 161, 134, 20);
			panel_6.add(cbxIdioma1);
			
			JRadioButton btnTiempoCompleto = new JRadioButton("Tiempo Completo");
			jornada.add(btnTiempoCompleto);
			btnTiempoCompleto.setBounds(238, 87, 139, 23);
			panel_6.add(btnTiempoCompleto);
			
			JRadioButton btnMedioTiempo = new JRadioButton("Medio Tiempo");
			jornada.add(btnMedioTiempo);
			btnMedioTiempo.setBounds(239, 58, 138, 23);
			panel_6.add(btnMedioTiempo);
			
			JRadioButton btnLicenciaCN = new JRadioButton("No");
			conducir.add(btnLicenciaCN);
			btnLicenciaCN.setBounds(93, 112, 54, 23);
			panel_6.add(btnLicenciaCN);
			
			JRadioButton btnLicenciaCY = new JRadioButton("Si");
			conducir.add(btnLicenciaCY);
			btnLicenciaCY.setBounds(37, 112, 54, 23);
			panel_6.add(btnLicenciaCY);
			
			JCheckBox chbIdioma2 = new JCheckBox("A\u00F1adir otro idioma");
			chbIdioma2.setBounds(27, 188, 134, 23);
			panel_6.add(chbIdioma2);
			
			JComboBox cbxIdioma2 = new JComboBox();
			cbxIdioma2.setBounds(27, 218, 134, 20);
			panel_6.add(cbxIdioma2);
			
			JCheckBox chbIdioma3 = new JCheckBox("A\u00F1adir otro idioma");
			chbIdioma3.setBounds(27, 246, 134, 23);
			panel_6.add(chbIdioma3);
			
			JComboBox cbxIdioma3 = new JComboBox();
			cbxIdioma3.setBounds(27, 276, 134, 20);
			panel_6.add(cbxIdioma3);
			
			JLabel label_22 = new JLabel("Area de interes:");
			label_22.setBounds(229, 143, 126, 14);
			panel_6.add(label_22);
			
			JComboBox cbxAreaInteres = new JComboBox();
			cbxAreaInteres.setBounds(229, 161, 126, 20);
			panel_6.add(cbxAreaInteres);
			
			JPanel panel_7 = new JPanel();
			panel_7.setLayout(null);
			panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_7.setBounds(10, 436, 358, 191);
			panel.add(panel_7);
			
			JLabel label_23 = new JLabel("Experiencia Laboral (Ultimo empleo):");
			label_23.setFont(new Font("Dialog", Font.BOLD, 13));
			label_23.setBounds(10, 11, 281, 16);
			panel_7.add(label_23);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setBounds(10, 25, 240, 12);
			panel_7.add(separator_4);
			
			JLabel label_24 = new JLabel("Nombre de Empresa:");
			label_24.setBounds(10, 47, 134, 16);
			panel_7.add(label_24);
			
			txtEmpresa = new JTextField();
			txtEmpresa.setColumns(10);
			txtEmpresa.setBounds(147, 45, 198, 20);
			panel_7.add(txtEmpresa);
			
			JLabel label_25 = new JLabel("Area de Trabajo:");
			label_25.setBounds(10, 101, 110, 16);
			panel_7.add(label_25);
			
			JLabel label_26 = new JLabel("Nombre de Referente:");
			label_26.setBounds(10, 130, 127, 16);
			panel_7.add(label_26);
			
			txtNombreReferente = new JTextField();
			txtNombreReferente.setColumns(10);
			txtNombreReferente.setBounds(147, 128, 198, 20);
			panel_7.add(txtNombreReferente);
			
			JLabel label_27 = new JLabel("Telefono de Referente:");
			label_27.setBounds(10, 159, 146, 21);
			panel_7.add(label_27);
			
			txtNumeroReferente = new JTextField();
			txtNumeroReferente.setColumns(10);
			txtNumeroReferente.setBounds(147, 159, 198, 20);
			panel_7.add(txtNumeroReferente);
			
			JComboBox cbxAreaTrabajo = new JComboBox();
			cbxAreaTrabajo.setBounds(147, 99, 198, 20);
			panel_7.add(cbxAreaTrabajo);
			
			JLabel label_28 = new JLabel("Tiempo de experiencia:");
			label_28.setBounds(10, 76, 134, 14);
			panel_7.add(label_28);
			
			JSpinner spnTiempoExperiencia = new JSpinner();
			spnTiempoExperiencia.setModel(new SpinnerNumberModel(1, 1, 50, 1));
			spnTiempoExperiencia.setBounds(244, 74, 101, 20);
			panel_7.add(spnTiempoExperiencia);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
