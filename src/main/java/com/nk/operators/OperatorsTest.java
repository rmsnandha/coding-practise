package com.nk.operators;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperatorsTest {

	public static void main(String[] args) {

		String names = "jhon doe,  peter ben park, marry jane  wast-park, jhon doe";

		String[] splitByEmployee = names.split(",");

		Stream<String> indivitualEmployee = Arrays.stream(splitByEmployee).map(e -> e.trim());

		Stream<Employee> employeeStream = indivitualEmployee.map(i -> {
			String[] indivitualEmpNames = i.split(" ");
			return buyildEmployee(indivitualEmpNames);

		});
		
		
		
		
		Map<String, List<Employee>> groupedByNmaes = employeeStream.collect(Collectors.groupingBy(Employee::getFirstLast));
		
		Stream<Employee> indivitualEmpWithEmailAddress = groupedByNmaes.entrySet().stream().map(emp->
		
					{  
						int i = 2;
						List<Employee> value = emp.getValue();
						return  new  Employee("" , "" ,  "" , "" );
							
					}
		
				);
		
		//Strign finalResult;
		
		//indivitualEmpWithEmailAddress.forEach(action);

	}

	private static Employee buyildEmployee(String[] indivitualEmpNames) {
		String first;
		String middle = null;;
		String last;
		if (indivitualEmpNames.length == 2) {
			first = indivitualEmpNames[0];
			last = indivitualEmpNames[1];
		} else {
			first = indivitualEmpNames[0];
			middle = indivitualEmpNames[1];
			last = indivitualEmpNames[2];
		}

		return new Employee(first, middle, last,  null);
	}


	static class Employee {

		public String getFirst() {
			return first;
		}

		public void setFirst(String first) {
			this.first = first;
		}

		public String getMiddle() {
			return middle;
		}

		public void setMiddle(String middle) {
			this.middle = middle;
		}

		public String getLast() {
			return last;
		}

		public void setLast(String last) {
			this.last = last;
		}
		
		public  String  getFirstLast() {
			return  this.getFirst()+this.getLast();
		}

		@Override
		public String toString() {
			return "Employee [first=" + first + ", middle=" + middle + ", last=" + last + "]";
		}

		String middle;
		String last;
		String first;
		String email;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Employee(String first, String middle, String last , String email) {
			this.first = first;
			this.middle = middle;
			this.last = last;
			this.email =  email;

		}
		
		public String foramatedValue() {
			StringBuilder sb = new StringBuilder();

			sb.append(getFirst()).append(" ").append(getMiddle()).append(getLast()).append("<").append(getEmail())
					.append(">");

			return sb.toString();
		}
	}

	
}
