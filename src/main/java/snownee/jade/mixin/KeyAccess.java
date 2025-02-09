package snownee.jade.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.network.chat.Component;
import net.minecraft.util.LazyLoadedValue;

@Mixin(InputConstants.Key.class)
@SuppressWarnings("deprecation")
public interface KeyAccess {

	@Accessor
	@Mutable
	void setDisplayName(LazyLoadedValue<Component> displayName);

}
