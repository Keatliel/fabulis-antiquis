package io.github.keatliel.fabulis_antiquis.item;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import io.github.keatliel.fabulis_antiquis.FabulisAntiquis;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
public class Moditems {
 
    public static final Item DIVINE_BLOOD = registerItem("divine_blood",
    new Item(new QuiltItemSettings().group(ItemGroup.MISC))); 


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FabulisAntiquis.MOD_ID, name), item);
    }
        


    public static void registerModitems() {
        FabulisAntiquis.LOGGER.debug("Registering Mod Items");
    }


}
