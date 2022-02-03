public class Guest {

    private String name;
    private boolean checkedIn;

    public Guest(String name) {
        this.name = name;
        this.checkedIn = false;
    }

    public boolean isCheckedIn() {
        return this.checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public String getName() {
        return name;
    }
}
