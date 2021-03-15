package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("when create SimpleUser with empty array, " +
            "then exterminate should return null")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list1 = new ArrayList();
        List<Integer> list2;
        list2 = oddNumbersExterminator.exterminate(list1);

        Assertions.assertEquals(new ArrayList<>(),list2);
    }
    @DisplayName("when create SimpleUser with infill array by random values, " +
            "then exterminate should return true")
    @Test
    void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2;
        Random random = new Random();
        for(int i = 0; i<10; i++){
            list1.add(random.nextInt(1000));
        }

        list2 = oddNumbersExterminator.exterminate(list1);
        boolean res = false;
        for(Integer i : list2){
            if(i%2 != 0){
                res = false;
                break;
            }
            else {
                res = true;
            }
        }
        Assertions.assertEquals(true, res);
    }
}
