
interface Character {
    String getAbilities();

}

class Mario implements Character {
    @Override
    public String getAbilities() {
        return "Mario";
    }
}

abstract class CharacterDecorator implements Character {
    protected Character character;
    public CharacterDecorator(Character character) {
        this.character = character;
    }
}

class HeightUp extends CharacterDecorator {
    public HeightUp(Character character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + " with heightUp";
    }
}

class GunPowerUp extends CharacterDecorator {

    public GunPowerUp(Character c) {
       super(c);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + " with Gun";
    }
}

class StarPowerUp extends CharacterDecorator {
    public StarPowerUp(Character c) {
        super(c);
    }
    @Override
    public String getAbilities() {
        return character.getAbilities() + " with Star Power (Limited Time)";
    }
}
public class DecoratorPattern {

    public static void main(String[] args) {
        Character mario = new Mario();
        System.out.println("Basic Character: " + mario.getAbilities());

        // Decorate Mario with a HeightUp power-up.
        mario = new HeightUp(mario);
        System.out.println("After HeightUp: " + mario.getAbilities());

        // Decorate Mario further with a GunPowerUp.
        mario = new GunPowerUp(mario);
        System.out.println("After GunPowerUp: " + mario.getAbilities());

        // Finally, add a StarPowerUp decoration.
        mario = new StarPowerUp(mario);
        System.out.println("After StarPowerUp: " + mario.getAbilities());
    }
}
