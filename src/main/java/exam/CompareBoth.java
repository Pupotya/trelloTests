package exam;

public class CompareBoth {

    int x = 8;
    int y = 3;

    public static void main(String[] args) {

        CompareBoth cb = new CompareBoth();
        cb.setX(10);
        cb.setY(5);
        System.out.println(cb.getX());
        System.out.println(cb.getY());
        System.out.println(cb.sum(cb.getX(), cb.getY()));
        System.out.println(cb.compareBothNumbers(cb.getX(), cb.getY()));

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int sum(int x, int y) {

        return x + y;
    }

    public int compareBothNumbers(int x, int y) {
        return x > y ? x : y;
    }

}
