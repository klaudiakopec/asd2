package czescC;

public class BubbleSort {
    public static void main(String[] args) {
        int [] numbers = {5,2,8,7,23,79,4,434,56,90};
        int counter = 0;
        int temp;

        for(int j=0; j< numbers.length-1; j++){
            for (int i=0; i< numbers.length-1;i++){
                counter++;
                if(numbers[i]>numbers[i+1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
        for(int number : numbers){
            System.out.print(number+ "  ");
        }
    }
}
