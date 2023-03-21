package org.example.checkbox;

public class WindowsCheckbox implements Checkbox{  //Essa classe implementa a interface Checkbox
    @Override //Override para sobreescrever o metodo
    public void paint() { //o nome tem que estar identico ao da interface. E esse é o método que contem a implementacao da interface.
        System.out.println("You have created WindowsCheckbox."); // aqui printamos o resultado do metodo na tela.
    }
}
