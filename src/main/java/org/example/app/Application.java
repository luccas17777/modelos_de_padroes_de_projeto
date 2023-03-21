package org.example.app;

import org.example.button.Button;
import org.example.checkbox.Checkbox;
import org.example.factories.GUIFactory;

public class Application {
    private Button button; // criamos uma variavel do tipo Button
    private Checkbox checkbox; //criamos uma variavel do tipo Checkbox

    public Application(GUIFactory factory){ //Aqui temos um contrutor que esta recebendo um GUIFactory da classe DEMO
        button = factory.createButton(); // a variavel button recebe o retorno do método que será a implementação da interface vinda de uma das classes que a esta implementando
        checkbox = factory.createCheckbox(); // a variavel checkbox recebe o retorno do método que será a implementação da interface vinda de uma das classes que a esta implementando
    }

    public void paint(){ //criamos o metodo paint
        button.paint(); // utilizamos a variavel que foi inicializada no construtor e chamos o metodo paint
        checkbox.paint(); //utilizamos a variavel que foi inicializada no construtor e chamos o metodo paint
    }
}
