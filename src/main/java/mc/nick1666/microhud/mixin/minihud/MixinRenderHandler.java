package mc.nick1666.microhud.mixin.minihud;

import fi.dy.masa.minihud.event.RenderHandler;
import mc.nick1666.microhud.MicroHud;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(RenderHandler.class)
public class MixinRenderHandler {
	@Shadow @Final private List<String> lines;

	@Inject(at = @At("TAIL"), method = "updateLines", remap = false)
	private void init(CallbackInfo info) {
		this.lines.add("Nick was here :D");
	}
}
