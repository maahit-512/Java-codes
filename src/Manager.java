class manager extends Employees {
    double basic_pay;
    double HRA;
    double TA;
    manager(int a, double b, String c, String d, String e, double bonus) {
        super(a, b, c, d, e);
        this.basic_pay = basic_pay;
        this.HRA= basic_pay/4;
        this.TA= basic_pay/10;
    }
    double compute_salary() {
        return basic_pay+HRA+TA;
    }
}
