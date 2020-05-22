package vet.util;

import vet.enums.AdminTask;
import vet.enums.AdminType;
import vet.enums.MedicalType;
import vet.staff.AdminStaff;
import vet.staff.MedicalStaff;

import java.util.ArrayList;
import java.util.List;

public final class StaffGeneratorUtil {

    private static final int MIN_SALARY = 1000;
    private static final int MAX_SALARY = 10000;

    //best practice when creating utils class to set the constructor private
    private StaffGeneratorUtil() {
    }

    public static List<AdminStaff> generateAdmins(int number) {
        List<AdminStaff> adminStaffs = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            adminStaffs.add(generateAdminStaff());
        }
        return adminStaffs;
    }

    public static List<MedicalStaff> generateMedicals(int number) {
        List<MedicalStaff> medicalStaffs = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            medicalStaffs.add(generateMedicalStaff());
        }
        return medicalStaffs;
    }

    private static AdminStaff generateAdminStaff() {
        String randomName = RandomUtil.generateRandomStaffName();
        int uniqueNumber = RandomUtil.generateUniqueNumber();
        AdminType adminType = StaffGeneratorUtil.generateRandomAdminType();
        AdminTask adminTask = generateRandomAdminTask();
        int salary = RandomUtil.randomInt(MIN_SALARY, MAX_SALARY);
        return new AdminStaff(randomName, String.valueOf(uniqueNumber), salary, adminType, adminTask);
    }

    private static MedicalStaff generateMedicalStaff() {
        String randomName = RandomUtil.generateRandomStaffName();
        int uniqueNumber = RandomUtil.generateUniqueNumber();
        MedicalType medicalType = StaffGeneratorUtil.generateRandomMedicalType();
        int salary = RandomUtil.randomInt(MIN_SALARY, MAX_SALARY);
        return new MedicalStaff(randomName, String.valueOf(uniqueNumber), salary, medicalType);
    }


    private static AdminType generateRandomAdminType() {
        int length = AdminType.values().length;
        return AdminType.values()[RandomUtil.randomInt(length)];
    }

    private static AdminTask generateRandomAdminTask() {
        int length = AdminTask.values().length;
        return AdminTask.values()[RandomUtil.randomInt(length)];
    }

    private static MedicalType generateRandomMedicalType() {
        int length = MedicalType.values().length;
        return MedicalType.values()[RandomUtil.randomInt(length)];
    }
}
