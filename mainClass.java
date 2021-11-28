class Company {
    void hire() {
        System.out.println("hire");
    }
    void hireAll() {
        System.out.println("hireAll");
    }
    void fire() {
        System.out.println("fire");
    }
    void getIncome() {
        System.out.println("geIncome");
    }
}
public class mainClass {
    public static void main(String[] args) {
        Company myCompany = new Company();
        myCompany.hire();
        myCompany.hireAll();
        myCompany.fire();
        myCompany.getIncome();
    }
}
