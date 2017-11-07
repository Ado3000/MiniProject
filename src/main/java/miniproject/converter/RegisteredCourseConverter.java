//package miniproject.converter;
//
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.FacesConverter;
//
//import miniproject.entities.RegisteredCourse;
//import miniproject.mjb.FacultyBean;
//
//
//@FacesConverter(forClass=RegisteredCourse.class)
//public class RegisteredCourseConverter implements Converter {
//
//	@Override
//	public Object getAsObject(FacesContext context, UIComponent component, String value) {
//		String courseid;
//		courseid = value;
//		
//		FacultyBean fb = context.getApplication().evaluateExpressionGet(context, "#{facultyBean}", FacultyBean.class);
//		return fb.getRegisteredCourseFacade().find(courseid);
//	}
//
////	@Override
////	public String getAsString(FacesContext context, UIComponent component, Object value) {
////		if (value == null) return "";
////		if (!(value instanceof RegisteredCourse)) return "";
////		return (RegisteredCourse value).get;
////	}
//
//}
