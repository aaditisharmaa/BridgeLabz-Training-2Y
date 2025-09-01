import java.util.Scanner;// for user input
    public class Vote{// class generate kri
        public static void main(String[] args) {//static class
            Scanner ages = new Scanner(System.in);//system.in take input from keyboard and new genrate new object

            //int age = ages.nextInt();
            int[] age = new int[10];
            System.out.println("enter ages of 10 students one by one");
            for(int i=0 ; i<10 ; i++) {
                age[i] = ages.nextInt();//input lere
                   } // input leliya arr me
             for(int i =0 ; i<10 ; i++) {
                if (age[i] > 0 && age[i] < 18){
                    System.out.println("the student with the age" + age[i] +"cannot vote");

                }
                else if (age[i]>=18){
                    System.out.println("the student with age " + age[i]+ "can vote");
                }
                else {
                    System.out.println("invalid age" + age[i]);
                }
            
            

             }
             ages.close();
                
            
        }
    }
