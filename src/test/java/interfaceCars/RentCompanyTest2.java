package interfaceCars;

import interfaceCars.Avante2;
import interfaceCars.K52;
import interfaceCars.RentCompany2;
import interfaceCars.Sonata2;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RentCompanyTest2 {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompany2 company = RentCompany2.create(); // factory method를 사용해 생성
        company.addCar(new Sonata2(150));
        company.addCar(new K52(260));
        company.addCar(new Sonata2(120));
        company.addCar(new Avante2(300));
        company.addCar(new K52(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "abstractCars.Sonata2 : 15리터" + NEWLINE +
                        "abstractCars.K52 : 20리터" + NEWLINE +
                        "abstractCars.Sonata2 : 12리터" + NEWLINE +
                        "abstractCars.Avante2 : 20리터" + NEWLINE +
                        "abstractCars.K52 : 30리터" + NEWLINE
        );
    }
}