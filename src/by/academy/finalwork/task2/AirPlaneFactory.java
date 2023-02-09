package by.academy.finalwork.task2;

import by.academy.finalwork.task2.emun.*;

import java.time.LocalDate;
import java.util.Map;

public class AirPlaneFactory {

	public static Airplane buildAirplane(Model model, String number, LocalDate dateOfManufacture) {

		switch (model) {
			case CLASSIC_300:
				return new Airplane(Type.PASSENGER, Brand.BOEING, model, number, dateOfManufacture, TypeEngine.TURBOJET,
						2, TypeFuel.JET, 795, 2600, 2,
						128, 15000, "blue", 11300, 4200,
						TypeChassis.WHEELS, TypeFuselage.NARROW_BODY, TypeWing.LOW_WING, 29, false);
			case CLASSIC_500:
				return new Airplane(Type.PASSENGER, Brand.BOEING, model, number, dateOfManufacture, TypeEngine.TURBOJET,
						2, TypeFuel.JET, 795, 2400, 2,
						108, 14770, "blue", 11300, 4400,
						TypeChassis.WHEELS, TypeFuselage.NARROW_BODY, TypeWing.LOW_WING, 29, false);
			case E_175:
				return new Airplane(Type.PASSENGER, Brand.EMBRAER, model, number, dateOfManufacture, TypeEngine.TURBOJET,
						2, TypeFuel.JET, 890, 1650, 2,
						80, 9900, "white", 11900, 3900,
						TypeChassis.WHEELS, TypeFuselage.NARROW_BODY, TypeWing.LOW_WING, 26, true);
			case E_195:
				return new Airplane(Type.PASSENGER, Brand.EMBRAER, model, number, dateOfManufacture, TypeEngine.TURBOJET,
						2, TypeFuel.JET, 890, 2040, 2,
						112, 13500, "white", 11900, 3500,
						TypeChassis.WHEELS, TypeFuselage.NARROW_BODY, TypeWing.LOW_WING, 28, true);
			default:
				throw new IllegalArgumentException("Нет указанной модели самолета");
		}
	}
}
