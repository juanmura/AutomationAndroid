package com.example.myapplication.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Seleccionar implements Task {

  private Target boton;

  public Seleccionar(Target boton) {
    this.boton = boton;
  }

  public static Seleccionar boton(Target boton) {
    return instrumented(Seleccionar.class, boton);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(boton));
  }
}
