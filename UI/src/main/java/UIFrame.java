import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Adria on 17/09/2015.
 */
public class UIFrame {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public UIFrame() {
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                javax.swing.JDialog dialog = new javax.swing.JDialog();
                dialog.show();
            }
        });
    }
}
