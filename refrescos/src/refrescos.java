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
import java.awt.Color;


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
		setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(Color.RED);
		contentPane.add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		lblMoneda = new JLabel("Moneda:");
		lblMoneda.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.WEST, lblMoneda, 221, SpringLayout.WEST, panel);
		panel.add(lblMoneda);
		
		btnNewButton = new JButton("Ingresa");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 0, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, lblMoneda);
		
		comboBox = new JComboBox<Object>();
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setForeground(new Color(0, 255, 0));
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
		lblCambio.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.WEST, lblCambio, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblCambio);
		
		textField_acumulado = new JTextField();
		textField_acumulado.setForeground(new Color(0, 255, 0));
		textField_acumulado.setBackground(new Color(0, 0, 0));
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, textField_acumulado);
		textField_acumulado.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_acumulado.setText("$0\r\n");
		textField_acumulado.setEditable(false);
		panel.add(textField_acumulado);
		textField_acumulado.setColumns(10);
		
		lblDinero = new JLabel("Dinero");
		lblDinero.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.WEST, textField_acumulado, 49, SpringLayout.EAST, lblDinero);
		sl_panel.putConstraint(SpringLayout.NORTH, lblDinero, 31, SpringLayout.SOUTH, lblMoneda);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_acumulado, -3, SpringLayout.NORTH, lblDinero);
		sl_panel.putConstraint(SpringLayout.WEST, lblDinero, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblDinero);
		
		textField_cambio = new JTextField();
		textField_cambio.setBackground(new Color(0, 0, 0));
		textField_cambio.setForeground(new Color(0, 255, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, lblCambio, 3, SpringLayout.NORTH, textField_cambio);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_cambio, 50, SpringLayout.SOUTH, textField_acumulado);
		sl_panel.putConstraint(SpringLayout.EAST, textField_cambio, 0, SpringLayout.EAST, btnNewButton);
		textField_cambio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_cambio.setText("$0\r\n");
		textField_cambio.setEditable(false);
		panel.add(textField_cambio);
		textField_cambio.setColumns(10);
		
		btnNewButton_1 = new JButton("Fanta");
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_1, 10, SpringLayout.WEST, panel);
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
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(139, 0, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 106, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2, 61, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_2, -41, SpringLayout.WEST, lblMoneda);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_seleccionado.setText("Coca-Cola Zero");
				textField_precio.setText("$"+producto.cocaz());
			}
		});
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setIcon(new ImageIcon("img\\cocaz.png"));
		panel.add(btnNewButton_2);
		
		btnSprite = new JButton("Sprite");
		btnSprite.setForeground(new Color(255, 255, 255));
		btnSprite.setBackground(new Color(139, 0, 0));
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -6, SpringLayout.NORTH, btnSprite);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnSprite, 208, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnSprite, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnSprite, -41, SpringLayout.WEST, lblCambio);
		sl_panel.putConstraint(SpringLayout.NORTH, btnSprite, 163, SpringLayout.NORTH, panel);
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
		btnCocacola.setForeground(new Color(255, 255, 255));
		btnCocacola.setBackground(new Color(139, 0, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, btnCocacola, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnCocacola, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnCocacola, 55, SpringLayout.NORTH, panel);
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
		lblSeleccionado.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.EAST, btnCocacola, -41, SpringLayout.WEST, lblSeleccionado);
		sl_panel.putConstraint(SpringLayout.NORTH, lblSeleccionado, 33, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblSeleccionado, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblSeleccionado);
		
		textField_seleccionado = new JTextField();
		textField_seleccionado.setBackground(new Color(0, 0, 0));
		textField_seleccionado.setForeground(new Color(0, 255, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, textField_seleccionado, 29, SpringLayout.NORTH, panel);
		textField_seleccionado.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_seleccionado.setText("Coca-Cola");
		sl_panel.putConstraint(SpringLayout.EAST, textField_seleccionado, 0, SpringLayout.EAST, btnNewButton);
		textField_seleccionado.setEditable(false);
		panel.add(textField_seleccionado);
		textField_seleccionado.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, lblPrecio, 14, SpringLayout.SOUTH, lblSeleccionado);
		sl_panel.putConstraint(SpringLayout.NORTH, lblMoneda, 17, SpringLayout.SOUTH, lblPrecio);
		sl_panel.putConstraint(SpringLayout.WEST, lblPrecio, 0, SpringLayout.WEST, lblMoneda);
		panel.add(lblPrecio);
		
		textField_precio = new JTextField();
		textField_precio.setBackground(new Color(0, 0, 0));
		textField_precio.setForeground(new Color(0, 255, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, textField_precio, 12, SpringLayout.SOUTH, textField_seleccionado);
		textField_precio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_precio.setText("$9");
		sl_panel.putConstraint(SpringLayout.EAST, textField_precio, 0, SpringLayout.EAST, btnNewButton);
		textField_precio.setEditable(false);
		panel.add(textField_precio);
		textField_precio.setColumns(10);
		

		final JButton btnNewButton_4 = new JButton("Recoger Cambio");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(139, 0, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_4, 16, SpringLayout.SOUTH, textField_cambio);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_4, 0, SpringLayout.EAST, btnNewButton);
		btnNewButton_4.setEnabled(false);
		
		btnNewButton_3 = new JButton("Comprar");
		btnNewButton_3.setBackground(new Color(139, 0, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_cambio.setText(Dinero.cambio(textField_seleccionado.getText()));
				if(textField_cambio.getText().equals("$0")){
					textField_acumulado.setText("$0");
					comprado frame = new comprado(textField_seleccionado.getText());
					frame.setVisible(true);
				}
				else if(!textField_cambio.getText().equals("Te falta dinero")){
					btnNewButton_4.setEnabled(true);
					btnNewButton.setEnabled(false);
					btnNewButton_3.setEnabled(false);
					comprado frame = new comprado(textField_seleccionado.getText());
					frame.setVisible(true);
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
		panel.add(btnNewButton_4);
	}
}
