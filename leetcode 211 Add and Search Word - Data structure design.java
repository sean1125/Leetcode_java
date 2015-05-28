// leetcode 211 Add and Search Word - Data structure design.java

public class WordDictionary {

    public class Node {

        boolean last = false;
        Node[] children = new Node[26];
    }

    Node root;

    WordDictionary() {
        root = new Node();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {

        Node run = root;
        int i, size = word.length();

        for (i = 0; i < size && run.children[word.charAt(i) - 'a'] != null; i++) {
            run = run.children[word.charAt(i) - 'a'];
        }

        for (; i < size; i++) {
            run.children[word.charAt(i) - 'a'] = new Node();
            run = run.children[word.charAt(i) - 'a'];
        }

        run.last = true;
    }

    public boolean search(String word, Node run, int index) {
        if (index == word.length()) return run.last == true ? true : false;

        Node next;

        if (word.charAt(index) != '.') {
            next = run.children[word.charAt(index) - 'a'];
            return next == null ? false : search(word, next, index + 1);
        }

        int i;
        for (i = 0; i < 26; i++) {
            next = run.children[i];
            if (next != null && search(word, next, index + 1) == true)
                return true;
        }

        return false;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return search (word, root, 0);
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
