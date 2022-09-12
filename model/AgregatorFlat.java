package by.epam.task11.main.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import by.epam.task11.main.Flat;


public class AgregatorFlat implements Serializable{
    public AgregatorFlat(){

    }
    
    /**
     * @param flat
     * @param amount
     * @return
     */
    public List<Flat> searchRoom(List<Flat> flat,int amount){
        List<Flat> s = new ArrayList<>();
        for (Flat f : flat) {
            if (f.getRoom()==amount) {
                s.add(f);
            }
        }
        return s;
    }



    public List<Flat> serachRoomFlat(List<Flat> flat,int amount, int pos1, int pos2){
        List<Flat> s = new ArrayList<>();
        for (Flat f : flat) {
            if (f.getRoom()==amount && (f.getFloor()>pos1 && f.getFloor()<pos2)) {
                s.add(f);
            }
        }
        return s;
    }

    public List<Flat> serachSquare(List<Flat> flat,int square){
        List<Flat> s = new ArrayList<>();
        for (Flat f : flat) {
            if (f.getSquare()>=square) {
                s.add(f);
            }
        }
        return s;
    }

}
