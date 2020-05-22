package vet.staff;

import vet.enums.AdminTask;
import vet.enums.AdminType;

public class AdminStaff extends Staff {

    private AdminType adminType;
    private AdminTask adminTask;

    public AdminStaff(String name, String number, int salary, AdminType adminType, AdminTask adminTask) {
        super(name, number, salary);
        this.adminType = adminType;
        this.adminTask = adminTask;
    }

    @Override
    public String getType() {
        return adminType.name();
    }

    public AdminType getAdminType() {
        return adminType;
    }

    public void setAdminType(AdminType adminType) {
        this.adminType = adminType;
    }

    public AdminTask getAdminTask() {
        return adminTask;
    }

    public void setAdminTask(AdminTask adminTask) {
        this.adminTask = adminTask;
    }
}
