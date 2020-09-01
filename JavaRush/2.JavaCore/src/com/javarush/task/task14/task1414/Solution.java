package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> movies = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (!s.matches("soapOpera|cartoon|thriller")) {
                movies.add(s);
                break;
            }
            movies.add(s);

        }

        Movie movie = null;
        for (String string : movies) {
            movie = MovieFactory.getMovie(string);
            if(movie!=null) {
                System.out.println(movie.getClass().getSimpleName());
            }
        }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {movie = new Cartoon();}
            else if ("thriller".equals(key)) {movie = new Thriller();}
//            else movie = new Thriller();
            return movie;
        }
    }

    static abstract class Movie {

    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
