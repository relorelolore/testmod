package net.relorelolore.testmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.relorelolore.testmod.TestMod;
import net.relorelolore.testmod.block.ModBlocks;

import java.rmi.registry.Registry;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);

    public static final RegistryObject<CreativeModeTab> TEST_TAB =
            CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("test_tab",()->CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetabs.test_tab"))
                    .displayItems((p_270258_, p_259752_) -> {
                        p_259752_.accept(ModItems.SAPPHIRE.get());
                        p_259752_.accept((ModItems.RAW_SAPPHIRE.get()));
                        p_259752_.accept(Items.EMERALD);
                        p_259752_.accept(Items.IRON_DOOR);
                        p_259752_.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        p_259752_.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
