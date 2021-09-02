import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExamPrepHeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countHero = Integer.parseInt(scanner.nextLine());
        Map<String, HeroData> heroes = new TreeMap<>();

        for (int i = 1; i <= countHero; i++) {
            String hero = scanner.nextLine();
            String[] partsHeroData = hero.split(" ");
            String heroName = partsHeroData[0];
            int hitPoints = Integer.parseInt(partsHeroData[1]);
            int manaPoints = Integer.parseInt(partsHeroData[2]);

            HeroData newHero = new HeroData (hitPoints, manaPoints);

            heroes.put(heroName, newHero);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] commandParts = command.split(" - ");
            String typeCommand = commandParts[0];
            String heroName = commandParts[1];
            switch (typeCommand){
                case "CastSpell":
                    int currentMP = heroes.get(heroName).manaPoints;
                    int currentHP = heroes.get(heroName).hitPoints;
                    int neededMO = Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];
                    if (currentMP >= neededMO){
                        currentMP -= neededMO;
                        HeroData currentHero = new HeroData(currentHP, currentMP);
                        heroes.put(heroName, currentHero);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMP);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }

                    break;
                case "TakeDamage":
                    int currentMPt = heroes.get(heroName).manaPoints;
                    int currentHPt = heroes.get(heroName).hitPoints;
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];
                    currentHPt -= damage;
                    HeroData newHero = new HeroData(currentHPt, currentMPt);
                    heroes.put(heroName, newHero);
                    if (currentHPt > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHPt);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int currentMPr = heroes.get(heroName).manaPoints;
                    int currentHPr = heroes.get(heroName).hitPoints;
                    int amount = Integer.parseInt(commandParts[2]);
                    currentMPr += amount;
                    int difference = 0;
                    if (currentMPr > 200){
                        difference = currentMPr - 200;
                        currentMPr = 200;

                    }
                    HeroData heroR = new HeroData(currentHPr, currentMPr);
                    heroes.put(heroName, heroR);

                    System.out.printf("%s recharged for %d MP!%n", heroName, amount - difference);
                    break;
                case "Heal":
                    int currentMPh = heroes.get(heroName).manaPoints;
                    int currentHPh = heroes.get(heroName).hitPoints;
                    int amountForHeal = Integer.parseInt(commandParts[2]);
                    currentHPh += amountForHeal;
                    int diff = 0;
                    if (currentHPh > 100){
                        diff = currentHPh - 100;
                        currentHPh = 100;

                    }
                    HeroData heroH = new HeroData(currentHPh, currentMPh);
                    heroes.put(heroName, heroH);

                    System.out.printf("%s healed for %d HP!%n", heroName, amountForHeal - diff);
                    break;
            }



            command = scanner.nextLine();
        }
        heroes.entrySet().stream().sorted((h1, h2) -> Integer.compare(h2.getValue().getHitPoints(), h1.getValue().getHitPoints()))
                .filter(h -> h.getValue().getHitPoints() > 0)
                .forEach(hero -> {
                    System.out.println(hero.getKey());
                    System.out.println("HP: " + hero.getValue().getHitPoints());
                    System.out.println("MP: " + hero.getValue().getManaPoints());
                });
    }
}

class HeroData {
    int hitPoints;
    int manaPoints;

    public HeroData(int hisPoints, int manaPoints) {
        this.hitPoints = hisPoints;
        this.manaPoints = manaPoints;

    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }
}
