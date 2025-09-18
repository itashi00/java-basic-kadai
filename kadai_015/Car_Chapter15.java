package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;   // 現在のギア（初期値1）
    private int speed = 10; // 現在の速度（初期値10）

    // ギアを変えるメソッド
    public void changeGear(int afterGear) {
        // フィードバック指示どおり：出力はギアを書き換える前に行う
        System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

        // ギアを更新
        gear = afterGear;

        // 更新後のギアに応じて速度を設定
        switch (gear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10;
                break;
        }
    }

    // 走行（速度を表示）
    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }
}
