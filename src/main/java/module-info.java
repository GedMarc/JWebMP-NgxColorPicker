import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.services.*;
import com.jwebmp.plugins.angular.ngxcolorpicker.*;


module com.jwebmp.plugins.angular.ngxcolorpicker {
	requires com.jwebmp.core.angular;
	
	
	
	provides IPageConfigurator with NgxColorPickerPageConfigurator;
}