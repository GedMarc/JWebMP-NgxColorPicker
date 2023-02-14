package com.jwebmp.plugins.angular.ngxcolorpicker;

import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.base.html.inputs.*;

public class NgxColorPicker extends InputColourType<NgxColorPicker>
{
	private String colorPicker;
	
	private Integer cpHeight;
	private Integer cpWidth;
	private Boolean cpToggle;
	private Boolean cpDisabled;
	private Boolean cpCmykEnabled;
	private NgxColorPickerOutputFormats cpOutputFormat;
	private NgxColorPickerAlphaChannel cpAlphaChannel;
	
	private String cpFallbackColor;
	private NgxColorPickerPosition cpPosition;
	
	private Double cpPositionOffset;
	private Double cpPositionRelativeToArrow;
	private Double cpPresetLabel;
	private Double cpPresetColors;
	private Double cpDisableInput;
	private Double cpDialogDisplay;
	private Double cpIgnoredElements;
	private Boolean cpSaveClickOutside;
	private Boolean cpCloseClickOutside;
	
	public NgxColorPicker()
	{
	
	}
	
	@Override
	public void preConfigure()
	{
		super.preConfigure();
		removeAttribute("type");
	}
	
}
