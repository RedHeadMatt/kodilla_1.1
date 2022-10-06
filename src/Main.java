public class Main {
    public static void main(String[] args) {

        String name = "Adam";
        double age = 40.5;
        double height = 178;

        UserCheck userOne = new UserCheck(30, 160);

        System.out.println("NEW VERSION");

        boolean userNameIsNotNull = userOne.nameIsNotNull(name);


        if (userNameIsNotNull) {
            if (userOne.validateAge(age) && userOne.validateHeight(height)) {
                System.out.printf("User is older than %d and higher then %d cm\n", 30, 160);
            } else {
                System.out.printf("User is younger than %d or lower than %d cm\n", 30, 160);
            }
        }

        System.out.println("OLD VERSION ");


        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }

    }
}

class UserCheck {

    private final double minAge;
    private final double minHeight;

    public UserCheck(double minAge, double minHeight) {
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public boolean nameIsNotNull(String name) {

        return name != null;
    }

    public boolean validateAge(double age) {
        return age > minAge;
    }

    public boolean validateHeight(double height) {
        return height > minHeight;
    }


}
