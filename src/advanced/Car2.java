package advanced;

public class Car2 {

    private int speed;

    public void run(int speed) throws Exception{
        if(speed < 0 || speed >= 180){
            throw new IllegalAccessException("スピードの出し過ぎです");
        }else if(speed <= 180){
            this.speed += speed;
            System.out.println("スピードが" + this.speed + "km/hになりました");
        }
    }
}
