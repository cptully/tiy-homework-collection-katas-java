import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by chris on 8/13/16.
 */
public class Main {
    public static void main (String [] args) {
        ArrayList<Integer> ints = new ArrayList<>();

        //first last 6
        ints.add(1);
        ints.add(2);
        ints.add(6);
        boolean result = Katas.firstLast6(ints);
        System.out.printf("Katas.firstLast6(%s) -> %s\n", ints, result);
        ints.add(0, 6);
        ints.remove(ints.size() - 1);
        ints.add(3);
        result = Katas.firstLast6(ints);
        System.out.printf("Katas.firstLast6(%s) -> %s\n", ints, result);
        ints.add(0, 13);
        result = Katas.firstLast6(ints);
        System.out.printf("Katas.firstLast6(%s) -> %s\n", ints, result);
        ints.clear();
        ints.add(6);
        result = Katas.firstLast6(ints);
        System.out.printf("Katas.firstLast6(%s) -> %s\n", ints, result);
        ints.add(0, 1);
        result = Katas.firstLast6(ints);
        System.out.printf("Katas.firstLast6(%s) -> %s\n", ints, result);
        ints.add(7);
        result = Katas.firstLast6(ints);
        System.out.printf("Katas.firstLast6(%s) -> %s\n", ints, result);


        System.out.printf("\n\n");
        ints.clear();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        result = Katas.sameFirstLast(ints);
        System.out.printf("Katas.sameFirstLast(%s) -> %s\n", ints, result);
        ints.add(1);
        result = Katas.sameFirstLast(ints);
        System.out.printf("Katas.sameFirstLast(%s) -> %s\n", ints, result);
        ints.remove(2);
        result = Katas.sameFirstLast(ints);
        System.out.printf("Katas.sameFirstLast(%s) -> %s\n", ints, result);
        ints.addAll(Arrays.asList(5, 6, 7));
        result = Katas.sameFirstLast(ints);
        System.out.printf("Katas.sameFirstLast(%s) -> %s\n", ints, result);
        ints.add(0, 5);
        result = Katas.sameFirstLast(ints);
        System.out.printf("Katas.sameFirstLast(%s) -> %s\n", ints, result);
        ints.add(5);
        result = Katas.sameFirstLast(ints);
        System.out.printf("Katas.sameFirstLast(%s) -> %s\n", ints, result);


        System.out.printf("\n\n");
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Katas.rotateLeft(ints);
        System.out.printf("-> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(5, 11, 9));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Katas.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(7, 0, 0));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Katas.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(6, 3, 9));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Katas.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(77, 55, 2, 7));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Katas.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(1000, 3000, 5000, 8000, 9000));
        System.out.printf("Katas.rotateLeft(%s)", ints);
        Katas.rotateLeft(ints);
        System.out.printf(" -> %s\n", ints);


        System.out.printf("\n\n");
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        System.out.printf("Katas.reverse(%s)", ints);
        Katas.reverse(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(5, 11, 9));
        System.out.printf("Katas.reverse(%s)", ints);
        Katas.reverse(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(0, 0, 7));
        System.out.printf("Katas.reverse(%s)", ints);
        Katas.reverse(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.printf("Katas.reverse(%s)", ints);
        Katas.reverse(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.printf("Katas.reverse(%s)", ints);
        Katas.reverse(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.addAll(Arrays.asList(11, 12));
        System.out.printf("Katas.reverse(%s)", ints);
        Katas.reverse(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        ints.add(11);
        System.out.printf("Katas.reverse(%s)", ints);
        Katas.reverse(ints);
        System.out.printf(" -> %s\n", ints);
        ints.clear();
        System.out.printf("Katas.reverse(%s)", ints);
        Katas.reverse(ints);
        System.out.printf(" -> %s\n", ints);


       // sumFirstPenultimate([1, 2, 3]) -> 3
       // sumFirstPenultimate([1, 1]) -> 2
       // sumFirstPenultimate([1, 1, 1, 1]) -> 2
       // sumFirstPenultimate([1, 2, 3, 4]) -> 4
        System.out.printf("\n\n");
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3));
        int number  = Katas.sumFirstPenultimate(ints);
        System.out.printf("Katas.sumFirstPenultimate(%s) -> %s\n", ints, number);
        ints.clear();
        ints.addAll(Arrays.asList(1, 1));
        number  = Katas.sumFirstPenultimate(ints);
        System.out.printf("Katas.sumFirstPenultimate(%s) -> %s\n", ints, number);
        ints.clear();
        ints.addAll(Arrays.asList(1, 1, 1, 1));
        number  = Katas.sumFirstPenultimate(ints);
        System.out.printf("Katas.sumFirstPenultimate(%s) -> %s\n", ints, number);
        ints.clear();
        ints.addAll(Arrays.asList(1, 2, 3, 4));
        number  = Katas.sumFirstPenultimate(ints);
        System.out.printf("Katas.sumFirstPenultimate(%s) -> %s\n", ints, number);
        ints.clear();
        ints.add(1);
        number  = Katas.sumFirstPenultimate(ints);
        System.out.printf("Katas.sumFirstPenultimate(%s) -> %s\n", ints, number);
        ints.clear();
        number  = Katas.sumFirstPenultimate(ints);
        System.out.printf("Katas.sumFirstPenultimate(%s) -> %s\n", ints, number);

        //mapBully({"b": "dirt", "a": "candy"}) -> {"b": "candy", "a": ""}
        //mapBully({"a": "candy"}) -> {"b": "candy", "a": ""}
        //mapBully({"b": "carrot", "c": "meh", "a": "candy"}) -> {"b": "candy", "c": "meh", "a": ""}
        System.out.printf("\n\n");
        HashMap<String, String> hash = new HashMap<>();
        hash.put("b", "dirt");
        hash.put("a", "candy");
        HashMap<String, String> newHash;
        System.out.printf("Katas.mapBully(%s) -> ", hash.toString());
        newHash = Katas.mapBully(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.replace("a", "candy");
        hash.remove("b");
        System.out.printf("Katas.mapBully(%s) -> ", hash.toString());
        newHash = Katas.mapBully(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("a", "candy");
        hash.put("c", "meh");
        hash.put("b", "carrot");
        System.out.printf("Katas.mapBully(%s) -> ", hash.toString());
        newHash = Katas.mapBully(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("a", "");
        hash.put("c", "meh");
        hash.put("b", "carrot");
        System.out.printf("Katas.mapBully(%s) -> ", hash.toString());
        newHash = Katas.mapBully(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("a", "candy");
        hash.put("c", "meh");
        hash.put("b", "carrot");
        hash.put("d", "cars");
        System.out.printf("Katas.mapBully(%s) -> ", hash.toString());
        newHash = Katas.mapBully(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("c", "meh");
        hash.put("b", "carrot");
        System.out.printf("Katas.mapBully(%s) -> ", hash.toString());
        newHash = Katas.mapBully(hash);
        System.out.printf("%s\n", newHash.toString());

        //mapShare({"b": "bbb", "c": "ccc", "a": "aaa"}) -> {"b": "aaa", "a": "aaa"}
        //mapShare({"b": "xyz", "c": "ccc"}) -> {"b": "xyz"}
        //mapShare({"d": "hi", "c": "meh", "a": "aaa"}) -> {"d": "hi", "b": "aaa", "a": "aaa"}
        System.out.printf("\n\n");
        hash.put("b", "bbb");
        hash.put("a", "aaa");
        hash.put("c", "ccc");
        System.out.printf("Katas.mapShare(%s) -> ", hash.toString());
        newHash = Katas.mapShare(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("b", "xyz");
        hash.put("c", "ccc");
        System.out.printf("Katas.mapShare(%s) -> ", hash.toString());
        newHash = Katas.mapShare(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("a", "aaa");
        hash.put("c", "meh");
        hash.put("d", "hi");
        System.out.printf("Katas.mapShare(%s) -> ", hash.toString());
        newHash = Katas.mapShare(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("a", "");
        hash.put("c", "meh");
        hash.put("b", "carrot");
        System.out.printf("Katas.mapShare(%s) -> ", hash.toString());
        newHash = Katas.mapShare(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("a", "candy");
        hash.put("c", "meh");
        hash.put("b", "carrot");
        hash.put("d", "cars");
        System.out.printf("Katas.mapShare(%s) -> ", hash.toString());
        newHash = Katas.mapShare(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("c", "meh");
        hash.put("b", "carrot");
        System.out.printf("Katas.mapShare(%s) -> ", hash.toString());
        newHash = Katas.mapShare(hash);
        System.out.printf("%s\n", newHash.toString());

        // mapAB({"b": "There", "a": "Hi"}) -> {"b": "There", "a": "Hi", "ab": "HiThere"}
        // mapAB({"a": "Hi"}) -> {"a": "Hi"}
        // mapAB({"b": "There"}) -> {"b": "There"}
        System.out.printf("\n\n");
        hash.clear();
        hash.put("b", "There");
        hash.put("a", "Hi");
        System.out.printf("Katas.mapAB(%s) -> ", hash.toString());
        newHash = Katas.mapAB(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("a", "Hi");
        System.out.printf("Katas.mapAB(%s) -> ", hash.toString());
        newHash = Katas.mapAB(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("b", "There");
        System.out.printf("Katas.mapAB(%s) -> ", hash.toString());
        newHash = Katas.mapAB(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("b", "There");
        hash.put("a", "Hi");
        hash.put("c", "Play");
        System.out.printf("Katas.mapAB(%s) -> ", hash.toString());
        newHash = Katas.mapAB(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("b", " - ");
        hash.put("a", "Hi");
        System.out.printf("Katas.mapAB(%s) -> ", hash.toString());
        newHash = Katas.mapAB(hash);
        System.out.printf("%s\n", newHash.toString());
        hash.clear();
        hash.put("b", "There");
        hash.put("d", "Hi");
        System.out.printf("Katas.mapAB(%s) -> ", hash.toString());
        newHash = Katas.mapAB(hash);
        System.out.printf("%s\n", newHash.toString());

        // wordLen(["a", "bb", "a", "bb"]) -> {"a": 1, "bb": 2}
        // wordLen(["this", "and", "that", "and"]) -> {"that": 4, "this": 4, "and": 3}
        // wordLen(["code", "code", "code", "bug"]) -> {"bug": 3, "code": 4}
        System.out.printf("\n\n");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList("a", "bb", "a", "bb"));
        System.out.printf("Katas.wordLen(%s) -> ", wordList.toString());
        newHash = Katas.wordLen(wordList);
        System.out.printf("%s\n", newHash.toString());
        wordList.clear();
        wordList.addAll(Arrays.asList("this", "and", "that", "and"));
        System.out.printf("Katas.wordLen(%s) -> ", wordList.toString());
        newHash = Katas.wordLen(wordList);
        System.out.printf("%s\n", newHash.toString());
        wordList.clear();
        wordList.addAll(Arrays.asList("code", "code", "code", "bug"));
        System.out.printf("Katas.wordLen(%s) -> ", wordList.toString());
        newHash = Katas.wordLen(wordList);
        System.out.printf("%s\n", newHash.toString());
        wordList.clear();
        wordList.addAll(Arrays.asList("this", "and", "that", "sand castle", "pork"));
        System.out.printf("Katas.wordLen(%s) -> ", wordList.toString());
        newHash = Katas.wordLen(wordList);
        System.out.printf("%s\n", newHash.toString());
        wordList.clear();
        wordList.addAll(Arrays.asList("science", "mathematics", "engineering", "english"));
        System.out.printf("Katas.wordLen(%s) -> ", wordList.toString());
        newHash = Katas.wordLen(wordList);
        System.out.printf("%s\n", newHash.toString());
        wordList.clear();
        System.out.printf("Katas.wordLen(%s) -> ", wordList.toString());
        newHash = Katas.wordLen(wordList);
        System.out.printf("%s\n", newHash.toString());

        // indexWords(["aardvark", "apple", "zamboni", "phone"]) -> {"a": ["aardvark", "apple"], "p": ["phone"], "z": ["zamboni"]}
        // indexWords(["elephant"]) -> {"e": ["elephant"]}
        // indexWords([]) -> {}
        // indexWords([""]) -> {}
        System.out.printf("\n\n");
        wordList.clear();
        wordList.addAll(Arrays.asList("aardvark", "apple", "zamboni", "phone"));
        System.out.printf("Katas.indexWords(%s) -> ", wordList.toString());
        HashMap<String, ArrayList<String>> indexHash;
        indexHash = Katas.indexWords(wordList);
        System.out.printf("%s\n", indexHash.toString());
        wordList.clear();
        wordList.add("elephant");
        System.out.printf("Katas.indexWords(%s) -> ", wordList.toString());
        indexHash = Katas.indexWords(wordList);
        System.out.printf("%s\n", indexHash.toString());
        wordList.clear();
        System.out.printf("Katas.indexWords(%s) -> ", wordList.toString());
        indexHash = Katas.indexWords(wordList);
        System.out.printf("%s\n", indexHash.toString());
        wordList.clear();
        wordList.add("");
        System.out.printf("Katas.indexWords(%s) -> ", wordList.toString());
        indexHash = Katas.indexWords(wordList);
        System.out.printf("%s\n", indexHash.toString());
        wordList.clear();
        wordList.addAll(Arrays.asList("presystematic", "pleione", "senatorship", "parietes", "bimane",
                "chivvying", "halafian", "carat", "unallegorical", "clubman", "bisulphite", "preinvestigating",
                "marie", "theritas", "counterchanging"));
        System.out.printf("Katas.indexWords(%s) -> \n", wordList.toString());
        indexHash = Katas.indexWords(wordList);
        System.out.printf("%s\n", indexHash.toString());
        wordList.clear();
        wordList.addAll(Arrays.asList("superphysiposed", "kursk", "zophori", "replating", "meteoritic",
                "finished", "talaria", "befogging", "cyclonal", "overpuissant", "unthematic",
                "realpolitik", "direct", "reincline", "preoblige", "nontanning", "cheeseboard",
                "slouchily", "useable", "pierre"));
        System.out.printf("Katas.indexWords(%s) -> \n", wordList.toString());
        indexHash = Katas.indexWords(wordList);
        System.out.printf("%s\n", indexHash.toString());
        wordList.clear();
        wordList.addAll(Arrays.asList("Tiger", "Emu", "goat", "chicken", "penguin", "dog", "cat", "parakeet",
                "mouse", "moose", "angel fish", "trout", "donkey", "horse", "mule", "stork", "crane", "coy",
                "panda", "rat", "raccoon", "ferret", "wolf", "fox", "mongoose", "merekat", "bandicoot"));
        System.out.printf("Katas.indexWords(%s) -> \n", wordList.toString());
        indexHash = Katas.indexWords(wordList);
        System.out.printf("%s\n", indexHash.toString());
    }
}
