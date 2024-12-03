public class MainJuegoRol {
    public static void main(String[] args) {

        JuegoRol tank = new JuegoRol(350, 50, 200, "Master Shield");
        System.out.println("El "+tank.getCharacRolTank()+" hace "+tank.getAttackDamage()+" puntos de daño.");
        System.out.println("La habilidad principal del "+tank.getCharacRolTank()+" es "+tank.getTankAbility());
        LogicaMecanicas tankLogic = new LogicaMecanicas(tank);
        tankLogic.printCharMana();
        tankLogic.printCharHealth();
        System.out.println();

        JuegoRol mage = new JuegoRol(100, 250, 500, "Fireball");
        System.out.println("El "+mage.getCharacRolMage()+" hace "+mage.getAttackDamage()+" puntos de daño.");
        System.out.println("La habilidad principal del "+mage.getCharacRolMage()+" es "+mage.getMageAbility());
        LogicaMecanicas mageLogic = new LogicaMecanicas(mage);
        mageLogic.printCharMana();
        mageLogic.printCharHealth();
        System.out.println();

        JuegoRol healer = new JuegoRol(150, 25, 450, "Healing Wave");
        System.out.println("El "+healer.getCharacRolHealer()+" hace "+healer.getAttackDamage()+" puntos de daño.");
        System.out.println("La habilidad principal del "+healer.getCharacRolHealer()+" es "+healer.getHealerAbility());
        System.out.println();

        JuegoRol knight = new JuegoRol(200, 175, 100, "Sword Dance");
        System.out.println("El "+knight.getCharacRolKnight()+" hace "+knight.getAttackDamage()+" puntos de daño.");
        System.out.println("La habilidad principal del "+knight.getCharacRolKnight()+" es "+knight.getKnightAbility());
    }
}
