import java.util.*;  

class Pointer 
{
    public static void main(String[] args) 
    {
        // Create first HashMap (map1)
        HashMap<String, Integer> map1 = new HashMap<>();

        // Create second HashMap (map2)
        HashMap<String, Integer> map2 = new HashMap<>();

        // Put a key-value pair into map1
        map1.put("value", 11);

        // Assign map1's reference to map2 (both now point to the same object in memory)
        map2 = map1;

        // Print map1 (should show {value=11})
        System.out.println(map1);

        // Print map2 (also shows {value=11}, since it points to the same object as map1)
        System.out.println(map2);

        // Update the value of the key "value" in map1
        map1.put("value", 22);

        // Print map2 (will reflect the updated value {value=22}, because map2 refers to the same object as map1)
        System.out.println(map2);
    }
}
