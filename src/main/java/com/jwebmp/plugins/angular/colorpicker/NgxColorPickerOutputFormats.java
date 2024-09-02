package com.jwebmp.plugins.angular.colorpicker;

public enum NgxColorPickerOutputFormats
{
    Auto,
    Hex,
    Rgba,
    Hsla,
    ;

    @Override
    public String toString()
    {
        return super.toString()
                    .toLowerCase();
    }
}
