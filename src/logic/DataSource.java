package logic;

import models.Category;
import models.Option;
import models.Question;
import models.images.Items;

import java.util.*;
import java.util.stream.Collectors;

public class DataSource {

    private static final List<Category> categoryList = new ArrayList<>();

    static {
        Category category1 = new Category();
        category1.setName("Items");
        category1.setQuestionList(
            Arrays.asList(
                new Question(category1, "What is the cost of the Battle Fury?", 1,
                    new Option("4500"),
                    new Option("4000"),
                    new Option("4400", true),
                    new Option("2200")
                ),
                new Question(category1, "What is Octarine Core" + Items.getImage("Octarine Core").toHTML(true) + " is" + " made of?<br>", 2,
                    new Option(Items.getImage("Mystic Staff").toHTML() + Items.getImage("Soul Booster").toHTML(), true),
                    new Option(Items.getImage("Mystic Staff").toHTML() + Items.getImage("Perseverance").toHTML()),
                    new Option(Items.getImage("Mystic Staff").toHTML() + Items.getImage("Recipe").toHTML()),
                    new Option(Items.getImage("Ultimate Orb").toHTML() + Items.getImage("Perseverance").toHTML() + Items.getImage("Recipe").toHTML())
                ),
                new Question(category1, "What is the cooldown of Scythe of Vise?", 3,
                    new Option("22", true),
                    new Option("30"),
                    new Option("80"),
                    new Option("25")
                ),
                new Question(category1, "What is the maximum distance you can blink using Blink Dagger?", 4,
                    new Option("960"),
                    new Option("1200", true),
                    new Option("1500"),
                    new Option("1000")
                ),
                new Question(category1, "What is the manacost of using Force Staff?", 5,
                    new Option("50"),
                    new Option("75"),
                    new Option("100", true),
                    new Option("150")
                )
            )
        );
        categoryList.add(category1);
        Category category2 = new Category();
        category2.setName("Abilities");
        category2.setQuestionList(
            Arrays.asList(
                new Question(category2, "What hero has this ability: Timewalk?", 1,
                    new Option("Underlord"),
                    new Option("Faceless Void", true),
                    new Option("Queen of Pain"),
                    new Option("Witch Doctor")
                ),
                new Question(category2, "What is the maximum duration of Chaos Bolt?", 2,
                    new Option("3 sec"),
                    new Option("5 sec"),
                    new Option("4 sec", true),
                    new Option("2 sec"),
                    new Option("3.5 sec")
                ),
                new Question(category2, "What is the manacost of Meat Hook?", 3,
                    new Option("150"),
                    new Option("140", true),
                    new Option("100"),
                    new Option("180")
                ),
                new Question(category2, "How long Bloodlust lasts?", 4,
                    new Option("60"),
                    new Option("50"),
                    new Option("15"),
                    new Option("30", true)
                ),
                new Question(category2, "What is the cooldown of Ravage?", 5,
                    new Option("120"),
                    new Option("130"),
                    new Option("150", true),
                    new Option("160")
                )
            )
        );
        categoryList.add(category2);
        Category category3 = new Category();
        category3.setName("Attributes");
        category3.setQuestionList(
            Arrays.asList(
                new Question(category3, "Who of the following have this attributes?<br>" +
                    "STR: 21 + 1.8<br>" +
                    "AGI: 23 + 3.15<br>" +
                    "INT: 15  + 1.4", 1,
                    new Option("Alchemist"),
                    new Option("Abaddon"),
                    new Option("Clockwerk"),
                    new Option("Storm Spirit", true)
                ),
                new Question(category3, "Who of the following have this attributes?<br>" +
                    "STR: 21 + 2.15<br>" +
                    "AGI: 23 + 3.15<br>" +
                    "INT: 15  + 1.4", 2,
                    new Option("Faceless Void"),
                    new Option("Phantom Assassin", true),
                    new Option("Skywrath Mage"),
                    new Option("Ogre Magi")
                ),
                new Question(category3, "Who of the following have this attributes?<br>" +
                    "STR: 22 + 3.3<br>" +
                    "AGI: 15 + 1.5<br>" +
                    "INT: 16  + 1.7", 3,
                    new Option("Tidehunter", true),
                    new Option("Kunkka"),
                    new Option("Doom"),
                    new Option("Chaos Knight")
                ),
                new Question(category3, "Who of the following have this attributes?<br>" +
                    "STR: 19 + 1.9<br>" +
                    "AGI: 22 + 2.8<br>" +
                    "INT: 17  + 1.8", 4,
                    new Option("Venomancer", true),
                    new Option("Weaver"),
                    new Option("Meepo"),
                    new Option("Ember Spirit")
                ),
                new Question(category3, "Who of the following have this attributes?<br>" +
                    "STR: 19 + 2.1<br>" +
                    "AGI: 24 + 2.8<br>" +
                    "INT: 19  + 2.1", 5,
                    new Option("Drow Ranger"),
                    new Option("Gyrocopter", true),
                    new Option("Juggernaut"),
                    new Option("Nyx Assassin")
                )
            )
        );
        categoryList.add(category3);
        Category category4 = new Category();
        category4.setName("Talents");
        category4.setQuestionList(
            Arrays.asList(
                new Question(category4, "Which of these talents do NOT belong to Pugna?", 1,
                    new Option("-1s Nether Blast Netherblast Cooldown"),
                    new Option("+2s Decrepify Decrepify Duration"),
                    new Option("+90 Gold/Min", true),
                    new Option("+25 Movement Speed")
                ),
                new Question(category4, "Which of these talents do NOT belong to Omniknight?", 2,
                    new Option("+225 Health", true),
                    new Option("+75 Purification icon.png Purification AoE"),
                    new Option("+35% XP Gain"),
                    new Option("-12% Degen Aura icon.png Degen Aura")
                ),
                new Question(category4, "Which of these talents belong to Kunkka?", 3,
                    new Option("+25 Strength", true),
                    new Option("+25 Agility"),
                    new Option("+120 Gold/Min"),
                    new Option("+25% XP Gain")
                ),
                new Question(category4, "Which of these talents do not exist in game?", 4,
                    new Option("+25 Intelligence", true),
                    new Option("+180 Gold/Min"),
                    new Option("+25% XP Gain"),
                    new Option("+25 Strength")
                ),
                new Question(category4, "What is the most impactful talent?", 5,
                    new Option("+300 Aphotic Shield Health", true),
                    new Option("+25 Strength", true),
                    new Option("-18s Tornado Cooldown"),
                    new Option("+35 Ice Armor Structure")
                )
            )
        );
        categoryList.add(category4);
        Category category5 = new Category();
        category5.setName("Mechanics");
        category5.setQuestionList(
            Arrays.asList(
                new Question(category5, "When does the first night start?", 1,
                    new Option("3 min"),
                    new Option("4 min", true),
                    new Option("5 min"),
                    new Option("10 min")
                ),
                new Question(category5, "How many melee and ranged creeps spawn in the first wave, for only one lane? Not counting the enemy creeps in that lane!", 2,
                    new Option("3 melee creeps, 1 ranged creep", true),
                    new Option("4 melee creeps, 1 ranged creep"),
                    new Option("4 sec", true),
                    new Option("5 melee creeps, 2 ranged creep"),
                    new Option("2 melee creeps, 2 ranged creep")
                ),
                new Question(category5, "How many neutral camps are in the Radiant jungle, not counting the Ancients?", 3,
                    new Option("5; - 1 small camp, 2 medium camps and 2 large camps"),
                    new Option("5; - 2 small camps, 2 medium camps and 1 large camp", true),
                    new Option("6; - 2 small camps, 2 medium camps and 2 large camps"),
                    new Option("6; - 1 small camp, 3 medium camps and 2 large camps")
                ),
                new Question(category5, "Pick one set of the neutral creeps that can't spawn in the medium camp. (B - 04/10)", 4,
                    new Option("Centaur camp"),
                    new Option("Mud Golems"),
                    new Option("Wolf camp"),
                    new Option("Hellbear camp", true)
                ),
                new Question(category5, "At the start of the game, only Bounty runes can spawn", 5,
                    new Option("true", true),
                    new Option("false")
                )
            )
        );
        categoryList.add(category5);
    }

    public static List<Category> getCategoryList() {
        return categoryList;
    }

    public static List<Question> getAllQuestions() {
        return categoryList.stream()
            .map(Category::getQuestionList)
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
    }

    public static Question getQuestion(String category, int value) {
        return Objects.requireNonNull(getCategoryList().stream()
            .filter(category1 -> category1.getName().equals(category))
            .findFirst().orElse(null)
        ).getQuestionList().stream()
            .filter(q -> q.getValue() == value)
            .findFirst().orElse(null);
    }
}
