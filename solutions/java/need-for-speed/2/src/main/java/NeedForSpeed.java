class NeedForSpeed {
    public int distance = 0;
    public int speed = 0;
    public int batteryDrain = 0;
    public int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
        // if(battery < batteryDrain) {
        //     return true;
        // } else  {
        //     return false;
        // }
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        // nombre de mètres égal à la vitesse de la voiture
        if (battery > 0){
            distance += speed;
            battery -= batteryDrain;
        }

        batteryDrained();
        distanceDriven();
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
        return nitro;
    }
}

class RaceTrack {
    public int distance = 0;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        //nb max de trajets * distance d'un trajet
        int maxDistance = car.battery / car.batteryDrain * car.speed;  

        return distance <= maxDistance;
        // if (distance > maxDistance) {
        //     return false;
        // } else {
        //     return true;
        // }
    }
}
