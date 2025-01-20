package advanced;

public class Car {
    private int speed;

    public void run()throws OverSpeedException{ //検査例外
        speed += 10;
        if(speed >= 120){
            throw new OverSpeedException("スピードの出し過ぎです");  //120以上になったら例外を発生させる
        }
    }
}
