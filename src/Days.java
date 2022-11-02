public enum Days {
    MONDAY("Duishombu"),
    TUESDAY("Beishembi"),
    WEDNESDAY("Sharshembi"),
    THURSDAY("Beishenbi"),
    FRIDAY("Juma"),
    SATURDAY("Ishembi"),
    SUNDAY("Jekshembi");

    String name;

    Days(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Days{" +
                "name='" + name + '\'' +
                '}';
    }
}
