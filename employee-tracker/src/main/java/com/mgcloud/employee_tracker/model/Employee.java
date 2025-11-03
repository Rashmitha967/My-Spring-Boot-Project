package com.mgcloud.employee_tracker.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "visa_id", referencedColumnName = "id")
    private VisaDetails visaDetails;

    @ManyToOne
    @JoinColumn(name = "worksite_location_id")
    private Location worksiteLocation;

    @ManyToOne
    @JoinColumn(name = "employee_location_id")
    private Location employeeLocation;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public VisaDetails getVisaDetails() { return visaDetails; }
    public void setVisaDetails(VisaDetails visaDetails) { this.visaDetails = visaDetails; }
    public Location getWorksiteLocation() { return worksiteLocation; }
    public void setWorksiteLocation(Location worksiteLocation) { this.worksiteLocation = worksiteLocation; }
    public Location getEmployeeLocation() { return employeeLocation; }
    public void setEmployeeLocation(Location employeeLocation) { this.employeeLocation = employeeLocation; }
}

