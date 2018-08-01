package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.BorderFactory;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollBar;

public class StopwatchGUI extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StopwatchGUI frame = new StopwatchGUI();
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
	public StopwatchGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFiles = new JMenu("Files");
		menuBar.add(mnFiles);
		
		JMenuItem mntmOpenProject = new JMenuItem("Open Project");
		mnFiles.add(mntmOpenProject);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Save Project");
		mnFiles.add(mntmNewMenuItem);
		
		JButton btnStopwatch = new JButton("Stopwatch");
		menuBar.add(btnStopwatch);
		
		JButton btnTimeScheme = new JButton("Time Scheme");
		menuBar.add(btnTimeScheme);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBounds(172, 181, 89, 23);
		contentPane.add(btnStop);
		
		JButton btnPause = new JButton("Pause");
		btnPause.setBounds(172, 147, 89, 23);
		contentPane.add(btnPause);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(172, 113, 89, 23);
		contentPane.add(btnStart);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("00:00:00");
		textPane.setBounds(189, 59, 56, 20);
		contentPane.add(textPane);
		
		JTextPane txtpnNotes = new JTextPane();
		txtpnNotes.setText("Notes:");
		txtpnNotes.setBounds(287, 11, 70, 20);
		contentPane.add(txtpnNotes);
		
		JTextPane txtpnStopwatch = new JTextPane();
		txtpnStopwatch.setText("Stopwatch");
		txtpnStopwatch.setBounds(188, 11, 56, 20);
		contentPane.add(txtpnStopwatch);
		
		String[] petStrings = { "Task1", "Task2", "Task3", "Task4", "Task5" };
		
		JComboBox comboBox = new JComboBox(petStrings);
		comboBox.setBounds(10, 30, 124, 32);
		//comboBox.setToolTipText("Test");
		contentPane.add(comboBox);
		
		JTextPane txtpnTaskSelection = new JTextPane();
		txtpnTaskSelection.setText("Task Selection:");
		txtpnTaskSelection.setBounds(10, 11, 124, 20);
		contentPane.add(txtpnTaskSelection);
		
		JTextArea txtrTest = new JTextArea();
		txtrTest.setText("Test");
		txtrTest.setBounds(289, 35, 162, 190);
		contentPane.add(txtrTest);

		txtrTest.setBorder(BorderFactory.createLineBorder(Color.black));
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
