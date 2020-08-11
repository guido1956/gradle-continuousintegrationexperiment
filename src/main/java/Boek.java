public class Boek {
    private String title;
    public Boek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("j");
    }
}
