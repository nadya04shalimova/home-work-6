public class Main{

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
     //Задание1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int arrOne=0;
        for (int i=0;i<arr.length-1;i++){
       arrOne+=arr[1];
}
        System.out.println("Сумма трат за месяц составила "+ +arrOne+" рублей");

          //Задание 2
   int arrTwo=0;
   int arrThree=0;
   for (int i =0;i<arr.length-1;i++){
   if (arr[i]<arr[i+1]){
     arrTwo=arrTwo+arr[i];}
       if (arr[i]<arr[i+1]){
       arrThree=arrThree+arr[i+1];
}
}
System.out.println("Минимальная сумма трат за день составила "+arrTwo+" рублей. Максимальная сумма трат за день составила "+arrThree+" рублей");
     //Задание 3
int division=0;
division=arrOne/arr.length-1;
        System.out.println("Средняя сумма трат за месяц составила "+division+" рублей");
      //Задание 4
char[] reverseFullName={ 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
for (int i=0; i< reverseFullName.length;i++){
    System.out.println(reverseFullName[i]);
}






}
}