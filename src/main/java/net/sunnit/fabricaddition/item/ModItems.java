package net.sunnit.fabricaddition.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sunnit.fabricaddition.FabricAdditions;

public class ModItems {
    public static final Item COIN = registerItem("coin", new Item(new FabricItemSettings()));
    public static final Item COMPACT_COIN = registerItem("compact_coin", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public  static  void addItemToIngredientsItemGroup(FabricItemGroupEntries entries){
        entries.add(COIN);
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(COMPACT_COIN);
    }
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FabricAdditions.Mod_ID, name), item);
    }
    public static void registerModItems(){
        FabricAdditions.LOGGER.info("Registering mod items for" + FabricAdditions.Mod_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientsItemGroup);
    }
}
