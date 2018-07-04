package com.example.android.javajokelibrary;

public class JavaJokeLibrary {

        public String jokeOne;
        public String jokeTwo;
        public String jokeThree;
        public String jokeFour;


        public JavaJokeLibrary() {
            jokeOne = "99 little bugs in the app, 99 little bugs, you take one down, patch it away, 999,999 little bugs in the app";
            jokeTwo = "What do you call a fish with two knees?\n" + "A tunee fish!";
            jokeThree = "What was the foots favourite type of chips?\n" + "Dori-toes!";
            jokeFour = "What kind of pictures do turtles take?\n" + "Shellfies!";
        }

        public String getRandomJoke (){
            int randNumber = (int) (Math.random()*3) ;
            String randJoke = null;
            if (randNumber==0) {
                randJoke = jokeOne;
            }
            else if (randNumber==1){
                randJoke = jokeTwo;
            }
            else if (randNumber==2) {
                randJoke = jokeThree;
            }
            else if (randNumber==3){
                randJoke = jokeFour;
            }
            return randJoke;
        }
    }
