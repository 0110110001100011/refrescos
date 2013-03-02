import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class refrescos extends JFrame {
	private JPanel contentPane;
	public JTextField textField_acum;
	public JTextField textField_cambio;
	public JComboBox comboBox;
	private JButton btnNewButton;
	private JLabel lblMoneda;
	private JLabel lblCambio;
	private JLabel lblDinero;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnSprite;
	private JButton btnCocacola;
	private JLabel lblSeleccionado;
	public JTextField txtCocacola;
	private JLabel lblPrecio;
	private JTextField textField_precio;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					refrescos frame = new refrescos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public refrescos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		lblMoneda = new JLabel("Moneda:");
		sl_panel.putConstraint(SpringLayout.WEST, lblMoneda, 221, SpringLayout.WEST, panel);
		panel.add(lblMoneda);
		
		btnNewButton = new JButton("Ingresa");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, lblMoneda);
		
		comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblMoneda);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, lblMoneda);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"$1", "$2", "$5", "$10"}));
		panel.add(comboBox);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_acum.setText(Dinero.ingresa(comboBox.getSelectedIndex()));
				textField_cambio.setText("$0");
			}
		});
		panel.add(btnNewButton);
		
		lblCambio = new JLabel("Cambio");
		sl_panel.putConstraint(SpringLayout.WEST, lblCambio, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblCambio);
		
		textField_acum = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, textField_acum);
		textField_acum.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_acum.setText("$0\r\n");
		textField_acum.setEditable(false);
		panel.add(textField_acum);
		textField_acum.setColumns(10);
		
		lblDinero = new JLabel("Dinero");
		sl_panel.putConstraint(SpringLayout.WEST, textField_acum, 49, SpringLayout.EAST, lblDinero);
		sl_panel.putConstraint(SpringLayout.NORTH, lblDinero, 31, SpringLayout.SOUTH, lblMoneda);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_acum, -3, SpringLayout.NORTH, lblDinero);
		sl_panel.putConstraint(SpringLayout.WEST, lblDinero, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblDinero);
		
		textField_cambio = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, lblCambio, 3, SpringLayout.NORTH, textField_cambio);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_cambio, 50, SpringLayout.SOUTH, textField_acum);
		sl_panel.putConstraint(SpringLayout.EAST, textField_cambio, 0, SpringLayout.EAST, btnNewButton);
		textField_cambio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_cambio.setText("$0\r\n");
		textField_cambio.setEditable(false);
		panel.add(textField_cambio);
		textField_cambio.setColumns(10);
		
		btnNewButton_1 = new JButton("Fanta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCocacola.setText("Fanta");
				textField_precio.setText("$"+producto.fanta());
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setIcon(new ImageIcon("img\\Fanta.png"));
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Coca-Cola Zero");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCocacola.setText("Coca-Cola Zero");
				textField_precio.setText("$"+producto.cocaz());
			}
		});
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -177, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2, -269, SpringLayout.EAST, panel);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon("img\\cocaz.png"));
		panel.add(btnNewButton_2);
		
		btnSprite = new JButton("Sprite");
		btnSprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCocacola.setText("Sprite");
				textField_precio.setText("$"+producto.sprite());
			}
		});
		btnSprite.setHorizontalAlignment(SwingConstants.LEFT);
		sl_panel.putConstraint(SpringLayout.NORTH, btnSprite, 6, SpringLayout.SOUTH, btnNewButton_1);
		sl_panel.putConstraint(SpringLayout.WEST, btnSprite, 0, SpringLayout.WEST, btnNewButton_1);
		sl_panel.putConstraint(SpringLayout.EAST, btnSprite, 0, SpringLayout.EAST, btnNewButton_1);
		btnSprite.setIcon(new ImageIcon("img\\Sprite.png"));
		panel.add(btnSprite);
		
		btnCocacola = new JButton("Coca-Cola");
		sl_panel.putConstraint(SpringLayout.NORTH, btnCocacola, 20, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnCocacola, -224, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2, 6, SpringLayout.SOUTH, btnCocacola);
		btnCocacola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtCocacola.setText("Coca-Cola");
				textField_precio.setText("$"+producto.coca());
			}
		});
		btnCocacola.setHorizontalAlignment(SwingConstants.LEFT);
		sl_panel.putConstraint(SpringLayout.WEST, btnCocacola, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnCocacola, 0, SpringLayout.EAST, btnNewButton_2);
		btnCocacola.setIcon(new ImageIcon("img\\coca.png"));
		panel.add(btnCocacola);
		
		lblSeleccionado = new JLabel("Seleccionado");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSeleccionado, 13, SpringLayout.NORTH, btnCocacola);
		sl_panel.putConstraint(SpringLayout.WEST, lblSeleccionado, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblSeleccionado);
		
		txtCocacola = new JTextField();
		txtCocacola.setText("Coca-Cola");
		sl_panel.putConstraint(SpringLayout.NORTH, txtCocacola, 9, SpringLayout.NORTH, btnCocacola);
		sl_panel.putConstraint(SpringLayout.EAST, txtCocacola, 0, SpringLayout.EAST, btnNewButton);
		txtCocacola.setEditable(false);
		panel.add(txtCocacola);
		txtCocacola.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		sl_panel.putConstraint(SpringLayout.NORTH, lblMoneda, 17, SpringLayout.SOUTH, lblPrecio);
		sl_panel.putConstraint(SpringLayout.NORTH, lblPrecio, 0, SpringLayout.NORTH, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblPrecio, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblPrecio);
		
		textField_precio = new JTextField();
		textField_precio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_precio.setText("$9");
		sl_panel.putConstraint(SpringLayout.NORTH, textField_precio, 0, SpringLayout.NORTH, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.EAST, textField_precio, 0, SpringLayout.EAST, btnNewButton);
		textField_precio.setEditable(false);
		panel.add(textField_precio);
		textField_precio.setColumns(10);
		
		btnNewButton_3 = new JButton("Listo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_cambio.setText(Dinero.cambio(txtCocacola.getText()));
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_3, 9, SpringLayout.SOUTH, textField_acum);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_3, 0, SpringLayout.EAST, btnNewButton);
		panel.add(btnNewButton_3);
	}
}
