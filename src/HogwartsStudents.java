public class HogwartsStudents {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int trangressive;

    public HogwartsStudents(String name, String surname, int powerOfMagic, int trangressive) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.trangressive = trangressive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTrangressive() {
        return trangressive;
    }

    public void setTrangressive(int trangressive) {
        this.trangressive = trangressive;
    }
}
