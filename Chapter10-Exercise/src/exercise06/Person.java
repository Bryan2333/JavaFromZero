package exercise06;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        /*Boat boat = VehicleFactory.getBoat();
        boat.work();*/
        // vehicles不能是空，也不是船
        if (!(vehicles instanceof Boat)) {
            vehicles = VehicleFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        //判断一下，当前Vehicle的属性
        if (vehicles == null) {
            //使用多态
            vehicles = VehicleFactory.getHorse();
        }
        //体现调用接口
        vehicles.work();
    }

    public void passVolcano() {
        if (!(vehicles instanceof Plane)) {
            vehicles = VehicleFactory.getPlane();
        }
        vehicles.work();
    }
}
