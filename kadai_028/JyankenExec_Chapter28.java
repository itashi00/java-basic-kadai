package kadai_028;

public class JyankenExec_Chapter28 {

    public static void main(String[] args) {
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

        // 自分の手を入力
        String myChoice = jyanken.getMyChoice();

        // 相手の手を乱数で選ぶ
        String opponentChoice = jyanken.getRandom();

        // じゃんけん実行
        jyanken.playGame(myChoice, opponentChoice);
    }
}

