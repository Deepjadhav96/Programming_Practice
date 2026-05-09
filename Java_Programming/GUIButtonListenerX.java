//Contains error
import javax.swing.*;
import java.awt.event.*;

class GUIButtonListenerX
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellouse PPA");
        fobj.setSize(400,300);

        JButton bobj  =  new JButton("OK");
        bobj.setBounds(100,100,150,50);


        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                JOptionPane.showMessangeDialog(fobj,"Button Clicked");
            }
        });

        fobj.add(bobj);
       
        fobj.setLayout(null);

        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}