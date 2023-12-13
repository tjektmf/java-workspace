package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class D05_yachtDice {

   /*
    * 주사위를 5개를 던지고 5개의 눈으로 어떤 패가 만들어졌는지 구분
    * 
    * 1. 풀하우스, 같은눈이 3/2 ex) 11122 11222 33322 33555
    * 
    * 2. 스몰 스트레이트 > 연속된 눈이 4개
    * 
    * 3. 라지 스트레이트 > 연속된 눈이 5개
    * 
    * 4. three of kind (같은 주사위 눈이 3개)
    * 
    * 5. four of kind (같은 눈 4개)
    * 
    * 6. yacht (같은 눈 5개)
    * 
    * 
    * 
    */

   static Collection<Integer> luckyDice = new ArrayList<>();

   static Scanner sc = new Scanner(System.in);

   public static void select() {
      for (int i = 0; i < 5; i++) {
         luckyDice.add(sc.nextInt());
      }
   }

   public static Collection<Integer> random() {
      for (int i = 0; i < 5; i++) {
         Collections.addAll(luckyDice, (int) (Math.random() * 6) + 1);
      }
      return luckyDice;
   }

   static boolean fullHouse() {
      List<Integer> dice = new ArrayList<>();
      dice = (List<Integer>) luckyDice;
      for (int i = 1; i < 7; i++) {
         for (int j = 1; j < 7; j++) {
            if (Collections.frequency(dice, i) == 2) {
               if ((Collections.frequency(dice, j) == 3) && (i != j)) {
                  return true;
               }
            } else if (Collections.frequency(dice, i) == 3) {
               if ((Collections.frequency(dice, j) == 2) && (i != j)) {
                  return true;
               }
            }
         }
      }
      return false;
   }

   public static boolean yacht() {
      Set<Integer> yachtCheck = new HashSet<>();
      yachtCheck.addAll(luckyDice);
      if (yachtCheck.size() == 1) {
         return true;
      } else {
         return false;
      }
   }

   public static boolean smallStk() {
      Set<Integer> smallstk = new HashSet<>();

      smallstk.addAll(luckyDice);
      Set<Integer> ans1 = new HashSet<>();
      Set<Integer> ans2 = new HashSet<>();
      Set<Integer> ans3 = new HashSet<>();
      ans1.add(1);
      ans1.add(2);
      ans1.add(3);
      ans1.add(4);

      ans2.add(2);
      ans2.add(3);
      ans2.add(4);
      ans2.add(5);

      ans3.add(3);
      ans3.add(4);
      ans3.add(5);
      ans3.add(6);

      System.out.println(luckyDice);
      if (smallstk.size() == 4) {
         if (smallstk.containsAll(ans1)) {
            return true;
         } else if (smallstk.containsAll(ans2)) {
            return true;
         } else if (smallstk.containsAll(ans3)) {
            return true;
         }
      }
      return false;
   }

   public static boolean largeStk() { // 12345 or 23456 두가지뿐임
      Set<Integer> largeStk = new HashSet<>();
      largeStk.addAll(luckyDice);

      Set<Integer> ans1 = new HashSet<>();
      Set<Integer> ans2 = new HashSet<>();
      ans1.add(1);
      ans1.add(2);
      ans1.add(3);
      ans1.add(4);
      ans1.add(5);

      ans2.add(2);
      ans2.add(3);
      ans2.add(4);
      ans2.add(5);
      ans2.add(6);
      if (largeStk.size() != 5) {
         return false;
      }

      if (fullHouse() || yacht()) {
         return false;
      }
      if (ans1.containsAll(largeStk) || ans2.containsAll(largeStk)) {
         return true;
      } else {
         return false;
      }
   }

   public static boolean three() {
      boolean check = false;
      Set<Integer> three = new HashSet<>();
      three.addAll(luckyDice);
      if (three.size() != 3) {
         return false;
      }
      for (int i = 1; i <= 6; i++) {
         if (Collections.frequency(luckyDice, i) == 3) {
            check = true;
         }
      }
      if (check) {
         return true;
      } else {
         return false;
      }
   }

   public static boolean four() {
      Set<Integer> four = new HashSet<>();
      four.addAll(luckyDice);
      if (four.size() == 2 && !fullHouse() && !yacht()) {
         return true;

      }
      return false;
   }

   public static void main(String[] args) {
   //   System.out.println(random());
      select();
      
      System.out.println("풀하우스 체크 : " + fullHouse());
      System.err.println("yacht 체크 : " + yacht());
      System.out.println("S S 체크 : " + smallStk());
      System.out.println("L S 체크 : " + largeStk());
      System.out.println("Three of kind : " + three());
      System.out.println("four of kind : " + four());

   }
}