package cvTestJava;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static Map<Object, Integer> countElements(Object[] array) {
        Map<Object, Integer> result = new HashMap<>();
        for (Object element : array) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Object[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Object, Integer> counts = countElements(array);
        System.out.println(counts);
	}

}
