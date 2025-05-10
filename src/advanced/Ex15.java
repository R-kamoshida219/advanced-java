package advanced;

public class Ex15 {

    public static void main(String[] args) {
        Car2 car = new Car2();
    
        try {
            car.run(40);
            car.run(200);
        }catch(Exception e) {
            e.printStackTrace();
        }
        }
    }

    //【わからん】
