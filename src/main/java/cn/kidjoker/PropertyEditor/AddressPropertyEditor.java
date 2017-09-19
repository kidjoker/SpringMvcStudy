package cn.kidjoker.PropertyEditor;

import java.beans.PropertyEditorSupport;
import org.springframework.util.StringUtils;
import cn.kidjoker.model.Address;

public class AddressPropertyEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) {
		String[] strArr = StringUtils.tokenizeToStringArray(text, ",");
		Address arr = new Address();
		arr.setStreet(strArr[0]);
		arr.setDoorNum(strArr[1]);
		arr.setPostCode(strArr[2]);
	}	
}
