class LogicaMecanicas {

    // Atributos de la clase:
    private int characMana;
    private int characHealth;
    private int attackDamage;

    // Constructor de la clase:
    LogicaMecanicas(JuegoRol character) {
        this.characMana=character.getCharacMana();
        this.characHealth=character.getCharacHealth();
    }


    // Métodos de la clase:
    public void printCharMana() {
        System.out.println("Mana: "+characMana);
    }
    public void printCharHealth() {
        System.out.println("Health: "+characHealth);
    }
}
