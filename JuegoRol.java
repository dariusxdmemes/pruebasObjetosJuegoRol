class JuegoRol {

    // Atributos de la clase

    private String characRolTank="Tank";
    private String characRolMage="Mage";
    private String characRolHealer="Healer";
    private String characRolKnight="Knight";
    private String tankAbility="Master Shield";
    private String mageAbility="Fireball";
    private String healerAbility="Healing Wave";
    private String knightAbility="Sword Dance";
    private int characHealth;
    private int attackDamage;
    private int characMana;
    private String ability;

    // Constructores de la clase

    JuegoRol(int characHealth, int attackDamage, int characMana, String ability) {
        this.characHealth=characHealth;
        this.attackDamage=attackDamage;
        this.characMana=characMana;
    }

    // Métodos de la clase

    // Setters Getters clase tanque:
    public void setCharacRolTank(String characRol) {
        this.characRolTank=characRol;
    }
    public String getCharacRolTank() {
        return characRolTank;
    }
    public void setTankAbility(String tankAbility) {
        this.tankAbility=tankAbility;
    }
    public String getTankAbility() {
        return tankAbility;
    }

    // Setters Getters clase mago:
    public void setCharacRolMage(String characRol) {
        this.characRolMage=characRol;
    }
    public String getCharacRolMage() {
        return characRolMage;
    }
    public void setMageAbility(String mageAbility) {
        this.mageAbility = mageAbility;
    }
    public String getMageAbility() {
        return mageAbility;
    }

    // Setters Getters clase healer:
    public void setCharacRolHealer(String characRol) {
        this.characRolHealer=characRol;
    }
    public String getCharacRolHealer() {
        return characRolHealer;
    }
    public void setHealerAbility(String healerAbility) {
        this.healerAbility = healerAbility;
    }
    public String getHealerAbility() {
        return healerAbility;
    }

    // Setters Getters clase caballero:
    public void setCharacRolKnight(String characRol) {
        this.characRolKnight=characRol;
    }
    public String getCharacRolKnight() {
        return characRolKnight;
    }
    public void setKnightAbility(String knightAbility) {
        this.knightAbility = knightAbility;
    }
    public String getKnightAbility() {
        return knightAbility;
    }

    // Setters Getters vida, maná, daño, etc.
    public void setCharacHealth(int characHealth) {
        this.characHealth=characHealth;
    }
    public int getCharacHealth() {
        return characHealth;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage=attackDamage;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public void setCharacMana(int characMana) {
        this.characMana=characMana;
    }
    public int getCharacMana() {
        return characMana;
    }
    public int characAttack(int attackDamage) {
        return characHealth-=this.attackDamage;
    }
    public void setAbility(String ability) {
        this.ability=ability;
    }
    public String getAbility() {
        return ability;
    }
    public int characManaConsumption(String ability) {
        try {
            switch (ability) {
                case "Master Shield":
                    return this.characMana-30;
                case "Fireball":
                    return this.characMana-125;
                case "Healing Wave":
                    return this.characMana-200;
                case "Sword Dance":
                    return this.characMana-35;
                default:
                    return this.characMana;
            }
        } catch (Exception e) {
            System.out.println("No te queda más maná! "+e.getMessage());
        }
        return this.characMana;
    }
    public void getCharacManaConsumption() {
        System.out.println(characManaConsumption(ability));
    }
}