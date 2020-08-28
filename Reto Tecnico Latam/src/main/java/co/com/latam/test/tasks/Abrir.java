package co.com.latam.test.tasks;

import co.com.latam.test.userinterface.LatamHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {

    private LatamHomePage latamHomePage;


    public static Abrir LaPaginaDeLatam() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(latamHomePage));
    }

}
