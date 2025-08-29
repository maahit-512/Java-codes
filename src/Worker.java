class worker extends Employees {
    int no_hrs;
    double wages_per_hrs;
    worker(int a, double b, String c, String d, String e, int no_hrs) {
        super(a, b, c, d, e);
        this.no_hrs = no_hrs;
        this.wages_per_hrs= wages_per_hrs;
    }
    double compute_salary() {
        return no_hrs+wages_per_hrs;
    }
}