import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angular.colorpicker.implementations.NgxColorPickerModuleInclusion;
import com.jwebmp.plugins.angular.colorpicker.implementations.NgxColorPickerPageConfigurator;


module com.jwebmp.plugins.angular.colorpicker {

    exports com.jwebmp.plugins.angular.colorpicker;

    requires com.jwebmp.core.base.angular.client;
    requires com.jwebmp.client;
    requires com.jwebmp.core;
    requires static lombok;

    provides IPageConfigurator with NgxColorPickerPageConfigurator;
    provides IGuiceScanModuleInclusions with NgxColorPickerModuleInclusion;

    opens com.jwebmp.plugins.angular.colorpicker to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.plugins.angular.colorpicker.implementations to com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core, com.jwebmp.core.angular;

}