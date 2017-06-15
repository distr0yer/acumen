import java.util.HashMap;

public class AnagramExample {

    public static void main(String[] args) {
        // Anagram: Positive case
        String str1 = "Clint Eastwood";
        String str2 = "Old west action";
        
        // Using HashMap for sorting and comparing key, value pairs
        HashMap map1 = setToMap(str1.toLowerCase());
        HashMap map2 = setToMap(str2.toLowerCase());

        // Expected result: True
        System.out.println(map1.equals(map2));

        // Anagram: Positive case
        str1 = "Arrigo Boito";
        str2 = "Tobia Gorrio";

        map1 = setToMap(str1.toLowerCase());
        map2 = setToMap(str2.toLowerCase());

        // Expected result: True
        System.out.println(map1.equals(map2));

        // Anagram: Negative case
        str1 = "This is not one";
        str2 = "Not one this is not";


        map1 = setToMap(str1.toLowerCase());
        map2 = setToMap(str2.toLowerCase());

        // Expected result: False
        System.out.println(map1.equals(map2));
    }

    /**
     * Converts a string to a HashMap with the keys set to unique characters and the value set to their frequency. Big O: O( N )
     *
     * @param str String that is to be translated into a HashMap
     * @return      HashMap of the String
     */
    public static HashMap setToMap(String str){
        HashMap<Character, Integer> map1 = new HashMap<>();

        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == ' '){
                continue;
            }
            if(map1.containsKey(str.charAt(i))){
                map1.put(str.charAt(i), map1.get(str.charAt(i)) + 1);
            }
            else{
                map1.put(str.charAt(i), 0);
            }
        }
        return map1;
    }
