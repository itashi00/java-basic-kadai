package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
        Car_Chapter15 car = new Car_Chapter15();
        car.changeGear(3); // ギアを3に切り替え（出力は「ギア1から3に切り替えました」）
        car.run();         // 速度を表示（「速度は時速30kmです」）
    }
}
