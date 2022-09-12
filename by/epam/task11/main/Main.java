package by.epam.task11.main;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.epam.task11.main.model.AgregatorFlat;
import by.epam.task11.main.model.Present;





public class Main implements Serializable {
    private static List<Flat> searchRoom;


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);



        ArrayList<Flat> flat = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            new Flat().addToList(flat);
        }


        //a
        System.out.println("For search flats by room amount, enter amount:");
        int room1 = checkNum();
        searchRoom = new AgregatorFlat().searchRoom(flat,room1);
        Present.table();
        for (Flat _s : searchRoom) {
            System.out.println(_s.getNumber()+"\t\t"+_s.getRoom()+"\t"+_s.getFloor()+"\t"+_s.getStreet()+"\t"+_s.getSquare()+"\t"+_s.getFlatType());
        }
        

        
        //b
        System.out.println("For search by room amount and flat range, enter amount and flat gap from ... to ...:");
        System.out.print("Enter amount_ ");
        int room2 = checkNum();

        System.out.print("Enter start floor_ ");
        int pos1 = checkNum();

        System.out.print("Enter last floor_ ");
        int pos2 = checkNum();

        searchRoom = new AgregatorFlat().serachRoomFlat(flat,room2,pos1,pos2);
        Present.table();
        for (Flat _s : searchRoom) {
            System.out.println(_s.getNumber()+"\t\t"+_s.getRoom()+"\t"+_s.getFloor()+"\t"+_s.getStreet()+"\t"+_s.getSquare()+"\t"+_s.getFlatType());
        }



        //c
        System.out.println("For search of room square, enter start square: ");
        int square = checkNum();
        Present.table();
        searchRoom = new AgregatorFlat().serachSquare(flat,square);
        for (Flat _s : searchRoom) {
            System.out.println(_s.getNumber()+"\t\t"+_s.getRoom()+"\t"+_s.getFloor()+"\t"+_s.getStreet()+"\t"+_s.getSquare()+"\t"+_s.getFlatType());
        }

    }

    
    private static int checkNum(){
        Scanner sc = new Scanner(System.in);
        int num =0;
        while (!sc.hasNextInt()) {
            System.out.println("Введите число!");
            sc.nextLine();
        }   
        num = sc.nextInt();
        return num;
    }
}
