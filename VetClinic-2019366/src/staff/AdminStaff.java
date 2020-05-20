package staff;

import enums.AdminType;

public class AdminStaff extends Staff {

    private AdminType adminType;

    public AdminStaff(String name, String number, int salary, AdminType adminType) {
        super(name, number, salary);
        this.adminType = adminType;
    }

    @Override
    public String getType() {
        return adminType.name();
    }
}
