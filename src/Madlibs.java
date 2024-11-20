public class Madlibs {

    String classmate;
    String city;
    String noun;
    String adjective;
    String pluralnoun;
    String pluralanimal;
    boolean trueorfalse;
    double decimalbigger1;
    int number1;
    int number2;
    int wholenumber14;
    String teacher;
    String dean;
    char lettergrade;
    String season;

    public Madlibs() {
        classmate = "Bob";
        city = "LA";
        noun = "Sun";
        adjective = "funny";
        pluralnoun = "marshmallows";
        pluralanimal = "Fish";
        trueorfalse = true;
        decimalbigger1 = 75.5;
        number1 = 10;
        number2 = 3;
        wholenumber14 = 2;
        teacher = "Ms. Lund";
        dean = "Ms. Sugrue";
        lettergrade = 'A';
        season = "summer";


        String story = "This weekend I am going camping with "
                + classmate + ". We are going to a campsite in "
                + city + ". I packed my " + noun + " and "
                + pluralnoun + ".  The forecast is calling for a high of "
                + decimalbigger1 + " degrees fahrenheit. So it should be a "
                + adjective + " day! This year, the park rangers have seen "
                + number1 + " " + pluralanimal + " which seems kind of dangerous. "
                + teacher + " said it's " + trueorfalse + " that " + pluralanimal + " eat class "
                + wholenumber14 + " students in the " + season + ". But, "
                + dean + " said it actually has only happened "
                + number2 + " times. Wish us luck! If we survive, we will earn a "
                + lettergrade + "- in P.E. class.";

        System.out.println(story);

    }


    public static void main(String[] args) {
        new Madlibs();
    }
}























