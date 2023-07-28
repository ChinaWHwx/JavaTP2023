package Enum;

import java.util.EnumSet;

public enum Semaine {
        LUNDI(0),
        MARDI(1),
        MERCREDI(2),
        JEUDI(3),
        VENDREDI(4),
        SAMEDI(5),
        DIMANCHE(6);

        private final int value;

        Semaine(int value) {
                this.value = value;
        }

        public int getValue() {
                return value;
        }

        public static void main(String[] args) {
                // 输出所有枚举常量
                System.out.println("All days:");
                for (Semaine jour : Semaine.values()) {
                        System.out.println(jour + " : " + jour.getValue());
                }

                // 输出周一到周五的枚举常量
                System.out.println("\nWorking days:");
                for (Semaine j : EnumSet.range(Semaine.LUNDI, Semaine.VENDREDI)) {
                        System.out.println(j + " : " + j.getValue());
                }
        }
}




