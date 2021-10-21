import javax.swing.*;
import java.awt.*;

//Put Frame into its own Thread
public class TestFrame extends JFrame
{


    public TestFrame()
    {
//        SwingUtilities.invokeLater(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                TestFrame tf = new TestFrame();
//                tf.setVisible(true);
//            }

        //Error in here, keeps opening new windows, idk why, have to look into it
//        });

        setSize(600, 400);
        setLocation(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Makes it so program terminates on closing the window

        JPanel panel = new JPanel();
        JButton jb1 = new JButton("Button1");
        JButton jb2 = new JButton("Button2");

        jb1.setBounds(20, 30, 150, 50);
        jb2.setBounds(200, 30, 100, 50);

        panel.setBounds(0, 0, 600, 600);
        add(panel);
//        panel.add(jb1);
//        panel.add(jb2);


        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Button1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Button2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(new JButton("Button3"), gbc);


        //   pack(); //Unused space gets removed | Window gets resized to minimal required size
    }
}
