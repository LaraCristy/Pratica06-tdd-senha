
package com.pratica06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    void senhaComMenosDe8CaracteresDeveSerInvalida() {
        ValidadorSenha validador = new ValidadorSenha();

        boolean resultado = validador.validar("Ab@12");

        assertFalse(resultado);
    }
}
