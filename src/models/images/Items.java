package models.images;

import java.util.HashMap;

public class Items {

    static HashMap<String, Image> items = new HashMap<>();

    static {

        items.put(
            "Recipe",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/7/73/Default_recipe_icon.png?version=501c7de3ee24e8e487ec12095cc7b2f9")
        );
        items.put(
            "Bloodstone",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/5/5a/Bloodstone_icon.png?version=fe1cf38781b85c587fee9e6f872dae4b")
        );
        items.put(
            "Soul Booster",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/2/2f/Soul_Booster_icon.png?version=2e729247c554a6c551a821d97ef9e7fa")
        );
        items.put(
            "Octarine Core",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/1/13/Octarine_Core_icon.png?version=e25f1503ef6c10f4232ef91991cf24a3")
        );
        items.put(
            "Mystic Staff",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/2/29/Mystic_Staff_icon.png?version=b1c43d9eba3838fca9d7d0f3a8b4cfa1")
        );
        items.put(
            "Perseverance",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/f/fb/Perseverance_icon.png?version=a3c212784671d04522632bb6a40d912d")
        );
        items.put(
            "Ultimate Orb",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/1/14/Ultimate_Orb_icon.png?version=453f7801e4149bf48fe0e1b505811151")
        );
        items.put(
            "Scythe of Vyse",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/5/54/Scythe_of_Vyse_icon.png?version=a53dc812aeea66092f1f0141a1ab3807")
        );
        items.put(
            "Blink Dagger",
            new Image("https://d1u5p3l4wpay3k.cloudfront.net/dota2_gamepedia/4/4c/Blink_Dagger_icon" +
            ".png?version=58b67187bd38525aee3ab4c476b5f34a")
        );
    }

    public static HashMap<String, Image> getItems() {
        return items;
    }

    public static Image getImage(String item) {
        return items.get(item);
    }

}
