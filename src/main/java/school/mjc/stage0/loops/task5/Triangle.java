package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        if (cathetusLength < 1){
            return;
        }
        for (int x = 1; x <= cathetusLength; x++){
            for (int y = 1; y <= x; y++){
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(3);
    }
}
