/*package EgyptianRatSlap;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
public class EgyptianRatSlap {
    {
        private void prepareGUI(){

        public class MyFrameAdapter extends WindowAdapter { //Creates a class that is derived from a window adapter to use as a listener.
            public void windowClosing(WindowEvent windowEvent){
                System.out.println("Exiting ...");
                System.exit(0);
            }
        }
    }
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private int cardNum;
    private int suitNum;
    private boolean slapped = false;
}
    private void prepareGUI(){
        mainFrame = new Frame("My Example Frame"); //created an object called Frame, and modifies the object in future parts of the code
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(4, 1));


        public void showButtonDemo(){
            Label.setText("Control in action: Button");

            Button slapButton = new Button("Slap");
            Button burnButton = new Button("Burn");
            Button cancelButton = new Button("Cancel");

            slapButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Label.setText("Slap Button clicked.");

                }
            });burnButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Label.setText("Burn Button clicked.");
                    //changeCard("10 H"); // use random card instead
                    //nextCard();
                }
            });

            cancelButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    NewLabel.setText("Cancel Button clicked.");
                }
            });
            Panel.add(slapButton);
            Panel.add(burnButton);
            Panel.add(cancelButton);
            Frame.setVisible(true);*/

