package com.jwebmp.plugins.angular.colorpicker;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.inputs.InputColourType;
import lombok.Getter;

import java.util.Set;


@NgImportReference(value = "ColorPickerModule", reference = "ngx-color-picker")
@Getter
public class NgxColorPicker<J extends NgxColorPicker<J>> extends InputColourType<J> implements INgComponent<J>
{
    private String colorBind;

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
    private Boolean cpPositionRelativeToArrow;
    private Double cpPresetLabel;
    private Double cpPresetColors;
    private Double cpDisableInput;
    private Double cpDialogDisplay;
    private Double cpIgnoredElements;
    private Boolean cpSaveClickOutside;
    private Boolean cpCloseClickOutside;

    private Boolean cpCancelButton;
    private String cpCancelButtonClass;

    private Boolean cpOkButton;
    private String cpOkButtonClass;

    private Boolean cpAddColorButton;
    private String cpAddColorButtonClass;

    private String value;

    private Boolean showBackground;

    public NgxColorPicker()
    {

    }

    @Override
    protected void init()
    {
        if (showBackground != null && !Strings.isNullOrEmpty(colorBind))
        {
            addAttribute("[style.background]", colorBind);
        }
        if (cpHeight != null)
        {
            addAttribute("[cpHeight]", cpHeight + "");
        }
        if (cpWidth != null)
        {
            addAttribute("[cpWidth]", cpWidth + "");
        }
        if (cpToggle != null)
        {
            addAttribute("[cpToggle]", cpToggle + "");
        }
        if (cpDisabled != null)
        {
            addAttribute("[cpDisabled]", cpDisabled + "");
        }
        if (cpCmykEnabled != null)
        {
            addAttribute("[cpCmykEnabled]", cpCmykEnabled + "");
        }
        if (cpOutputFormat != null)
        {
            addAttribute("[cpOutputFormat]", "'" + cpOutputFormat + "'");
        }
        if (cpAlphaChannel != null)
        {
            addAttribute("[cpAlphaChannel]", "'" + cpAlphaChannel + "'");
        }
        if (cpFallbackColor != null)
        {
            addAttribute("[cpFallbackColor]", "'" + cpFallbackColor + "'");
        }
        if (cpPosition != null)
        {
            addAttribute("[cpPosition]", "'" + cpPosition + "'");
        }
        if (cpPositionOffset != null)
        {
            addAttribute("[cpPositionOffset]", cpPositionOffset + "");
        }
        if (cpPositionRelativeToArrow != null)
        {
            addAttribute("[cpPositionRelativeToArrow]", cpPositionRelativeToArrow + "");
        }
        if (cpPresetLabel != null)
        {
            addAttribute("[cpPresetLabel]", cpPresetLabel + "");
        }
        if (cpPresetColors != null)
        {
            addAttribute("[cpPresetColors]", cpPresetColors + "");
        }
        if (cpDisableInput != null)
        {
            addAttribute("[cpDisableInput]", cpDisableInput + "");
        }
        if (cpDialogDisplay != null)
        {
            addAttribute("[cpDialogDisplay]", cpDialogDisplay + "");
        }
        if (cpIgnoredElements != null)
        {
            addAttribute("[cpIgnoredElements]", cpIgnoredElements + "");
        }
        if (cpSaveClickOutside != null)
        {
            addAttribute("[cpSaveClickOutside]", cpSaveClickOutside + "");
        }
        if (cpCloseClickOutside != null)
        {
            addAttribute("[cpCloseClickOutside]", cpCloseClickOutside + "");
        }
        if (cpCancelButton != null)
        {
            addAttribute("[cpCancelButton]", cpCancelButton + "");
        }
        if (cpCancelButtonClass != null)
        {
            addAttribute("[cpCancelButtonClass]", cpCancelButtonClass + "");
        }
        if (cpOkButton != null)
        {
            addAttribute("[cpOKButton]", cpOkButton + "");
        }
        if (cpOkButtonClass != null)
        {
            addAttribute("[cpOkButtonClass]", cpOkButtonClass + "");
        }
        if (cpAddColorButton != null)
        {
            addAttribute("[cpAddColorButton]", cpAddColorButton + "");
        }
        if (cpAddColorButtonClass != null)
        {
            addAttribute("[cpAddColorButtonClass]", cpAddColorButtonClass + "");
        }
        if (value != null)
        {
            addAttribute("[value]", value);
        }
        if (showBackground != null && showBackground && !Strings.isNullOrEmpty(colorBind))
        {
            addAttribute("[style.background]", colorBind);
        }
        super.init();
    }

