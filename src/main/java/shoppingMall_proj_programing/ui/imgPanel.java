package shoppingMall_proj_programing.ui;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class imgPanel extends JPanel {

	private String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private ImageIcon icon = new ImageIcon(imgPath + "shoppingMallStartImage.jpg");
	private JLabel lblStartImg;
	
	public imgPanel() {
		initialize();
	}
	
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		lblStartImg = new JLabel("");
		lblStartImg.setIcon(icon);
		lblStartImg.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblStartImg);
	}

}
