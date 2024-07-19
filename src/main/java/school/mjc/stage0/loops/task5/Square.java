package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength == 0){
            return;
        }
        for (int x = 0; x < sideLength; x++){
            System.out.print("8");
        }
        System.out.println();
        for (int i = 0; i < sideLength -2; i++){
            System.out.print("8");
            for (int j = 0; j < sideLength -2; j++){
                System.out.print(" ");
            }
            System.out.println("8");
        }
        if (sideLength > 1){
            for (int x = 0; x < sideLength; x++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