    @Override
    protected void preConfigure()
    {
        super.preConfigure();
        removeAttribute("type");
    }

    @Override
    public J bind(String variableName)
    {
        addAttribute("[(colorPicker)]", variableName);
        setColorBind(variableName);
        setValue(variableName);
        return (J) this;
    }

    @Override
    public Set<String> moduleImports()
    {
        Set<String> strings = INgComponent.super.moduleImports();
        strings.add("ColorPickerModule");
        return strings;
    }

    @Override
    public Boolean standaloneOverride()
    {
        return true;
    }

    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }

    public J setColorBind(String colorBind)
    {
        this.colorBind = colorBind;
        return (J) this;
    }

    public J setCpHeight(Integer cpHeight)
    {
        this.cpHeight = cpHeight;
        return (J) this;
    }

    public J setCpWidth(Integer cpWidth)
    {
        this.cpWidth = cpWidth;
        return (J) this;
    }

    public J setCpToggle(Boolean cpToggle)
    {
        this.cpToggle = cpToggle;
        return (J) this;
    }

    public J setCpDisabled(Boolean cpDisabled)
    {
        this.cpDisabled = cpDisabled;
        return (J) this;
    }

    public J setCpCmykEnabled(Boolean cpCmykEnabled)
    {
        this.cpCmykEnabled = cpCmykEnabled;
        return (J) this;
    }

    public J setCpOutputFormat(NgxColorPickerOutputFormats cpOutputFormat)
    {
        this.cpOutputFormat = cpOutputFormat;
        return (J) this;
    }

    public J setCpAlphaChannel(NgxColorPickerAlphaChannel cpAlphaChannel)
    {
        this.cpAlphaChannel = cpAlphaChannel;
        return (J) this;
    }

    public J setCpFallbackColor(String cpFallbackColor)
    {
        this.cpFallbackColor = cpFallbackColor;
        return (J) this;
    }

    public J setCpPosition(NgxColorPickerPosition cpPosition)
    {
        this.cpPosition = cpPosition;
        return (J) this;
    }

    public J setCpPositionOffset(Double cpPositionOffset)
    {
        this.cpPositionOffset = cpPositionOffset;
        return (J) this;
    }

    public J setCpPositionRelativeToArrow(Boolean cpPositionRelativeToArrow)
    {
        this.cpPositionRelativeToArrow = cpPositionRelativeToArrow;
        return (J) this;
    }

    public J setCpPresetLabel(Double cpPresetLabel)
    {
        this.cpPresetLabel = cpPresetLabel;
        return (J) this;
    }

    public J setCpPresetColors(Double cpPresetColors)
    {
        this.cpPresetColors = cpPresetColors;
        return (J) this;
    }

    public J setCpDisableInput(Double cpDisableInput)
    {
        this.cpDisableInput = cpDisableInput;
        return (J) this;
    }

    public J setCpDialogDisplay(Double cpDialogDisplay)
    {
        this.cpDialogDisplay = cpDialogDisplay;
        return (J) this;
    }

    public J setCpIgnoredElements(Double cpIgnoredElements)
    {
        this.cpIgnoredElements = cpIgnoredElements;
        return (J) this;
    }

    public J setCpSaveClickOutside(Boolean cpSaveClickOutside)
    {
        this.cpSaveClickOutside = cpSaveClickOutside;
        return (J) this;
    }

    public J setCpCloseClickOutside(Boolean cpCloseClickOutside)
    {
        this.cpCloseClickOutside = cpCloseClickOutside;
        return (J) this;
    }

    public J setCpCancelButton(Boolean cpCancelButton)
    {
        this.cpCancelButton = cpCancelButton;
        return (J) this;
    }

    public J setCpCancelButtonClass(String cpCancelButtonClass)
    {
        this.cpCancelButtonClass = cpCancelButtonClass;
        return (J) this;
    }

    public J setCpOkButton(Boolean cpOkButton)
    {
        this.cpOkButton = cpOkButton;
        return (J) this;
    }

    public J setCpOkButtonClass(String cpOkButtonClass)
    {
        this.cpOkButtonClass = cpOkButtonClass;
        return (J) this;
    }

    public J setCpAddColorButton(Boolean cpAddColorButton)
    {
        this.cpAddColorButton = cpAddColorButton;
        return (J) this;
    }

    public J setCpAddColorButtonClass(String cpAddColorButtonClass)
    {
        this.cpAddColorButtonClass = cpAddColorButtonClass;
        return (J) this;
    }

    public J setShowBackground(Boolean showBackground)
    {
        this.showBackground = showBackground;
        return (J) this;
    }
}
