package pl.comarch.szkolenia.test;

public class zadnie1 {
    public static void main(String[] args) {

    }
    public String shopping(int j, int p, int m) {
        int resultApple = j;
        int resultOrange = p;
        if (m > 0) {
            for (int i = 0; i < m; i++) {
                if (j >= p) {
                    resultOrange++;
                } else {
                    resultApple++;
                }
            }
        }
        int różnica = Math.abs(resultApple - resultOrange);
        return ("Pomarańcze: " + resultOrange + "Jabłka: " + resultApple + "Minimalna różnica: " + różnica);
    }
}
