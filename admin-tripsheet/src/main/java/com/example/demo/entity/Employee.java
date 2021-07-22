package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Document(collection = "Employee")

public class Employee {
	
	@Id
	String employeeId;
	String employeeName;
	long PhoneNumber;
	int isAdmin;
	int isBlocked;
	LocalDateTime BlockedDate;
	 String Domain;
	 String DomainLead;
	 String ProjectName;
	 String projectLead;
	 String createdBy;
		LocalDate createdDate;
		String ModifiedBy;
		LocalDate ModifiedDate;
		int isDeleted;
	
	
	
//	List<Destination> dropPoint;
//	LocalTime reachedTime;
//	String status;
	
//	String createdBy;
//	LocalDate createdDate;
//	String modifiedBy;
//	LocalDate modifiedDate;
//	int isDeleted;
	
	

}
