package org.example.factories;

import org.example.button.Button;
import org.example.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton(); //criamos o metodo da interface que sera do tipo button para que a variavel que esta no Application possa receber o retorno do metodo createButton
    Checkbox createCheckbox(); //criamos o metodo da interface que sera do tipo Checkbox para que a variavel que esta no Application possa receber o retorno do metodo createCheckbox
}
