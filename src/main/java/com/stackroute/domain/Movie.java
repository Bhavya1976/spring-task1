package com.stackroute.domain;

public class Movie {



        //actor class instantiation
        private Actor actor;
        public Movie(){
        }

        public Movie(Actor actor) {
            this.actor = actor;
        }

        public void setActor(Actor actor) {
            this.actor = actor;
        }

        //display actor details using movie method
        public void movieDisplay(){
          //  System.out.println("display using movie class");
            actor.display();
        }


    }
