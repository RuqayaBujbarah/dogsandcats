package com.example.catsdogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat cats[] = new cat[5];
        cats[0]=new cat("Lili",2);
        cats[1]=new cat("Meep",5);
        cats[2]=new cat("Patchy",3);
        cats[3]=new cat("Furball",7);
        cats[4]=new cat("Snowball",6);
        dog dogs[] = new dog[5];
        dogs[0]=new dog("Rufus",3);
        dogs[1]=new dog("Fred",3);
        dogs[2]=new dog("Spot",7);
        dogs[3]=new dog("Rex",6);
        dogs[4]=new dog("Milo",8);

        for(int i =0;i<5;i++){
            cats[i].print();
            for(int j = 0;j<5;j++){
                if(dogs[j].age>cats[i].age){
                    dogs[j].print();
                }
            }
        }
        }

}

class cat{
    String name;
    int age;
    cat(String name, int age){
     this.name = name;
     this.age = age;
    }
    void print(){
        System.out.println(name+": Meow");
    }
}

class dog {
    String name;
    int age;

    dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println(name + ": Woof");
    }
}