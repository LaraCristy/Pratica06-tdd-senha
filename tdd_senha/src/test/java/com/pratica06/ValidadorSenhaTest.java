
package com.pratica06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    void senhaComMenosDe8CaracteresDeveSerInvalida() {
        ValidadorSenha validador = new ValidadorSenha();

       ResultadoValidacao resultado = validador.validar("Ab@12");

assertFalse(resultado.isValido());
assertTrue(resultado.getErros().contains(
        "A senha deve ter pelo menos 8 caracteres"
));
    }
    
   @Test
void senhaComMenosDe2DigitosDeveSerInvalida() {
    ValidadorSenha validador = new ValidadorSenha();

  ResultadoValidacao resultado = validador.validar("Abcdef@1");

assertFalse(resultado.isValido());
assertTrue(resultado.getErros().contains(
        "A senha deve conter pelo menos 2 dígitos"
));
}
@Test
void senhaSemLetraMaiusculaDeveSerInvalida() {
    ValidadorSenha validador = new ValidadorSenha();

    ResultadoValidacao resultado = validador.validar("abcdef@12");

    assertFalse(resultado.isValido());
    assertTrue(resultado.getErros().contains(
            "A senha deve conter pelo menos uma letra maiuscula"
    ));
}

}
