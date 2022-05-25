package com.LeetCode.Solutions.findAllConcatenatedWords;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Trie root = new Trie();
        ArrayList<String> result = new ArrayList<String>();
        boolean[] concatWords = new boolean[words.length];
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if( words[i].length() > 0 )
                buildTrie( words[i],root);
        }

        for(int i = 0 ; i < words.length ; i++)
        {
            concatWords[i] = search(i,words,root);
            if(concatWords[i])
                res.add(words[i]);
        }
        return res;
    }

    class Trie{
        Trie[] children = new Trie[26];
        boolean isEndOfWord = false;
    }

    public void buildTrie(String word,Trie root){
        Trie current = root;
        for(char c : word.toCharArray()){
            if(current.children[c-'a']==null)
                current.children[c-'a'] = new Trie();
            current = current.children[c-'a'];
        }
        current.isEndOfWord = true;
    }

    public boolean search(int wordIndex,String[] words,Trie root){
        boolean[] isSubSet = new boolean[words.length];
        String word = words[wordIndex];

        for(int i = 0 ; i < words.length ; i++){
            String wordToCompare = words[i];
            int k = 0;
            Trie current = root;
            if(i!=wordIndex){
                for(int j = i+1 ; j < wordToCompare.length() ; j++) {
                    if(word.length()<wordToCompare.length())break;
                    int index = word.charAt(k) - 'a';
                    if (current.children[index] == null)
                    {
                        isSubSet[i] = false;
                        break;
                    }
                    else{
                        if(current.isEndOfWord){
                            return true;
                        }
                        else{
                            current = current.children[index];
                            k++;
                        }
                    }
                }
            }
        }
        return false;
    }
}

class tester{
    public static void main(String[] args){
        solution s = new solution();
        String[] sarr = new String[]{"cats","dogs","catsdogs"};
        s.findAllConcatenatedWordsInADict(sarr);
    }
}
