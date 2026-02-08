package com.metacontent.cobblenav

import com.metacontent.cobblenav.item.Fishingnav
import com.metacontent.cobblenav.item.Pokenav
import com.metacontent.cobblenav.item.PokenavModelType
import com.metacontent.cobblenav.registry.RegistryProvider
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters
import net.minecraft.world.item.CreativeModeTab.Output
import net.minecraft.world.item.Item

object CobblenavItems : RegistryProvider<Registry<Item>, ResourceKey<Registry<Item>>, Item>() {
    override val registry: Registry<Item> = BuiltInRegistries.ITEM
    override val resourceKey: ResourceKey<Registry<Item>> = Registries.ITEM

    // Pokenavs
    val POKENAV = pokenavItem(PokenavModelType.BASE)
    val WHITE_POKENAV = pokenavItem(PokenavModelType.WHITE)
    val LIGHT_GRAY_POKENAV = pokenavItem(PokenavModelType.LIGHT_GRAY)
    val GRAY_POKENAV = pokenavItem(PokenavModelType.GRAY)
    val BLACK_POKENAV = pokenavItem(PokenavModelType.BLACK)
    val BROWN_POKENAV = pokenavItem(PokenavModelType.BROWN)
    val RED_POKENAV = pokenavItem(PokenavModelType.RED)
    val ORANGE_POKENAV = pokenavItem(PokenavModelType.ORANGE)
    val YELLOW_POKENAV = pokenavItem(PokenavModelType.YELLOW)
    val LIME_POKENAV = pokenavItem(PokenavModelType.LIME)
    val GREEN_POKENAV = pokenavItem(PokenavModelType.GREEN)
    val CYAN_POKENAV = pokenavItem(PokenavModelType.CYAN)
    val LIGHT_BLUE_POKENAV = pokenavItem(PokenavModelType.LIGHT_BLUE)
    val BLUE_POKENAV = pokenavItem(PokenavModelType.BLUE)
    val PURPLE_POKENAV = pokenavItem(PokenavModelType.PURPLE)
    val MAGENTA_POKENAV = pokenavItem(PokenavModelType.MAGENTA)
    val PINK_POKENAV = pokenavItem(PokenavModelType.PINK)
    val GHOLDENGO_POKENAV = pokenavItem(PokenavModelType.GHOLDENGO)
    val WANDERER_POKENAV = pokenavItem(PokenavModelType.WANDERER)

    val OLD_POKENAV = add("pokenav_item_old", Item(Item.Properties().stacksTo(16)))

    val FISHINGNAV = add("fishingnav_item", Fishingnav())

    private fun pokenavItem(model: PokenavModelType): Item {
        return add(Pokenav.BASE_REGISTRY_KEY + model.modelName, Pokenav(model))
    }

    fun addToGroup(displayContext: ItemDisplayParameters, entries: Output) {
        entries.accept(POKENAV)
        entries.accept(WHITE_POKENAV)
        entries.accept(LIGHT_GRAY_POKENAV)
        entries.accept(GRAY_POKENAV)
        entries.accept(BLACK_POKENAV)
        entries.accept(BROWN_POKENAV)
        entries.accept(RED_POKENAV)
        entries.accept(ORANGE_POKENAV)
        entries.accept(YELLOW_POKENAV)
        entries.accept(LIME_POKENAV)
        entries.accept(GREEN_POKENAV)
        entries.accept(CYAN_POKENAV)
        entries.accept(LIGHT_BLUE_POKENAV)
        entries.accept(BLUE_POKENAV)
        entries.accept(PURPLE_POKENAV)
        entries.accept(MAGENTA_POKENAV)
        entries.accept(PINK_POKENAV)
        entries.accept(GHOLDENGO_POKENAV)
        entries.accept(WANDERER_POKENAV)

        entries.accept(OLD_POKENAV)


        entries.accept(FISHINGNAV)
    }
}