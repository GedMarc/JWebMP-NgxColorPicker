package com.jwebmp.plugins.angular.colorpicker.implementations;

import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

@TsDependency(value = "ngx-color-picker", version = "^17.0.0")
public class NgxColorPickerPageConfigurator implements IPageConfigurator<NgxColorPickerPageConfigurator>
{
    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return null;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }
}
