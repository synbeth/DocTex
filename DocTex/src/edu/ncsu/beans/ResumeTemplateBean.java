package edu.ncsu.beans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ResumeTemplateBean {
	
	private String template = "/WEB-INF/auth/latex_templates/resumes/cv_2.txt";
	private String firstname;
	private String lastname;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String objective;
	private String degree;
	private String major;
	private String school;
	private String graduation;
	private String skillTypeOne;
	private String skillsOne;
	private String skillTypeTwo;
	private String skillsTwo;
	private String jobTitleOne;
	private String jobOneInstitution;
	private String jobOneDate;
	private String jobOneDescr;
	private String jobTitleTwo;
	private String jobTwoInstitution;
	private String jobTwoDate;
	private String jobTwoDescr;
	private String jobTitleThree;
	private String jobThreeInstitution;
	private String jobThreeDate;
	private String jobThreeDescr;
	private String customTitle;
	private String customFieldOne;
	private String customFieldTwo;
	private String customFieldThree;
	
	public String getTemplate() {
		return template;
	}
	
	public void setTemplate(String template) {
		this.template = template;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getSkillTypeOne() {
		return skillTypeOne;
	}

	public void setSkillTypeOne(String skillTypeOne) {
		this.skillTypeOne = skillTypeOne;
	}

	public String getSkillsOne() {
		return skillsOne;
	}

	public void setSkillsOne(String skillsOne) {
		this.skillsOne = skillsOne;
	}

	public String getSkillTypeTwo() {
		return skillTypeTwo;
	}

	public void setSkillTypeTwo(String skillTypeTwo) {
		this.skillTypeTwo = skillTypeTwo;
	}

	public String getSkillsTwo() {
		return skillsTwo;
	}

	public void setSkillsTwo(String skillsTwo) {
		this.skillsTwo = skillsTwo;
	}

	public String getJobTitleOne() {
		return jobTitleOne;
	}

	public void setJobTitleOne(String jobTitleOne) {
		this.jobTitleOne = jobTitleOne;
	}

	public String getJobOneDate() {
		return jobOneDate;
	}

	public void setJobOneDate(String jobOneDate) {
		this.jobOneDate = jobOneDate;
	}

	public String getJobOneDescr() {
		return jobOneDescr;
	}

	public void setJobOneDescr(String jobOneDescr) {
		this.jobOneDescr = jobOneDescr;
	}

	public String getJobTitleTwo() {
		return jobTitleTwo;
	}

	public void setJobTitleTwo(String jobTitleTwo) {
		this.jobTitleTwo = jobTitleTwo;
	}

	public String getJobTwoDate() {
		return jobTwoDate;
	}

	public void setJobTwoDate(String jobTwoDate) {
		this.jobTwoDate = jobTwoDate;
	}

	public String getJobTwoDescr() {
		return jobTwoDescr;
	}

	public void setJobTwoDescr(String jobTwoDescr) {
		this.jobTwoDescr = jobTwoDescr;
	}

	public String getJobTitleThree() {
		return jobTitleThree;
	}

	public void setJobTitleThree(String jobTitleThree) {
		this.jobTitleThree = jobTitleThree;
	}

	public String getJobThreeDate() {
		return jobThreeDate;
	}

	public void setJobThreeDate(String jobThreeDate) {
		this.jobThreeDate = jobThreeDate;
	}

	public String getJobThreeDescr() {
		return jobThreeDescr;
	}

	public void setJobThreeDescr(String jobThreeDescr) {
		this.jobThreeDescr = jobThreeDescr;
	}

	public String getCustomTitle() {
		return customTitle;
	}

	public void setCustomTitle(String customTitle) {
		this.customTitle = customTitle;
	}

	public String getCustomFieldOne() {
		return customFieldOne;
	}

	public void setCustomFieldOne(String customFieldOne) {
		this.customFieldOne = customFieldOne;
	}

	public String getCustomFieldTwo() {
		return customFieldTwo;
	}

	public void setCustomFieldTwo(String customFieldTwo) {
		this.customFieldTwo = customFieldTwo;
	}

	public String getCustomFieldThree() {
		return customFieldThree;
	}

	public void setCustomFieldThree(String customFieldThree) {
		this.customFieldThree = customFieldThree;
	}

	public String getJobOneInstitution() {
		return jobOneInstitution;
	}

	public void setJobOneInstitution(String jobOneInstitution) {
		this.jobOneInstitution = jobOneInstitution;
	}

	public String getJobTwoInstitution() {
		return jobTwoInstitution;
	}

	public void setJobTwoInstitution(String jobTwoInstitution) {
		this.jobTwoInstitution = jobTwoInstitution;
	}

	public String getJobThreeInstitution() {
		return jobThreeInstitution;
	}

	public void setJobThreeInstitution(String jobThreeInstitution) {
		this.jobThreeInstitution = jobThreeInstitution;
	}
	
	
	public String generate() {
		String templateFile;
		
		try {
			templateFile = new String(Files.readAllBytes(Paths.get(template)));
		} catch (IOException e) {
			
			e.printStackTrace();
			return "failure";
		}
		
		templateFile = templateFile.replaceAll("FIRST_NAME", this.firstname);
		templateFile = templateFile.replaceAll("LAST_NAME", this.lastname);
		templateFile = templateFile.replaceAll("STREET_FIELD", this.street);
		templateFile = templateFile.replaceAll("CITY_FIELD", this.city);
		templateFile = templateFile.replaceAll("STATE_FIELD", this.state);
		templateFile = templateFile.replaceAll("ZIP_FIELD", this.zip);
		templateFile = templateFile.replaceAll("PHONE_FIELD", this.phone);
		templateFile = templateFile.replaceAll("OBJ_DESCR_FIELD", this.objective);
		templateFile = templateFile.replaceAll("DEGREE_FIELD", this.degree);
		templateFile = templateFile.replaceAll("MAJOR_FIELD", this.major);
		templateFile = templateFile.replaceAll("SCHOOL_FIELD", this.school);
		templateFile = templateFile.replaceAll("GRADUATION_FIELD", this.graduation);
		templateFile = templateFile.replaceAll("SKILL_TYPE_1_FIELD", this.skillTypeOne);
		templateFile = templateFile.replaceAll("SKILLS_1_FIELD", this.skillsOne);
		templateFile = templateFile.replaceAll("SKILL_TYPE_2_FIELD", this.skillTypeTwo);
		templateFile = templateFile.replaceAll("SKILLS_2_FIELD", this.skillTypeTwo);
		templateFile = templateFile.replaceAll("JOB_TITLE_1", this.jobTitleOne);
		templateFile = templateFile.replaceAll("JOB_1_DATE", this.jobOneDate);
		templateFile = templateFile.replaceAll("JOB_1_INSTITUTION", this.jobOneInstitution);
		templateFile = templateFile.replaceAll("JOB_1_DESCR", this.jobOneDescr);
		templateFile = templateFile.replaceAll("JOB_TITLE_2", this.jobTitleTwo);
		templateFile = templateFile.replaceAll("JOB_2_DATE", this.jobTwoDate);
		templateFile = templateFile.replaceAll("JOB_2_INSTITUTION", this.jobTwoInstitution);
		templateFile = templateFile.replaceAll("JOB_2_DESCR", this.jobTwoDescr);
		templateFile = templateFile.replaceAll("JOB_TITLE_3", this.jobTitleThree);
		templateFile = templateFile.replaceAll("JOB_3_DATE", this.jobThreeDate);
		templateFile = templateFile.replaceAll("JOB_3_INSTITUTION", this.jobThreeInstitution);
		templateFile = templateFile.replaceAll("JOB_3_DESCR", this.jobThreeDescr);
		templateFile = templateFile.replaceAll("CS_TITLE_FIELD", this.customTitle);
		templateFile = templateFile.replaceAll("CUSTOM_FIELD_1", this.customFieldOne);
		templateFile = templateFile.replaceAll("CUSTOM_FIELD_2", this.customFieldTwo);
		templateFile = templateFile.replaceAll("CUSTOM_FIELD_3", this.customFieldThree);
		
		
		// Create temporary .tex file
		File file = new File("temp.tex");
		
		try (FileOutputStream fop = new FileOutputStream(file)) {
			
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			// get the content in bytes
			byte[] contentInBytes = templateFile.getBytes();
 
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
 
		} catch (IOException e) {
			e.printStackTrace();
			
			return "failure";
		}
		
		return "success";
	}
}
