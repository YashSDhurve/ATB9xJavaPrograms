package Oct.ex_28102024_Strings_Functions_Arrays;

public class Lab123_String_Functions {
    public static void main(String[] args) {

        //substring
//        String statment = "Happy Diwali To All";
//        String wish = statment.substring(6,12);
//        System.out.println(wish); // Diwali it will always take end index (-1 )
//
//        //concatination
//        String firstName= "Yash";
//        String lastName= " Dhurve";
//        String fullName = firstName.concat(lastName);
//        System.out.println(fullName);
//
//        String fatherName=firstName.concat(" Shankarrao");
//        System.out.println(fatherName);
//
//        String completeName=fatherName.concat(lastName);
//        System.out.println(completeName);

        //concatination by + operator

//        String plusName=firstName+lastName;
//        System.out.println(plusName);
//        String plus_Name=firstName+" S."+lastName;
//        System.out.println(plus_Name);
//
//        //Splitting String
//        // using Delimeter -> , (comma)
//
//        String fruits = "Apple, Banana, Cherry";
//
//        String[] split_fruits= fruits.split(",");
//        System.out.println(split_fruits[0]);
//        System.out.println(split_fruits[1]);
//        System.out.println(split_fruits[2]);
//
//        // using Delimeter -> : (colon)
//
//        String fruit = "Apple:Banana:Cherry";
//
//        String[] split_fruit= fruit.split(":");
//        System.out.println(split_fruit[0]);
//        System.out.println(split_fruit[1]);
//        System.out.println(split_fruit[2]);

        //charAt();

//        String s1="Krishna";
//        System.out.println(s1.charAt(3));
      //  System.out.println(s1.charAt(9)); // .StringIndexOutOfBoundsException

        //trim()

//        String t= " Shree Krishna ";
//        System.out.println(t.trim()); // remove the first and last spaces
//
//        // indexOf
//        System.out.println(t.indexOf("r"));
//
//        //contains()
//        System.out.println(t.contains("Krish"));
//
//        //lastIndexOf
//        System.out.println(t.lastIndexOf("s"));
//
//        //replace('i', 'u'));
//        System.out.println(t.replace('i', 'u'));
//
//        //startsWith and endsWith
//        System.out.println(t.startsWith(" Shr"));
//        System.out.println(t.endsWith("na"));

        // Example of Strings in SCP

        String myName1= "Yash";
        String myName2= "Yash";

        //:. myName1 = "Yash" = myName2


        // Example of String in OA/Heap Area
        String myName3= new String("Yash");
        System.out.println(myName3);

        System.out.println(myName1==myName2);
        System.out.println(myName1==myName3);
        System.out.println(myName1.equals(myName3));
        System.out.println(myName1.equals(myName2));


        // the Strings in SCP are equal if the values are equal but they are different if One String is in SCP and One is OA or Heap area

      // == -> is used to compare the String not the values
      // equals() -> is used to check the values of the String not the location(SCP and OA)


    }
}
