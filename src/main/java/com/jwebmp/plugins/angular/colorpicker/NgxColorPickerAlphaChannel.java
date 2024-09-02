package com.jwebmp.plugins.angular.colorpicker;

public enum NgxColorPickerAlphaChannel
{
    Enabled,
    Disabled,
    Always,
    Forced;

    @Override
    public String toString()
    {
        return super.toString()
                    .toLowerCase();
    }
}
