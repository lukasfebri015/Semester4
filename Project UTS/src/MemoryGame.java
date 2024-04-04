import java.util.ArrayList;
import java.util.Collections;

public class MemoryGame {
    private ArrayList<Integer> cards;
    private int[] revealed;
    int numPairs;

    public MemoryGame(int numPairs) {
        this.numPairs = numPairs;
        cards = new ArrayList<>();
        revealed = new int[numPairs * 2];

        // Buat kartu
        for (int i = 0; i < numPairs; i++) {
            cards.add(i);
            cards.add(i);
        }

        // Acak kartu
        Collections.shuffle(cards);
    }

    public boolean reveal(int index) {
        if (revealed[index] == 0) {
            revealed[index] = 1;
            return true;
        }
        return false;
    }

    public boolean isMatch(int index1, int index2) {
        return cards.get(index1) == cards.get(index2);
    }

    public void hide(int index1, int index2) {
        revealed[index1] = 0;
        revealed[index2] = 0;
    }

    public boolean isGameOver() {
        for (int i = 0; i < revealed.length; i++) {
            if (revealed[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public int getCardValue(int index) {
        return cards.get(index);
    }

    public boolean isRevealed(int index) {
        return revealed[index] == 1;
    }
}