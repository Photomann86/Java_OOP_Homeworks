package Seminar1_HW;

import javax.management.RuntimeErrorException;

public class chocolate extends Product{
    private int cocoaCont;

        public int getCocoaCont() {
            return cocoaCont;
        }

        public Chocolate(String name, String brand, double price, int cocoaCont) {
            super(name, brand, price);
            if (cocoaCont>=0 && cocoaCont<=100) {
                this.cocoaCont = cocoaCont; 
            } else {
                throw new RuntimeErrorException(null, "Wrong value for cocoaCont");
            }
        }

        public String displayInfo() {
            return String.format("%s - %s - %f - содержание какао: %d", name, brand, price, cocoaCont);
        }
}
