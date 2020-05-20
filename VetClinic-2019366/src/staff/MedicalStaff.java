package staff;

import enums.MedicalType;

public class MedicalStaff extends Staff {

    private MedicalType medicalType;

    public MedicalStaff(String name, String number, int salary, MedicalType medicalType) {
        super(name, number, salary);
        this.medicalType = medicalType;
    }

    @Override
    public String getType() {
        return medicalType.name();
    }
}
