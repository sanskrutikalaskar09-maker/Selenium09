package assessment_21;

	class Employee {
	    String name;
	    double baseSalary;

	    Employee(String name, double baseSalary) {
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }

	    double calculateSalary() {
	        return baseSalary;
	    }

	    void showDetails() {
	        System.out.println(name + " : " + calculateSalary());
	    }
	}

	class Manager extends Employee {
	    Manager(String name, double baseSalary) {
	        super(name, baseSalary);
	    }

	    @Override
	    double calculateSalary() {
	        return baseSalary + 20000; 
	    }
	}


	class Developer extends Employee {
	    Developer(String name, double baseSalary) {
	        super(name, baseSalary);
	    }

	    @Override
	    double calculateSalary() {
	        return baseSalary + 10000; 
	    }
	}

	class Intern extends Employee {
	    Intern(String name, double baseSalary) {
	        super(name, baseSalary);
	    }

	    @Override
	    double calculateSalary() {
	        return baseSalary; 
	    }
	}

	public class salary1  {
	    public static void main(String[] args) {
	        Employee s1 = new Manager("sanskruti", 90000);
	        Employee s2 = new Developer("siya", 70000);
	        Employee s3 = new Intern("sam", 20000);

	        s1.showDetails();
	        s2.showDetails();
	        s3.showDetails();
	    }
	}
