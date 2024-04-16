package org.example;

import org.example.dto.SystemPl;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Galaxy galaxy =
                new Galaxy("galaxy",
                new SystemPl("sun",
                        new Planet("earth",
                                new Country("rb",
                                        new City("vitebsk",
                                                new Street("pervom",
                                                        new Address("dom 3")
                                                )
                                        )
                                )
                        )
                )
        );

        String name = Optional.ofNullable(galaxy)
                .map(Galaxy::getSystemPl)
                .map(systemPl -> systemPl.getPlanet())
                .map(Planet::getCountry)
                .map(Country::getCity)
                .filter(city -> city.getName().equals("minsk"))
                .map(City::getStreet)
                .map(Street::getAddress)
                .map(Address::getName)
                .orElse("unknown");




//        Optional<Galaxy> galaxy1 = Optional.ofNullable(galaxy);
//
//        if (galaxy1.isEmpty()) {
//            java.lang.System.out.println("no galaxy");
//        }

//                .orElseThrow(() -> new RuntimeException("no galaxy specific"));
//                .orElseGet(() -> new Galaxy("empty", null) );
//                .orElse(new Galaxy("empty", null));
//                .get();


        User user = new User();
//        String nameUser = user.getName().orElseThrow(() -> new NoNameException());

//        UserSerrvice serrvice = new UserSerrvice();
//        User user1 = serrvice.getByLogin("test")
//                .orElseThrow(() -> new CannotFoundException());

        OptionalDouble average = IntStream.of(1, 2, 3)
                .filter(value -> value > 1)
                .average();

        double v = average.orElse(-1);

        System.out.println("");


    }
}