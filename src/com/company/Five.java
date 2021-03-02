package com.company;
import java.util.*;
public class Five {
    public static <K extends Comparable<K>, V> Map.Entry<K, V>
    getmap(Map<K, V> map)
    {
        Map.Entry<K, V> entry = null;
        for (Map.Entry<K, V> cEntry : map.entrySet()) {
            if (entry == null || cEntry.getKey().compareTo(entry.getKey()) > 0)
            {
                entry = cEntry;
            }
        }
        return entry;
    }
    public static void print(Map<String, Integer> map)
    {
        if (map.isEmpty()) {
            System.out.println("[]");
        }
        else {
            System.out.println(map);
        }
    }
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            System.out.println(hmap.put(a, b));
        }
        System.out.println("Entry with highest key: "+ getmap(hmap));
    }
}
