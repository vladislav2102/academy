package by.academy.finalwork.task2;

import by.academy.finalwork.task2.emun.Airline;
import by.academy.finalwork.task2.emun.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		ArrayList<Airplane> fleetBelavia = new ArrayList<>();

		fleetBelavia.add(AirPlaneFactory.buildAirplane(Model.CLASSIC_300, "EW-300PA", LocalDate.of(1995, 2, 21)));
		fleetBelavia.add(AirPlaneFactory.buildAirplane(Model.CLASSIC_500, "EW-500PA", LocalDate.of(1995, 2, 21)));
		fleetBelavia.add(AirPlaneFactory.buildAirplane(Model.E_175, "EW-175PO", LocalDate.of(1995, 2, 21)));
		fleetBelavia.add(AirPlaneFactory.buildAirplane(Model.E_195, "EW-195PO", LocalDate.of(1995, 2, 21)));

		Airline airline1 = new Airline("Belavia", fleetBelavia);

		airline1.sortedRangeOfFlight();

		airline1.Capacity();

		airline1.fuelRangeConformity(1000, 2000);

		airline1.getFleet().get(0).printParameters();

		airline1.effectivity(3500, 100);

	}
}
