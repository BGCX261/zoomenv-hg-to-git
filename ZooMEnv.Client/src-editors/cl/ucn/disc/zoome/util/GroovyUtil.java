package cl.ucn.disc.zoome.util;

import groovy.lang.Writable;
import groovy.text.SimpleTemplateEngine;
import groovy.text.Template;
import groovy.text.TemplateEngine;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

import org.codehaus.groovy.control.CompilationFailedException;

public class GroovyUtil {
	public static TemplateEngine te = new SimpleTemplateEngine();
	public static String applyTemplate(String templateText, Map<String, Object> bindings) {
		try {
			Template template = te.createTemplate(templateText);
			Writable w = template.make(bindings);
			StringWriter sw = new StringWriter();
			w.writeTo(sw);
			return sw.toString();
		} catch (CompilationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
		
	}
}
