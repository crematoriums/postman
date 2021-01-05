package me.srgantmoomoo.postman.client.ui.clickgui;

import org.lwjgl.input.Keyboard;

import me.srgantmoomoo.postman.client.Main;
import me.srgantmoomoo.postman.client.module.Category;
import me.srgantmoomoo.postman.client.module.Module;

public class HudEditor extends Module {
	public HudEditor() {
		super("hudEditor", "descrp", Keyboard.KEY_NONE, Category.CLIENT);
	}
	
	public void onEnable() {
		Main.getInstance().clickGui.enterHUDEditor();
		disable();
	}
}