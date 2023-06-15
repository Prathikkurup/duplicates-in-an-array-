import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetsUpgrade2
{
        public static List<Integer> findDuplicates(int[] nums) {
            Map<Integer, Integer> frequency = new HashMap<>();
            List<Integer> duplicates = new ArrayList<>();

            for (int num : nums) {
                if (frequency.containsKey(num)) {
                    frequency.put(num, frequency.get(num) + 1);
                } else {
                    frequency.put(num, 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() == 2) {
                    duplicates.add(entry.getKey());
                }
            }

            return duplicates;
        }

        public static void main(String[] args) {
            int[] inputArray = {4, 3, 2, 7, 8, 2, 3, 1};
            List<Integer> output = findDuplicates(inputArray);
            System.out.println(output); // [2, 3]
        }


}

//in this Java implementation, we define a method findDuplicates that takes an integer array as input and returns a list of duplicate elements. We use a HashMap to store the frequency of each element in the array. After counting the frequencies, we iterate through the entries in the map and add the elements with a frequency of 2 to the duplicates list. Finally, we print the output list in the main method.

//When you run the code, it will output [2, 3], which are the elements that appear twice in the array.

/*Create a method findDuplicates that takes an integer array nums as input and returns a list of integers.
Create a HashMap called frequency to store the frequency of each element.
Create an ArrayList called duplicates to store the duplicate elements.
Iterate through each element num in the nums array:
If num is already a key in the frequency map, increment its corresponding value by 1.
Otherwise, add num as a key in the frequency map with an initial value of 1.
Iterate through each key-value pair in the frequency map:
If the value is equal to 2, add the key to the duplicates list.
Return the duplicates list.
In the main method:
Create an integer array inputArray with the given input values.
Call the findDuplicates method with inputArray as an argument and assign the returned list to the output variable.
Print the output list.*/
