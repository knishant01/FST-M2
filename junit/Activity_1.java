import org.junit.jupiter.api.*;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Activity_1 {

    static ArrayList<String> list=null;

    @BeforeAll
    public static void setUp(){
        list = new ArrayList<String>();
        // Add values to the list
        list.add("one"); 
        list.add("two");
    }

    @Test
    @Order(1)
    public void insertTest(){
        assertEquals(2,list.size()); 
        list.add("three");
        assertEquals(3,list.size(),"Wrong size."); 
        assertEquals("one",list.get(0),"Wrong element.");
        assertEquals("two",list.get(1),"Wrong element.");
        assertEquals("three",list.get(2),"Wrong element.");

    }
    @Test
    @Order(2)
    public void replaceTest(){
        assertEquals(3,list.size());    // assert list size
        list.add("four");
        assertEquals(4,list.size(),"Wrong size.");    // assert list size after adding new element
        list.set(1,"five");
        System.out.println(list);
        assertEquals("one",list.get(0),"Wrong element.");
        assertEquals("five",list.get(1),"Wrong element.");
        assertEquals("three",list.get(2),"Wrong element.");
        assertEquals("four",list.get(3),"Wrong element.");

    }
}