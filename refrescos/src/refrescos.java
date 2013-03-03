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
	public JTextField textField_acumulado;
	public JTextField textField_cambio;
	public JComboBox<Object> comboBox;
	private JButton btnNewButton;
	private JLabel lblMoneda;
	private JLabel lblCambio;
	private JLabel lblDinero;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnSprite;
	private JButton btnCocacola;
	private JLabel lblSeleccionado;
	public JTextField textField_seleccionado;
	private JLabel lblPrecio;
	private JTextField textField_precio;
	private JButton btnNewButton_3;
	private JPanel panel;

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
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		lblMoneda = new JLabel("Moneda:");
		sl_panel.putConstraint(SpringLayout.WEST, lblMoneda, 221, SpringLayout.WEST, panel);
		panel.add(lblMoneda);
		
		btnNewButton = new JButton("Ingresa");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, lblMoneda);
		
		comboBox = new JComboBox<Object>();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblMoneda);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, lblMoneda);
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"$1", "$2", "$5", "$10"}));
		panel.add(comboBox);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_acumulado.setText(Dinero.ingresa(comboBox.getSelectedIndex()));
				textField_cambio.setText("$0");
			}
		});
		panel.add(btnNewButton);
		
		lblCambio = new JLabel("Cambio");
		sl_panel.putConstraint(SpringLayout.WEST, lblCambio, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblCambio);
		
		textField_acumulado = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, textField_acumulado);
		textField_acumulado.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_acumulado.setText("$0\r\n");
		textField_acumulado.setEditable(false);
		panel.add(textField_acumulado);
		textField_acumulado.setColumns(10);
		
		lblDinero = new JLabel("Dinero");
		sl_panel.putConstraint(SpringLayout.WEST, textField_acumulado, 49, SpringLayout.EAST, lblDinero);
		sl_panel.putConstraint(SpringLayout.NORTH, lblDinero, 31, SpringLayout.SOUTH, lblMoneda);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_acumulado, -3, SpringLayout.NORTH, lblDinero);
		sl_panel.putConstraint(SpringLayout.WEST, lblDinero, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblDinero);
		
		textField_cambio = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, lblCambio, 3, SpringLayout.NORTH, textField_cambio);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_cambio, 50, SpringLayout.SOUTH, textField_acumulado);
		sl_panel.putConstraint(SpringLayout.EAST, textField_cambio, 0, SpringLayout.EAST, btnNewButton);
		textField_cambio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_cambio.setText("$0\r\n");
		textField_cambio.setEditable(false);
		panel.add(textField_cambio);
		textField_cambio.setColumns(10);
		
		btnNewButton_1 = new JButton("Fanta");
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_1, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -122, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_1, -41, SpringLayout.WEST, lblDinero);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_seleccionado.setText("Fanta");
				textField_precio.setText("$"+producto.fanta());
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setIcon(new ImageIcon("img\\Fanta.png"));
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Coca-Cola Zero");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2, -249, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2, 61, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -173, SpringLayout.SOUTH, panel);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_seleccionado.setText("Coca-Cola Zero");
				textField_precio.setText("$"+producto.cocaz());
			}
		});
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2, 10, SpringLayout.WEST, panel);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setIcon(new ImageIcon("img\\cocaz.png"));
		panel.add(btnNewButton_2);
		
		btnSprite = new JButton("Sprite");
		sl_panel.putConstraint(SpringLayout.NORTH, btnSprite, 6, SpringLayout.SOUTH, btnNewButton_1);
		sl_panel.putConstraint(SpringLayout.WEST, btnSprite, 0, SpringLayout.WEST, btnNewButton_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnSprite, 51, SpringLayout.SOUTH, btnNewButton_1);
		sl_panel.putConstraint(SpringLayout.EAST, btnSprite, 0, SpringLayout.EAST, btnNewButton_1);
		btnSprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_seleccionado.setText("Sprite");
				textField_precio.setText("$"+producto.sprite());
			}
		});
		btnSprite.setHorizontalAlignment(SwingConstants.LEFT);
		btnSprite.setIcon(new ImageIcon("img\\Sprite.png"));
		panel.add(btnSprite);
		
		btnCocacola = new JButton("Coca-Cola");
		sl_panel.putConstraint(SpringLayout.NORTH, btnCocacola, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnCocacola, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnCocacola, -6, SpringLayout.NORTH, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.EAST, btnCocacola, 0, SpringLayout.EAST, btnNewButton_1);
		btnCocacola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_seleccionado.setText("Coca-Cola");
				textField_precio.setText("$"+producto.coca());
			}
		});
		btnCocacola.setHorizontalAlignment(SwingConstants.LEFT);
		btnCocacola.setIcon(new ImageIcon("img\\coca.png"));
		panel.add(btnCocacola);
		
		lblSeleccionado = new JLabel("Seleccionado");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSeleccionado, 33, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblSeleccionado, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblSeleccionado);
		
		textField_seleccionado = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_seleccionado, 29, SpringLayout.NORTH, panel);
		textField_seleccionado.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_seleccionado.setText("Coca-Cola");
		sl_panel.putConstraint(SpringLayout.EAST, textField_seleccionado, 0, SpringLayout.EAST, btnNewButton);
		textField_seleccionado.setEditable(false);
		panel.add(textField_seleccionado);
		textField_seleccionado.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPrecio, 14, SpringLayout.SOUTH, lblSeleccionado);
		sl_panel.putConstraint(SpringLayout.NORTH, lblMoneda, 17, SpringLayout.SOUTH, lblPrecio);
		sl_panel.putConstraint(SpringLayout.WEST, lblPrecio, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblPrecio);
		
		textField_precio = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_precio, 12, SpringLayout.SOUTH, textField_seleccionado);
		textField_precio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_precio.setText("$9");
		sl_panel.putConstraint(SpringLayout.EAST, textField_precio, 0, SpringLayout.EAST, btnNewButton);
		textField_precio.setEditable(false);
		panel.add(textField_precio);
		textField_precio.setColumns(10);
		

		final JButton btnNewButton_4 = new JButton("Recoger Cambio");
		btnNewButton_4.setEnabled(false);
		
		btnNewButton_3 = new JButton("Comprar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_cambio.setText(Dinero.cambio(textField_seleccionado.getText()));
				if(!textField_cambio.getText().equals("Te falta dinero")){
					btnNewButton_4.setEnabled(true);
					btnNewButton.setEnabled(false);
					btnNewButton_3.setEnabled(false);
				}	
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_3, 9, SpringLayout.SOUTH, textField_acumulado);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_3, 0, SpringLayout.EAST, btnNewButton);
		panel.add(btnNewButton_3);
		
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_acumulado.setText("$0");
				textField_cambio.setText("$0");
				btnNewButton_4.setEnabled(false);
				btnNewButton_3.setEnabled(true);
				btnNewButton.setEnabled(true);
			}
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_4, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_4, 0, SpringLayout.EAST, btnNewButton);
		panel.add(btnNewButton_4);
	}
}
