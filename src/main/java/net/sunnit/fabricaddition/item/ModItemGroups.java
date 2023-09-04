package net.sunnit.fabricaddition.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sunnit.fabricaddition.FabricAdditions;

public class ModItemGroups {
    public static final ItemGroup FABRICADD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FabricAdditions.Mod_ID, "fabricadd"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fabricadd"))
                    .icon(() -> new ItemStack(ModItems.COIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COIN);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                    }).build());
    public static void registerItemGroups(){
        FabricAdditions.LOGGER.info("Registering item groups for:" + FabricAdditions.Mod_ID);
    }
}
