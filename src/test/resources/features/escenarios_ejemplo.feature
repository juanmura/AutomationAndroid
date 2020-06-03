#language: es

Característica: Escenarios ejemplos de la aplicacion

  Como QA,
  quiero ejecutar escenarios,
  para mostrar como ejemplo.

  Escenario: Mostrar mensaje, al volver con el boton Previous
    Cuando Camilo selecciona el boton Next
    Y el selecciona el boton Previous
    Entonces el observa el mensaje: Hello first fragment

  Escenario: No mostrar mensaje, al seleccionar el boton Next
    Cuando Camilo selecciona el boton Next
    Entonces el no observa el mensaje: Hello first fragment

  Escenario: Mostrar alerta con mensaje, al seleccionar el boton correo
    Cuando Camilo selecciona el boton Correo
    Entonces el observa el mensaje: Replace with your own action
