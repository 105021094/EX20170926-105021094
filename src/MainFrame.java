import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;

public class MainFrame extends Frame{

    private Button btnadd = new Button("ADD");
    private Button btnsub = new Button("SUB");
    private Button btnexit = new Button("EXIT");
    private Label lab = new Label("0.0");
    private int n=0, labX= 50,labY= 50;
    private javax.swing.Timer t1;

    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,100,400,500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setLayout(null);
        lab.setBounds(50,50,100,30);
        this.add(lab);
        btnadd.setBounds(100,100,100,30);
        this.add(btnadd);
        btnsub.setBounds(100,150,100,30);
        this.add(btnsub);
        btnexit.setBounds(100,200,100,30);
        this.add(btnexit);


        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(++n));
                t1.start();
            }
        });

        btnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(--n));
            }
        });

        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        t1 = new javax.swing.Timer(300, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labX+=15;
                lab.setLocation(labX,labY);
            }
        });

    }
}
