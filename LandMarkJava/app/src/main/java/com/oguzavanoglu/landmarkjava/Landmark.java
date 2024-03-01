package com.oguzavanoglu.landmarkjava;

import java.io.Serializable;

/* Serializable genel olarak bir objeyi byte'a çevirmek için kullanılır
   yani esasen 1-0 formatına çeviriyoruz böylece obje ne olursa olsun başka bir yere (aaktivite - fragment) yollamak istediğimizde yollayabiliyoruz.
 */
public class Landmark implements Serializable {

    String name;
    String country;
    int image;

    public Landmark(String name,String country,int image){
        this.name = name;
        this.country = country;
        this.image = image;

    }
}
