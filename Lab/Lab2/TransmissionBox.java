package Lab.Lab2;

public class TransmissionBox {
    private int currentSpeed;
    private int threshold1;
    private int threshold2;
    private int threshold3;
    private int threshold4;
    private int currentGear;

    public TransmissionBox(int currentSpeed, int threshold1, int threshold2, int threshold3, int threshold4) {
        this.currentSpeed = currentSpeed;
        this.threshold1 = threshold1;
        this.threshold2 = threshold2;
        this.threshold3 = threshold3;
        this.threshold4 = threshold4;
        this.currentGear = this.getGear();
    }

    public TransmissionBox increase(){
        return new TransmissionBox(this.currentSpeed + 2,threshold1, threshold2, threshold3, threshold4);
    }

    public TransmissionBox decrease(){
        return new TransmissionBox(this.currentSpeed - 2,threshold1, threshold2, threshold3, threshold4);
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getGear(){
        int speed = this.currentSpeed;
        if (speed < threshold1) {
            return 1;
        } else if (speed < threshold2) {
            return 2;
        } else if (speed < threshold3) {
            return 3;
        } else if (speed < threshold4) {
            return 4;
        } else {
            return 5;
        }
    }

    public String toString(){
        int currentGear = getGear();
        return String.format("Current Speed is: " + this.currentSpeed + "\n" + "Current Gear is: " + currentGear);
    }

    public static void main(String[] args) {
        TransmissionBox ts = new TransmissionBox(25, 10, 20, 35,50);
        //ts = ts.increase();
        System.out.println(ts);
    }
}
