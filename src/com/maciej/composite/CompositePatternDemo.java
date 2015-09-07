package com.maciej.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {

		Employee CEO = new Employee("Sammie Haden", "CEO", 25000);
		
		Employee managementSecretary = new Employee("Beth Scrivens", "Management", 5000);
		Employee legalOfficer = new Employee("Danny Purcell", "Management", 12000);
		
		Employee financialManager = new Employee("Jerome Derby", "Management", 10000);
		Employee logisticsManager = new Employee("Shyla Ford", "Management", 9000);
		Employee administrationManager = new Employee("Wayland Gardener", "Management", 10000);
		Employee explorationManager = new Employee("Phillip	Lee", "Management", 10000);
		
		Employee financialAccountant = new Employee("Adam Ross", "Finance", 6000);
		Employee logisticsCoordinator = new Employee("Tayler Prescott", "Logistics", 7000);
		Employee hrOfficer = new Employee("Stacie Kendall", "HR" , 7000);
		Employee seniorGeologist = new Employee("Dennis	Thompson", "Exploration", 7000);
		
		CEO.add(managementSecretary);
		CEO.add(legalOfficer);
		CEO.add(financialManager);
		CEO.add(logisticsManager);
		CEO.add(administrationManager);
		CEO.add(explorationManager);

		financialManager.add(financialAccountant);
		logisticsManager.add(logisticsCoordinator);
		administrationManager.add(hrOfficer);
		explorationManager.add(seniorGeologist);
		
		System.out.println(CEO);
		
		for (Employee employee : CEO.getSubordinates()) {
			
			System.out.println(employee);
			
			for (Employee subEmployee : employee.getSubordinates())
				System.out.println(subEmployee);
		}
		 
	}

}
