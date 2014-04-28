package edu.ncsu.beans;

public class ResumeTemplateBean {
	
	private String template = "/WEB-INF/auth/latex_templates/resumes/cv_2.tex";
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
	
	public String generate() {
		
		
		return "failure";
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
}
