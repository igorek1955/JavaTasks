package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
//        Hen rus = new RussianHen();
//        RussianHen.eggs = 2;
//        MoldovanHen.eggs = 3;
//        System.out.println(RussianHen.eggs);
//        System.out.println(MoldovanHen.eggs);
//        System.out.println(rus.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) {
                case "Belarus":
                    hen = new BelarusianHen();
                    break;
                case "Ukraine":
                    hen = new UkrainianHen();
                    break;
                case "Russia":
                    hen = new RussianHen();
                    break;
                case "Moldova":
                    hen = new MoldovanHen();
                    break;
            }
            return hen;
        }
    }


}
