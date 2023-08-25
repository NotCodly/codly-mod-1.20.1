package net.codly.codlymod.item;

import net.codly.codlymod.CodlyMod;
import net.codly.codlymod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CodlyMod.MODID);

    public static final RegistryObject<CreativeModeTab> CODLY_TAB = CREATIVE_MODE_TABS.register("codly_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CODLY_PICKAXE.get()))
                            .title(Component.translatable("creativetab.codly_mod"))
                            .displayItems(((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.CODLY_PICKAXE.get());
                                pOutput.accept(ModBlocks.LILYPAD1_BLOCK.get());
                            }))
                            .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
