package com.jwebmp.plugins.angular.ngxcolorpicker;

import com.jwebmp.core.*;
import com.jwebmp.core.base.angular.client.annotations.boot.*;
import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.services.*;
import jakarta.validation.constraints.*;

@TsDependency(value = "ngx-color-picker", version = "13.0.0")
@NgBootModuleImport("ColorPickerModule")
@NgBootImportReference(name = "ColorPickerModule",reference = "ngx-color-picker")
public class NgxColorPickerPageConfigurator implements IPageConfigurator<NgxColorPickerPageConfigurator>
{
	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{
		return null;
	}
	
	@Override
	public boolean enabled()
	{
		return true;
	}
}
