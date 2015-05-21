// leetcode 208 Implement Trie (Prefix Tree)

class TrieNode {
    // Initialize your data structure here.
    public char label;
    public boolean leaf = false;
    public TrieNode[] children = new TrieNode[26];

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
            if (node.children[word.charAt(i) - 'a'] == null) break;
            else node = node.children[word.charAt(i) - 'a'];
        }

        return i;
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        node = root;
        int i, size = word.length();

        for (i = find(word); i < size; i++) {
            node.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
            node = node.children[word.charAt(i) - 'a'];
        }

        node.leaf = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        node = root;

        if (find(word) == word.length() && node.leaf == true) return true;
        else return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        node = root;

        if (find(prefix) == prefix.length()) return true;
        else return false;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
