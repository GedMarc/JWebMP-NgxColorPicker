package com.jwebmp.plugins.angular.ngxcolorpicker;

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
		return super.toString().toLowerCase();
	}
}
