package org.example.button;

public class WindowsButton implements Button{ // Essa classe implementa a interface button
    @Override //Override para sobreescrever o metodo
    public void paint() { //o nome tem que estar identico ao da interface. E esse é o método que contem a implementacao da interface.
        System.out.println("You have created WindowsButton"); // aqui printamos o resultado do metodo na tela.
    }
}
