package org.example.app;

import org.example.factories.GUIFactory;
import org.example.factories.MacOSFactory;
import org.example.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication(){
        Application app; //criamos uma variavel do tipo Application
        GUIFactory factory; //criamos uma variavel do tipo da interface GUIFactory
        String osName = System.getProperty("os.name").toLowerCase(); //Pega a propriedade e armazena na variavel osName
        if (osName.contains("mac")){ //verifica se o conteudo da variavel é igual a "mac"
            factory = new MacOSFactory(); //se a condição for verdadeira a variavel factory recebe a classe MacOSFcatory que esta cumprindo o contrato da interface GUIFactory
        }else{
            factory = new WindowsFactory(); // senão recebe essa classe, que tambem esta implementando o GUIFactory.
        }
        app = new Application(factory); //a variavel app recebe o retorno do construtor de Application.
        return app; //aqui retornamos a variavel app.
    }

    public static void main(String[] args) {
        Application app = configureApplication(); //chamamos o metodo e armazenamos o retono dele na variavel app.
        app.paint(); //aqui chamamos um método que esta dentro de app para retornar uma mensagem
    }
}
