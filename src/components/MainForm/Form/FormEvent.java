package components.MainForm.Form;

import java.util.EventObject;

public class FormEvent extends EventObject {

    private String name;
    private String occupation;
    private String ageCat;
    private String employment;
    private String tax;
    private String gender;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(
            Object source,
            String name,
            String occupation,
            String ageCat,
            String employment,
            String tax,
            String gender
    ) {
        super(source);

        this.name = name;
        this.occupation = occupation;
        this.ageCat = ageCat;
        this.employment = employment;
        this.tax = tax;
        this.gender = gender;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAgeCat() {
        return ageCat;
    }

    public void setAgeCat(String ageCat) {
        this.ageCat = ageCat;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
