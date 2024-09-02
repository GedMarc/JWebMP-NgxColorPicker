package com.jwebmp.plugins.angular.colorpicker.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;

import java.util.Set;

public class NgxColorPickerModuleInclusion implements IGuiceScanModuleInclusions<NgxColorPickerModuleInclusion>
{
    @Override
    public Set<String> includeModules()
    {
        return Set.of("com.jwebmp.plugins.angular.colorpicker");
    }
}
