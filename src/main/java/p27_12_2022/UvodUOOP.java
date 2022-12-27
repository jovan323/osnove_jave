package p27_12_2022;

public class UvodUOOP {
    public static void main(String[] args) {
        User milan = new User();
        milan.firstName = "Milan";
        milan.lastName = "Jovanović";
        milan.yearOfBirth = 1995;
        milan.stampaj();
        milan.stampajStarost(2022);

//        System.out.println(milan.firstName + " " + milan.lastName +
//                ", " + milan.age + ".god");

//        User.stampajUsera(milan.firstName, milan.lastName, milan.age);
        System.out.println();
        User nikola = new User();
        nikola.firstName = "Nikola";
        nikola.lastName = "Nikolić";
        nikola.yearOfBirth = 2000;
        nikola.stampaj();
        nikola.stampajStarost(2023);
    }


}
