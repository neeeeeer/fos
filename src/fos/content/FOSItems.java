package fos.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class FOSItems {
    public static Item meteorite, tin, silver, lithium;

    public static void load(){
        meteorite = new Item("meteorite", Color.valueOf("de8900")){{
            hardness = 1;
            radioactivity = 0.1f;
        }};
        tin = new Item("tin", Color.valueOf("85b374")){{
            hardness = 102;
        }};
        silver = new Item("silver", Color.valueOf("813ba1")){{
            hardness = 103;
        }};
        lithium = new Item("lithium", Color.valueOf("000000")){{
            hardness = 1;
        }};
    }
}
