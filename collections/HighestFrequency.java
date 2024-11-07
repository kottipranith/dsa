import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < size; i++)  arr[i] = sc.nextInt();

        Map<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();

        for(int i = 0; i < size; i++) {
            // if(hashMap.get(key) == null)
            if(hashMap.containsKey(arr[i])) {
                int value = hashMap.get(arr[i]);
                hashMap.put(arr[i], value + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }

        // System.out.println(hashMap);

        int maxFreq = 1;
        int minOutput = -1;
        int maxOutput = -1;
        int firstOutput = -1;
        int duplicatedOutput = -1;
        for(Map.Entry<Integer, Integer> keyvaluePair : hashMap.entrySet()) {
            int value = keyvaluePair.getValue();

            if (maxFreq < value) {
                maxFreq = value;
            }
        }

        for(Map.Entry<Integer, Integer> keyvaluePair : hashMap.entrySet()) {
            int key = keyvaluePair.getKey();
            int value = keyvaluePair.getValue();

            if(value == maxFreq) {
                if(minOutput == -1) minOutput = key;
                if(maxOutput == -1) maxOutput = key;

                if(minOutput > key) minOutput = key;
                if(maxOutput < key) maxOutput = key;
            }
        }

        // System.out.println(output + " -> " + maxFreq);
        System.out.println(minOutput + " -> " + maxFreq);
        System.out.println(maxOutput + " -> " + maxFreq);

        for(Map.Entry<Integer, Integer> keyvaluePair : hashMap.entrySet()) {
            if(keyvaluePair.getValue() == maxFreq) {
                firstOutput = keyvaluePair.getKey();
                break;
            }
        }

        System.out.println(firstOutput + " -> " + maxFreq);

        List<Integer> arr1 = new ArrayList<Integer>();

        for(int ele : arr) {
            if(hashMap.get(ele) == maxFreq) {
                if(arr1.contains(ele)) {
                    duplicatedOutput = ele;
                    break;
                }
                arr1.add(ele);
            }
        }

        System.out.println(duplicatedOutput + " -> " + maxFreq);
    }
}
