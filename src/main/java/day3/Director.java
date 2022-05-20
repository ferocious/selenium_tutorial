package day3;

public class Director {
    private String directorName;
    private String directorLastName;

    public Director(String directorName, String directorLastName) {
        this.directorName = directorName;
        this.directorLastName = directorLastName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorLastName() {
        return directorLastName;
    }

    public void setDirectorLastName(String directorLastName) {
        this.directorLastName = directorLastName;
    }

    @Override
    public String toString() {
        return "Director{" +
                "directorName='" + directorName + '\'' +
                ", directorLastName='" + directorLastName + '\'' +
                '}';
    }
}
