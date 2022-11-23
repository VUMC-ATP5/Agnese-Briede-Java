package lekcijaCetri.majasDarbs.classHomework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Bird {
    String type;
    String[] validTypes = {"swan", "duck", "eagle", "pelican"};

    public Bird() {
        int randomType = new Random().nextInt(this.validTypes.length);
        this.type = this.validTypes[randomType];
    }

    public Bird(String type) throws Exception {

        this.type = type;
    }

    public boolean isValidType(String name){
        return Arrays.stream(this.validTypes).anyMatch(name::matches);
    }

    public boolean isValid(){
        return this.isValidType(this.type);
    }

    public boolean isRandomBird() {
        return this.type.equals("random");
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 20; i++) {
            Bird currentBird = new Bird();


            if(i == 15){
                currentBird = new Bird("HumanBird");
            }

            System.out.println(currentBird.type);

            if(!currentBird.isValid()){
                System.out.println("The current bird is invalid...");
            }


        }
    }
}
