package com.company;

public class Main {

    public static void main(String[] args) {

        int temperature =4;
        int studentsNumber =15;
        boolean isSnowy = false;

        if (temperature> 15 && studentsNumber> 10){//&& - логический оператор "И" (end)
            //false && true = > 0 * 1 = 0 (false)
            System.out.println("едем на пикник");
    }

        if (isSnowy || studentsNumber <5){// || -логический оператор "ИЛИ" (or)
            // (false || true => 1 + 0 = 1 (TRUE)
            System.out.println("идем в кино");

        }isSnowy = false;

        if(!isSnowy){
            System.out.println("хорошая погода");
        }
        if (temperature< 0 || isSnowy && studentsNumber >5){
            // (false || true) && true = (0 + 1) * 1= 1(TRUE)
            System.out.println("что либо");
        }

        if(!isSnowy){ // логический оператор отрицания "НЕ" (NOT)
            System.out.println("хорошая погода");
        }

    }
}
