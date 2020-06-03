package com.example.myapplication.stepdefinitions;

import static com.example.myapplication.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import com.example.myapplication.questions.Texto;
import com.example.myapplication.tasks.Seleccionar;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;

public class EscenariosEjemploStepDefinition {

  @Cuando("^(?:que |)(.*) selecciona el boton Next$")
  public void seleccionaBotonSiguiente(String nombreActor) {
    theActorCalled(nombreActor).attemptsTo(Seleccionar.boton(BTN_NEXT));
  }

  @Cuando("^(.*) selecciona el boton Correo$")
  public void seleccionarBotonCorreo(String nombreActor) {
    theActorCalled(nombreActor).attemptsTo(Seleccionar.boton(BTN_CORREO));
  }

  @Entonces("^el no observa el mensaje: (.*)$")
  public void verificarMensajeNoVisible(String mensaje) {
    theActorInTheSpotlight().should(seeThat(Texto.esVisible(mensaje), equalTo(false)));
  }

  @Entonces("^el observa el mensaje: (.*)$")
  public void VerificarMensajeVisible(String mensaje) {
    theActorInTheSpotlight().should(seeThat(Texto.esVisible(mensaje), equalTo(true)));
  }

  @Cuando("^el selecciona el boton Previous$")
  public void seleccionaBotonAnterior() {
    theActorInTheSpotlight().attemptsTo(Seleccionar.boton(BTN_PREVIOUS));
  }
}
