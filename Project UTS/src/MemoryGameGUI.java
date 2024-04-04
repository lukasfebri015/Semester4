import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoryGameGUI extends JFrame {
    private MemoryGame game;
    private JButton[] buttons;
    private int firstIndex = -1;
    private int secondIndex = -1;

    public MemoryGameGUI() {
        setTitle("Memory Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        game = new MemoryGame(8);
        buttons = new JButton[game.numPairs * 2];

        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));
        for (int i = 0; i < buttons.length; i++) {
            final int index = i;
            buttons[i] = new JButton("?");
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleButtonClick(index);
                }
            });
            panel.add(buttons[i]);
        }

        add(panel, BorderLayout.CENTER);
    }

    private void handleButtonClick(int index) {
        if (firstIndex == -1) {
            firstIndex = index;
            revealCard(firstIndex);
        } else if (secondIndex == -1) {
            secondIndex = index;
            revealCard(secondIndex);
            if (!game.isMatch(firstIndex, secondIndex)) {
                Timer timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        hideCards(firstIndex, secondIndex);
                        firstIndex = -1;
                        secondIndex = -1;
                    }
                });
                timer.setRepeats(false);
                timer.start();
            } else {
                firstIndex = -1;
                secondIndex = -1;
                if (game.isGameOver()) {
                    JOptionPane.showMessageDialog(this, "Congratulations! You won the game.");
                }
            }
        }
    }

    private void revealCard(int index) {
        if (game.reveal(index)) {
            buttons[index].setText(String.valueOf(game.getCardValue(index)));
        }
    }

    private void hideCards(int index1, int index2) {
        game.hide(index1, index2);
        buttons[index1].setText("?");
        buttons[index2].setText("?");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MemoryGameGUI gui = new MemoryGameGUI();
                gui.setVisible(true);
            }
        });
    }
}