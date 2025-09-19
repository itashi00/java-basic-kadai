package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dict = new Dictionary_Chapter21();

        // 調べる英単語を配列にセット
        String[] words = {"apple", "banana", "grape", "orange"};

        // メソッドを呼び出して検索
        dict.searchWords(words);
    }
}
