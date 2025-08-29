class supervisor extends Employees {
    double allowance;
    double HRA;
    double TA;
    supervisor(int a, double b, String c, String d, String e, double bonus) {
        super(a, b, c, d, e);
        this.allowance = allowance;
        this.HRA=allowance/4;
        this.TA=allowance/10;
    }
    double compute_salary() {
        return allowance+HRA+TA;
    }
}