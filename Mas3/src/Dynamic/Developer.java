package Dynamic;

import java.util.ArrayList;
import java.util.List;

public class Developer {

    private List<String> devSkills;
    private int salary;
    // Junior
    private Boolean firstJob;
    // Senior
    private Integer contractTimeInYears;

    private DeveloperExperience developerExperience;

    private Developer(List<String> devSkills, int salary) {
        this.devSkills = devSkills;
        this.salary = salary;
    }

    public static Developer makeDeveloperSenior(List<String> devSkills, int salary, int contractTimeInYears) {

        var developer = new Developer(devSkills, salary);
        developer.makeSenior(contractTimeInYears);

        return developer;
    }

    public void makeSenior(int contractTimeInYears) {
        this.developerExperience = DeveloperExperience.SENIOR;
        this.contractTimeInYears = contractTimeInYears;
        this.firstJob = null;
    }

    public static Developer makeDeveloperToJunior(List<String> devSkills, int salary, Boolean firstJob) {

        var developer = new Developer(devSkills, salary);
        developer.makeToJunior(firstJob);

        return developer;
    }

    public void makeToJunior(Boolean firstJob) {
        this.developerExperience = DeveloperExperience.JUNIOR;
        this.firstJob = firstJob;
        this.contractTimeInYears = null;
    }

    public List<String> getDevSkills() {
        return devSkills;
    }

    public void setDevSkills(List<String> devSkills) {
        this.devSkills = devSkills;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public DeveloperExperience getType() {
        return developerExperience;
    }

    public void setFirsJob(boolean firstJob) throws Exception {
        if (this.developerExperience != DeveloperExperience.JUNIOR) {
            throw new Exception("This developer is not Junior");
        }
        this.firstJob = firstJob;
    }

    public boolean getIfItsFirsJob() throws Exception {
        if (this.developerExperience != DeveloperExperience.JUNIOR) {
            throw new Exception("This developer is not Junior");
        }
        return firstJob;
    }

    public void setContractTimeInYears(int contractTimeInYears) throws Exception {
        if (this.developerExperience != DeveloperExperience.SENIOR) {
            throw new Exception("This developer is not Junior");
        }
        this.contractTimeInYears = contractTimeInYears;
    }

    public int getContractTimeInYears() throws Exception {
        if (this.developerExperience != DeveloperExperience.SENIOR) {
            throw new Exception("This developer is not Junior");
        }
        return contractTimeInYears;
    }

    @Override
    public String toString() {
        var toString = "Developer{ " +
                "devSkills=" + devSkills +
                ", salary=" + salary +
                ", developerExperience=" + developerExperience;
        if (developerExperience == DeveloperExperience.JUNIOR) {
            toString += ", firstJob=" + firstJob;
        }
        if (developerExperience == DeveloperExperience.SENIOR) {
            toString += ", contractTimeInYears=" + contractTimeInYears;
        }

        return toString + " }";
    }
}