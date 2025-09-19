package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    // 辞書(HashMap)の宣言
    private HashMap<String, String> dictionary = new HashMap<>();

    // コンストラクタで辞書に英単語と意味を追加
    public Dictionary_Chapter21() {
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 辞書を調べるメソッド
    public void searchWords(String[] words) {
        for (String word : words) {
            if (dictionary.containsKey(word)) {
                // 辞書に存在する場合
                System.out.println(word + " の意味は " + dictionary.get(word) + " です。");
            } else {
                // 辞書に存在しない場合
                System.out.println(word + " は辞書に存在しません。");
            }
        }
    }
}

