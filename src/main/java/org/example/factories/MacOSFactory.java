package org.example.factories;

import org.example.button.Button;
import org.example.button.MacOSButton;
import org.example.checkbox.Checkbox;

public class MacOSFactory implements GUIFactory{ // Essa classe implementa a interface GUIfactory
    @Override //Override para sobreescrever o metodo
    public Button createButton() { //criamos o metodo createButton
        return new MacOSButton(); // e retornamos a instancia de MacOSButton
    }

    @Override
    public Checkbox createCheckbox() {//criamos o metodo createCheckBox
        return new org.example.checkbox.MacOSCheckbox(); //e retornamos a instancia de MacOSCheckbox
    }
}
