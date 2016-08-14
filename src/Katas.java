import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by chris on 8/13/16.
 */
public class Katas {
    // Given an ArrayList of ints, return true if 6 appears as either the first or
    // last element in the ArrayList. The ArrayList will be length 1 or more.
    public static boolean sameFirstLast(ArrayList<Integer> ints) {
        return ints.get(0).equals(ints.get(ints.size() - 1));
    }

    // Given an ArrayList of Integers, return true if the ArrayList is length 1
    // or more, and the first element and the last element are equal.
    public static boolean sameFirstLast6(ArrayList<Integer> ints) {
        return ints.get(0).equals(6) || ints.get(ints.size() - 1).equals(6);
    }

    // Given an ArrayList of Integers length 3, return an ArrayList with the elements
    // "rotated left" so [1, 2, 3] yields [2, 3, 1].
    public static ArrayList<Integer> rotateLeft3(ArrayList<Integer> ints) {
        int temp = ints.get(0);
        ints.remove(0);
        ints.add(temp);
        return ints;
    }

    // Given an ArrayList of Integers length 3, return an ArrayList with the elements
    // "rotated left" so [1, 2, 3] yields [2, 3, 1].
    public static void rotateLeft(ArrayList<Integer> ints) {
        Collections.rotate(ints, ints.size() - 1);
    }

    // Given an ArrayList of Integers length 3, return a new ArrayList with the
    // elements in reverse order, so [1, 2, 3] becomes [3, 2, 1].
    public static void reverse(ArrayList<Integer> ints) {
        for (int i = 0; i < ints.size() / 2; i++) {
            Collections.swap(ints, i, ints.size() - 1 - i);
        }
    }

    // Given an ArrayList of Integers of at least length 2, return the sum of the
    // first elements in the ArrayList and the second from last element. If the
    // ArrayList length is less than 2, just sum up the elements that exist,
    // returning 0 if the array is length 0.
    public static int sumFirstPenultimate(ArrayList<Integer> ints) {
        if (ints.size() >= 2) {
            return ints.get(0) + ints.get(ints.size() - 2);
        } else if (ints.size() == 1) {
            return ints.get(0);
        }
        return 0;
    }

    // Modify and return the given HashMap as follows: if the key "a" has a value,
    // set the key "b" to have that value, and set the key "a" to have the value "".
    // Basically "b" is a bully, taking the value of "a".
    public static HashMap<String, String> mapBully(HashMap<String, String> hash) {
        if (hash.containsKey("a")) {
            if (hash.containsKey("b")) {
                hash.replace("b", hash.get("a"));
                hash.replace("a", "");
            } else {
                hash.put("b", hash.get("a"));
                hash.replace("a", "");
            }
        }
        return hash;
    }

    // Modify and return the given HashMap as follows: if the key "a" has a value,
    // set the key "b" to have that same value. In all cases remove the key "c",
    // leaving the rest of the map unchanged.
    public static HashMap<String, String> mapShare(HashMap<String, String> hash) {
        if (hash.containsKey("a")) {
            if (hash.containsKey("b")) {
                hash.replace("b", hash.get("a"));
            } else {
                hash.put("b", hash.get("a"));
            }
        }

        if (hash.containsKey("c")) {
            hash.remove("c");
        }
        return hash;
    }

    // Modify and return the given HashMap as follows: for this problem the HashMap
    // may or may not contain the "a" and "b" keys. If both keys are present,
    // append their 2 string values together and store the result under the key "ab".
    public static HashMap<String, String> mapAB(HashMap<String, String> hash) {
        if (hash.containsKey("a")) {
            if (hash.containsKey("b")) {
                hash.put("ab", hash.get("a") + hash.get("b"));
            }
        }
        return hash;
    }

    // Given an ArrayList of strings, return a HashMap containing a key for every
    // different string in the ArrayList, and the value is that string's length.
    public static HashMap<String, String> wordLen(ArrayList<String> wordList) {
        HashMap<String, String> hash = new HashMap<>();
        hash.clear();
        Integer length;

        for (String aWordList : wordList) {
            if (!(hash.containsKey(aWordList))) {
                length = aWordList.length();
                hash.put(aWordList, length.toString());
            }
        }
        return hash;
    }

    // Given an ArrayList of words, return a HashMap> containing a keys for every
    // word's first letter. The value for the key will be an ArrayList of all
    // words in the list that start with that letter. An empty string has no first
    // letter so don't add a key for it.
    public static HashMap<String, ArrayList<String>> indexWords(ArrayList<String> wordList) {
        HashMap<String, ArrayList<String>> hash = new HashMap<>();
        hash.clear();
        ArrayList<String> list;
        String index;

        for (String aWordList : wordList) {
            if (aWordList.length() != 0) {
                index = aWordList.substring(0, 1);

                if (hash.containsKey(index)) {
                    list = hash.get(index);
                    list.add(aWordList);
                } else {
                    list = new ArrayList<String>();
                    list.add(aWordList);
                    hash.put(index, list);
                }
            }
        }
        return hash;
    }

}

