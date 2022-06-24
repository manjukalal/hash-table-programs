package com.bridgelabz;

import java.util.Hashtable;


public class HashTable {

        public static void main(String[] args)
        {
            String str = " to be or not to be";
            Hashtable<String, Integer>  hashtable = new Hashtable<>();

            String[] words = str.split(" ");

            for (String word : words) {

                // Asking whether the HashMap contains the
                // key or not. Will return null if not.
                Integer integer = hashtable.get(word);

                if (integer == null)

                    hashtable.put(word, 1);

                else {

                    hashtable.put(word, integer + 1);
                }
            }
            System.out.println(hashtable);
        }
    }

