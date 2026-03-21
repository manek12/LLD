package examples.vehicleRentalSystem;

import examples.vehicleRentalSystem.model.*;

public class RentalSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Vehicle Rental System!");

        Location store1Location = new Location("D-56", "Noida", "UP", "201029");
        Store store1 = new Store("s1", "Prime Vehicle Rental Store", store1Location, "123456789");
        StoreManager storeManager = new StoreManager(store1);
        storeManager.addVehicle(new Vehicle.Builder()
                .setId("vb1")
                .setVehicleBrand("TVS")
                .setModel("Apache")
                .setYear(2023)
                .setLicensePlate("UP16AU8765")
                .setType(VehicleType.BIKE)
                .setStatus(VehicleStatus.ACTIVE)
                .build());

        storeManager.addVehicle(new Vehicle.Builder()
                .setId("vc1")
                .setVehicleBrand("Honda")
                .setModel("City")
                .setYear(2022)
                .setLicensePlate("UP16XD7496")
                .setType(VehicleType.CAR)
                .setStatus(VehicleStatus.ACTIVE)
                .build());

        User vicky = new User("1", "Vicky", "xyz@gmail.com", "32453456", "rtgy5653");
        User vishal = new User("2", "Vishal", "abc@gmail.com", "9689765890", "");
        Location vickyLocation = new Location("xyz", "Noida", "UP", "201090");
        Reservation vickyReservation = storeManager.reserveVehicle(vicky, "vc1", vickyLocation, vickyLocation, "2026-3-12 12:00", "2026-3-12 16:00");
        if(vickyReservation != null){
            double amount = vickyReservation.getBill().getAmount();
            System.out.println("Please pay : "+vickyReservation.getBill().getAmount());
            Payment vickyPayment = new Payment("p-1", amount, "cash", vickyReservation.getDropoffDate());
            vickyReservation.getBill().setPayment(vickyPayment);
            vickyReservation.getBill().markAsPaid();
        }

        Location vishalLocation = new Location("abc", "Noida", "UP", "201090");
        Reservation vishalReservation = storeManager.reserveVehicle(vishal, "vb1", vishalLocation, vishalLocation, "2026-3-12 12:00", "2026-3-13 09:00");
        if(vishalReservation != null){
            double amount = vishalReservation.getBill().getAmount();
            System.out.println("Please pay : "+vishalReservation.getBill().getAmount());
            Payment vickyPayment = new Payment("p-1", amount, "cash", vishalReservation.getDropoffDate());
            vishalReservation.getBill().setPayment(vickyPayment);
            vishalReservation.getBill().markAsPaid();
        }
    }
}
