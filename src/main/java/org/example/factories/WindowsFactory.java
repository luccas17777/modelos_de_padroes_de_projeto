package org.example.factories;

import org.example.button.Button;
import org.example.button.WindowsButton;
import org.example.checkbox.Checkbox;
import org.example.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() { //criamos o metodo createButton
        return new WindowsButton(); // e retornamos a instancia de WindowsButton
    }

    @Override
    public Checkbox createCheckbox() { //criamos o metodo createCheckbox
        return new WindowsCheckbox();// e retornamos a instancia de WindowsCheckbox
    }
}
