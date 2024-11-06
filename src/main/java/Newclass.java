package main.java;

import java.util.Random;

public class Newclass {

   public int printRandomFibonacciNumbers() {
      Random random = new Random();
      for (int i = 0; i < 10; i++) {
         int randomIndex = random.nextInt(20); // Generating random index for Fibonacci
         return Main.fibonacci(randomIndex);
      }

      return 0;
   }
}
