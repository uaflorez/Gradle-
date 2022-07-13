package mystore;

import mystore.acciones.*;
import mystore.acciones.IngresarCon;
import mystore.preguntas.LaPaginaMiCuenta;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class CuandoUsuarioSeLoguea {

    Actor actor;

    @Managed
    WebDriver navegador;

    @Before
    public void prepararEscenario(){
        actor = Actor.named("Jorge");

        actor.can(BrowseTheWeb.with(navegador));
    }

    @Test
    public void ingresarAMyAccountCorrectamente(){
        /*El actor se registra en neustra plataforma de ventas
        El Actor quiere ingresar a su cuenta
        El actor puede ver el subtitulo de la cuenta My account*/

        //El actor se registra en nuestra plataforma de ventas
        //Dado
        actor.has(Decidido.ingresarConUsuarioYcontraseña());

        //El Actor quiere ingresar a su cuenta
        //Cuando
        actor.attemptsTo(IngresarCon.usuario("juantor16@gmail.com").contraseña("Argentina1"));

        //El actor puede ver el subtitulo de my account
        //Entonces
        actor.should(
                seeThat("Subtitulo de pagina My Account", LaPaginaMiCuenta.subtitulo(),
                        equalTo("Welcome to your account. Here you can manage all of your personal information and orders."))
        );
    }

}