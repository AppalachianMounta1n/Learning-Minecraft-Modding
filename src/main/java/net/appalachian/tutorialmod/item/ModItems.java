package net.appalachian.tutorialmod.item;

import net.appalachian.tutorialmod.TutorialMod;
import net.appalachian.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () ->  new Item(new Item.Properties())); //makes a sapphire item

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () ->  new Item(new Item.Properties())); //makes a raw_sapphire item

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () ->  new MetalDetectorItem(new Item.Properties().durability(100))); //makes a metal detector item with 100 durability

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}