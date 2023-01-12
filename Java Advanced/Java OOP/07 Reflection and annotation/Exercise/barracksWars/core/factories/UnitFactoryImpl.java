package J07ReflectionAndAnnotation.Exercise.barracksWars.core.factories;

import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Unit;
import J07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"J07ReflectionAndAnnotation.Exercise.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType){
		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> constructor = unitClass.getDeclaredConstructor();
			return constructor.newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
