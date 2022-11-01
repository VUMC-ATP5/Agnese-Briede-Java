package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);

        System.out.println(faker.shakespeare().romeoAndJulietQuote());
        System.out.println(faker.address().streetName());
        for (int i=0; i<10; i++) {
            System.out.println(faker.cat().name());
        }

        System.out.println(faker.address().fullAddress());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.country().capital());
        System.out.println(faker.beer().name());
        System.out.println(faker.name().lastName());
        System.out.println(faker.internet().emailAddress());

    }
}
