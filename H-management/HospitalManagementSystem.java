import java.util.*;

class HospitalManagementSystem {
    
    // Main Menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Patient Registration");
            System.out.println("2. Appointment Scheduling");
            System.out.println("3. Electronic Health Records (EHR)");
            System.out.println("4. Billing and Invoicing");
            System.out.println("5. Inventory Management");
            System.out.println("6. Staff Management");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> PatientRegistration.registerPatient();
                case 2 -> AppointmentScheduling.scheduleAppointment();
                case 3 -> ElectronicHealthRecords.viewRecords();
                case 4 -> BillingAndInvoicing.generateBill();
                case 5 -> InventoryManagement.manageInventory();
                case 6 -> StaffManagement.manageStaff();
                case 7 -> System.out.println("Exiting System...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}

class PatientRegistration {
    static List<String> patients = new ArrayList<>();

    static void registerPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        patients.add(name);
        System.out.println("Patient registered successfully.");
    }
}

class AppointmentScheduling {
    static Map<String, String> appointments = new HashMap<>();

    static void scheduleAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter appointment date (DD/MM/YYYY): ");
        String date = scanner.nextLine();
        appointments.put(name, date);
        System.out.println("Appointment scheduled successfully.");
    }
}

class ElectronicHealthRecords {
    static Map<String, String> records = new HashMap<>();

    static void viewRecords() {
        if (records.isEmpty()) {
            System.out.println("No records found.");
        } else {
            records.forEach((patient, record) -> {
                System.out.println("Patient: " + patient + " | Record: " + record);
            });
        }
    }
}

class BillingAndInvoicing {
    static Map<String, Double> bills = new HashMap<>();

    static void generateBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        bills.put(name, amount);
        System.out.println("Bill generated successfully.");
    }
}

class InventoryManagement {
    static Map<String, Integer> inventory = new HashMap<>();

    static void manageInventory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
        System.out.println("Inventory updated successfully.");
    }
}

class StaffManagement {
    static List<String> staffMembers = new ArrayList<>();

    static void manageStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter staff member name: ");
        String name = scanner.nextLine();
        staffMembers.add(name);
        System.out.println("Staff member added successfully.");
    }
}

