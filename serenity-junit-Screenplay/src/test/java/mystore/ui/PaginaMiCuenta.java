package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMiCuenta {
    public static final Target SUBTITULO = Target.the("Subtitulo de la pagina My account")
            .located(By.cssSelector(".info-account"));
}
