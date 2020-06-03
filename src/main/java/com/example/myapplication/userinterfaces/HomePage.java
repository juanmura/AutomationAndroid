package com.example.myapplication.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
  public static final Target BTN_NEXT =
      Target.the("Boton siguiente").located(By.xpath("//android.widget.Button[@text='NEXT']"));
  public static final Target BTN_PREVIOUS =
      Target.the("Boton Anterior").located(By.xpath("//android.widget.Button[@text='PREVIOUS']"));
  public static final Target TXT_PRINCIPAL =
      Target.the("Texto principal").locatedBy("//android.widget.TextView[@text='{0}']");
  public static final Target BTN_CORREO =
      Target.the("Boton correo").located(By.id("com.example.myapplication:id/fab"));
}
