public class StringMethods {
    public static void main(String[] args) {
        String name = "Harry Lewis"; // normal approach - object created on the String Pool

        System.out.println(name.charAt(6)); // can access specific characters based on index
        // remember that Java is zero-indexed, so charAt(0) is the first character in the String

        System.out.println(name.length());  // returns the length of the string.

        System.out.println(name.contains("Harry")); // checking whether your string contains the given string
        // returns boolean

        String formatted = String.format("The trainee's name is %s", name); // formatting the string and then printing it out

        System.out.println(formatted);

        String result = String.join(", ", "Harry", "Monali"); // combines strings using a specified delimiter, args delimiter, elements
        // join() is similar to using stringBuilder or stringBuffer.
        // The efficiency should be similar as join is likely to use a string buffer internally.

        System.out.println(result);

        // We have previously seen the concat(String str) method.
        // Try this out too.

        System.out.println(name.indexOf('r'));  // returns the index with the first
          // occurrence of the specified character.

        System.out.println(name.indexOf('r', 3));
        // returns the index with the first occurrence of the specified character,
        // starting at the specified index.

        System.out.println(name.isEmpty());
        // returns true if and only if length() is 0.


        System.out.println(name.replace('H', 'B'));

        // Returns a string resulting from replacing all occurrences of
        // oldChar in this string with newChar.
        // You should also try to use the methods:
        // replace(CharSequence target, CharSequence replacement)
        // replaceAll(String regex, String replacement)


        String names = "Harry; Mihai; Monali";
        String[] namesArray = names.split("[,;]");  // splits the string around matches
                                                  // of the given regular expression
        for(String n:namesArray){
            System.out.println(n);
        }

        System.out.println(names.substring(7,12));
        // Be carefull with StringIndexOutOfBoundsException
        // Why don't you try running: names.substring(7,21);



        String whitespaceString = "      Charles    ";

        System.out.println(whitespaceString);
        System.out.println(whitespaceString.trim());
        // removes the leading and trailing whitespace from the strings
        // strip() is an equivalent method
    }
}
