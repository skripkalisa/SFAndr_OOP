package Mod7.Printer;

public class Main {


    public static void main(String[] args) {
/*
You have to pass to print() method anonymous Formatter
which add to the beginning of the line two astericks ("** ... **")
*/


        CoolPrinter.add("One, two,");
        CoolPrinter.add("I love you.");
        CoolPrinter.add("Three, four,");
        CoolPrinter.add("Touch the floor.");
//        CoolPrinter.print(/*pass anonymous Formatter here*/);
        CoolPrinter.print(new Formatter() {
            @Override
            public String format(String line) {
                return "** " + line + " **";
            }
        });

/*
This fragment of code has to output

** Own, two, **
** I love you. **
** Three, four, **
** Touch the floor. **

Spaces are important.

*/
    }

}
