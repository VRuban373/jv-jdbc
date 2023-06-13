package mate.jdbc;

import mate.jdbc.dao.ManufacturerDao;
import mate.jdbc.lib.Injector;
import mate.jdbc.model.Manufacturer;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.jdbc");
        ManufacturerDao manufacturerDao = (ManufacturerDao) injector
                .getInstance(ManufacturerDao.class);
        Manufacturer manufacturer = new Manufacturer("Zaz", "Ukraine");
        System.out.println(manufacturerDao.create(manufacturer));
        manufacturer.setName("Dacia");
        manufacturer.setCountry("Romania");
        manufacturer.setName("VAG");
        manufacturer.setCountry("Germany");
        manufacturer.setName("Seat");
        manufacturer.setCountry("Spain");
        System.out.println(manufacturerDao.update(manufacturer));
        System.out.println(manufacturerDao.get(1L));
        System.out.println(manufacturerDao.delete(2L));
        System.out.println(manufacturerDao.getAll());
    }
}
