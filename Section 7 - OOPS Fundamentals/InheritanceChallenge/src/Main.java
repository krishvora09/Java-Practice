public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985",
                "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("_ _ _ _ _ _");

        Employee joe = new Employee("Joe", "19/07/1990",
                "15/04/2021");
        System.out.println(joe);
        System.out.println("_ _ _ _ _ _");

        SalariedEmployee sarah = new SalariedEmployee("Sarah", "01/04/1998", "01/08/2022",
                20000.00, false);

        sarah.retire();
    }
}
