// leetcode 208 Implement Trie (Prefix Tree)

class TrieNode {
    // Initialize your data structure here.
    public char label;
    public boolean leaf = false;
    public Map<Character, TrieNode> children = new HashMap<Character, TrieNode> ();

    public TrieNode() {}
    public TrieNode(char label) {
        this.label = label;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    TrieNode node;

    public int find (String word) {
        int i, size = word.length();

        for (i = 0; i < size; i++) {
            if (node.children.containsKey(word.charAt(i)) == true) node = node.children.get(word.charAt(i));
            else break;
        }

        return i;
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if (word == null) return;

        node = root;
        int i, size = word.length();

        for (i = find(word); i < size; i++) {
            node.children.put(word.charAt(i), new TrieNode(word.charAt(i)));
            node = node.children.get(word.charAt(i));
        }

        node.leaf = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if (word == null) return false;

        node = root;

        if (find(word) == word.length() && node.leaf == true) return true;
        else return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if (prefix == null) return false;

        node = root;

        if (find(prefix) == prefix.length()) return true;
        else return false;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
