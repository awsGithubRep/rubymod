package com.dmc.rubymod.item;

import com.dmc.rubymod.RubyMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RubyMod.MOD_ID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Crystal
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", Crystal::new);
    // Marble
    public static final RegistryObject<Item> MARBLE = ITEMS.register("marble",
            () -> new Item(new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP)));
    // Malachite
    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new Item(new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP)));
    // Ruby
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
                () -> new Item(new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard",
            () -> new Item(new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Ruby Apple
    public static final RegistryObject<Item> RUBY_APPLE = ITEMS.register("ruby_apple", RubyApple::new);
    // Sword
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 3, -2.4f,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Pickaxe
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 1, -2.8f,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Axe
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 5, -3f,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Shovel
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 1.5f, -2.4f,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Hoe
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, -5, -0.0f,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Helmet
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Chestplate
    public static final RegistryObject<ArmorItem> RUBY_CHESPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Leggings
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Boots
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));
    // Horse Armor
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor",
            () -> new HorseArmorItem(9, "ruby",
                    new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP).isImmuneToFire()));

}
