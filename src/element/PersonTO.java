package element;

/**
 * Created by amrafiee on 7/16/2016.
 */
public class PersonTO {
private String national_code;
    private String name;
    private String last_name;
    private String level;
    private String birthdate;
    private String issue_number;

    public PersonTO() {
    }

    public PersonTO(String national_code, String name, String last_name, String level, String birthdate, String issue_number) {
        this.national_code = national_code;
        this.name = name;
        this.last_name = last_name;
        this.level = level;
        this.birthdate = birthdate;
        this.issue_number = issue_number;
    }

    public String getNational_code() {
        return national_code;
    }

    public void setNational_code(String national_code) {
        this.national_code = national_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getIssue_number() {
        return issue_number;
    }

    public void setIssue_number(String issue_number) {
        this.issue_number = issue_number;
    }
}
