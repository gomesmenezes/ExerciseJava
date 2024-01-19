package exercise.vect.exercise.rent.entities;

import java.util.ArrayList;
import java.util.List;

public class Rules {
    private String name;
    private String email;
    private int[] room;
    
    public Rules(String name, String email, int[] room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int[] getRoom() {
        return room;
    }

    public void setRoom(int[] room) {
        this.room = room;
    }

    public List<Integer> getOccupiedRooms() {
        List<Integer> occupiedRooms = new ArrayList<>();
        for (int i = 0; i < room.length; i++) {
            if (room[i] == 1) {
                // O quarto está ocupado
                occupiedRooms.add(i + 1); // Adiciona o número do quarto à lista
            }
        }
        return occupiedRooms;
    }

}
