package other.generics;

import java.util.*;

/**
 * Created by jubair.
 * Date: 11/9/22
 * Time: 10:57 PM
 */

public class GenericMethod {
    public <T> void sayHello(T name){
        System.out.println(name);
    }

    public <T> void sayHiHello(T name, T another){
        System.out.println(name + " " + another);
    }

    public <T> T genReturn(T name, T another){
        System.out.println(name + " " + another);
        T update = (T) (name + " " + another);
        return update;
    }

    public void hudai(){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"vijay");
        map.put(4,"umesh");
        map.put(2,"ankit");

//Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer,String>> set=map.entrySet();

        Iterator<Map.Entry<Integer,String>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry e=itr.next();//no need to typecast
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

//    public <T extends Animal> T callFriend(String name, Class<T> type) {
//        return type.cast(friends.get(name));
//    }

    static <E> void staticHello(E str){
        System.out.println(str);
    }

    void withoutType(){
        ArrayList al = new ArrayList();

        al.add("Sachin");
        al.add("Rahul");
        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String) al.get(2);
    }

    public static void main(String[] args) {
        GenericMethod.staticHello("Static access HI!!");
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.sayHello(5);
//        genericMethod.withoutType();
        genericMethod.sayHiHello("Sumon", "Rizvi");
        String s = genericMethod.genReturn("Sumon", "Rizvi");
        System.out.println(s);

        genericMethod.hudai();
    }
}
