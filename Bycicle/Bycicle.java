class Bycicle {
private int speed;
public void accelarate(int increment) {
speed += increment;
}
public void printSpeed() {
System.out.println("Speed: " + speed);
}
public void brake(int decrease) {
speed -= decrease;
}
}
