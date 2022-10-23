package ebebek_case;

public class Employee {
	
	public String name;
	public int salary;
	public int workHours;
	public int hireYear;
	
	Employee(String name,int salary,int workHours,int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public float tax() {
		if (salary > 1000) {
			return salary*3/100;
		}
		else {
			return 0;
		}
	};
	
	public int bonus() {
		if (workHours > 40) {
			return (workHours-40)*30;
		}
		else {
			return 0;
		}
	};
	
	public float raiseSalary() {
		int workYear = 2021 - hireYear;
		float employeeTax = tax();
		int employeeBonus = bonus();
		float newSalary = salary + employeeBonus - employeeTax;
		
		if (workYear < 10) {
			return newSalary * 5 / 100;
		}
		else if ( (9 < workYear) && (workYear < 20)) {
			return newSalary * 10 / 100;
		}
		else {
			return newSalary * 15 / 100;
		}
	};
	
	public String toString() {
		System.out.println("İsim: " + name);
		System.out.println("Maaş: " + salary);
		System.out.println("Çalışma saati: " + workHours);
		System.out.println("İşe giriş yılı: " + hireYear);
		System.out.println("Vergi: " + tax());
		System.out.println("Bonus: "+bonus());
		System.out.println("Maaş Zammı: " +raiseSalary());
		return "";

	}

}
