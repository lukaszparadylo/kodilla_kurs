package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> parityElements=new ArrayList<Integer>();
        for(Integer i : numbers){
                if(i%2==0){
                    parityElements.add(i);
                }
            }
        return parityElements;
    }
}
