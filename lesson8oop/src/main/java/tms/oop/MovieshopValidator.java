package tms.oop;

public class MovieshopValidator {

    public boolean isAgeValid(int age, Genre genre) {

        return genre.getMinAge() < age;

    }

}
