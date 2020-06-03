package com.example.myapplication.questions;

import static com.example.myapplication.userinterfaces.HomePage.TXT_PRINCIPAL;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Texto implements Question<Boolean> {

  private String texto;

  public Texto(String texto) {
    this.texto = texto;
  }

  public static Texto esVisible(String texto) {
    return new Texto(texto);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return TXT_PRINCIPAL.of(texto).resolveFor(actor).isVisible();
  }
}
