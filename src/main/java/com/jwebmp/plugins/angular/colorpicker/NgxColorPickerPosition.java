package com.jwebmp.plugins.angular.colorpicker;

public enum NgxColorPickerPosition
{
    Auto,
    Top,
    Bottom,
    Left,
    Right;

    @Override
    public String toString()
    {
        return super.toString()
                    .toLowerCase();
    }
}
