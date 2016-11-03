/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author cschultz57
 */
public class StartUp {

    public static void main(String[] args) {
        Movie m1 = new Movie("Transformers", "Michael Bay", 10.514);
        Movie m2 = new Movie("Titanic", "James Cameron", 10.517);
        Movie m3 = new Movie("The Birds", "Alfred Hitchcock", 5.148);
        Movie m4 = new Movie("Titanic", "James Cameron", 10.517);

        Map<String, Movie> map = new HashMap<>();
        map.put("10.514", m1);
        map.put("10.517", m2);
        map.put("5.148", m3);
        map.put("10.517", m4);

        System.out.println("Movie Found by key 10.514--------------------------------------------");
        Movie m = map.get("10.514");
        System.out.println("Found Movie: " + m);

        System.out.println("Movies Looped through keys: -------------------------------------------------------");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Movie found = map.get(key);
            System.out.println(found.toString());

        }
        System.out.println("Movies Looped through values: ----------------------------------------------------------");
        Collection<Movie> values = map.values();
        List<Movie> sortedList = new ArrayList<>(values);
        Collections.sort(sortedList);
        for (Movie mov : sortedList) {
            System.out.println(mov);
        }

        Map<String, Movie> map2 = new TreeMap<>();
        map2.put("10.514", m1);
        map2.put("10.517", m2);
        map2.put("5.148", m3);
        map2.put("10.517", m4);

        Set<String> keys2 = map2.keySet();

        Collection<Movie> values2 = map2.values();

        List<Movie> sortedList2 = new ArrayList<>(values2);
        System.out.println("Movies Sorted by tree map values in a collection: -----------------------------------------------------");
        Collections.sort(sortedList2);
        for (Movie mov : sortedList2) {
            System.out.println(mov);
        }
        List<Movie> sortedList3 = new ArrayList<>(values2);

        System.out.println("Movies Sorted by tree map values in a collection using the moviebydirector thing -----------------------------------------------------");
        Collections.sort(sortedList3, new MovieByDirector());
        for (Movie mov : sortedList3) {
            System.out.println(mov);
        }

        Set<Movie> treeSet = new TreeSet<>();
        treeSet.add(m1);
        treeSet.add(m2);
        treeSet.add(m3);
        treeSet.add(m4);
        System.out.println("SORTED VIA TREESET-------------------------------------------");
        for(Movie mov :treeSet){
            System.out.println(mov);
        }
    }
}
