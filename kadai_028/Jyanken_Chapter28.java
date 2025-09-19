package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分の手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            choice = scanner.nextLine();

            // 正しい入力か判定
            if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
                break;
            } else {
                System.out.println("エラー: 正しいじゃんけんの手を入力してください");
            }
        }

        return choice;
    }

    // 相手の手を乱数で選ぶメソッド
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int)Math.floor(Math.random() * 3);
        return hands[index];
    }

    // じゃんけんを行うメソッド
    public void playGame(String myChoice, String opponentChoice) {
        HashMap<String, String> handsMap = new HashMap<>();
        handsMap.put("r", "グー");
        handsMap.put("s", "チョキ");
        handsMap.put("p", "パー");

        System.out.println("自分の手は" + handsMap.get(myChoice) + ", 対戦相手の手は" + handsMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) ||
            (myChoice.equals("s") && opponentChoice.equals("p")) ||
            (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}

