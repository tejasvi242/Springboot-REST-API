package net.com.springboot.entity;

    import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity 
	@Table(name = "Emp_Table")
	public class Employee {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "emp_id")
		private int empid;
		
		@Column(name = "Salary")
		private int salary;

		@Column(name = "Designation")
		private String designation;
		
		public int getEmpid() {
			return empid;

		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		
    
		public Employee() {
			super();
		}
		public Employee( int salary, String designation) {
			super();
			this.salary = salary;
			this.designation = designation;
		}
		
		
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
			}
		
}

