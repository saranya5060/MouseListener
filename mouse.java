import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Mouse Listener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        // Add a Mouse Listener to the panel
        panel.addMouseListener(new MyMouseListener());

        frame.add(panel);
        frame.setVisible(true);
    }
}

class MyMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered the Panel");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited the Panel");
    }
}
