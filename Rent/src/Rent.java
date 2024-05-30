public class Rent {
    private String name;
    private String email;
    private int numRoom;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
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

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
