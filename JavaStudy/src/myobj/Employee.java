package myobj;

import java.util.Date;

public class Employee {
	   // DB로 부터 null이 나올 수도 있으므로 기본타입보다는 wrapper 클래스를 사용하는게 좋음
	   Integer employee_id;
	   String first_name;
	   String last_name;
	   String email;
	   String phone_number;
	   Date hire_date;

	   public Employee(Integer employee_id, String first_name, String last_name, String email, String phone_number) {
	      this.employee_id = employee_id;
	      this.first_name = first_name;
	      this.last_name = last_name;
	      this.email = email;
	      this.phone_number = phone_number;

	   }
	   
	   @Override
	   public String toString() {
	      return String.format("%s %s", first_name, last_name);
	   }

	}