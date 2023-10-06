class Date {
    private int dd;
    private int mm;
    private int yy;

    private int month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private String day[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;

        if (yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0)
            month[2] = 29;
    }

    public int NoOfDate() {
        int y = yy - 1;
        int date = y * 365 + y / 4 - y / 100 + y / 400;
        for (int i = 1; i < mm; i++) {
            date = date + month[i];
        }
        date = date + dd;
        return date;
    }

    public String toString() {
        return dd + "/" + mm + "/" + yy;
    }

    public String GetDay() {
        int x = NoOfDate();
        return day[x % 7];

    }

}