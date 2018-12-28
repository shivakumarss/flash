import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class DocHelper {

	public static void main(String[] args) throws IOException, DocumentException {

		String text = FileUtils.readFileToString(new File("/home/hduser/Desktop/test.xml"));
		Document doc = DocumentHelper.parseText(text);
		System.out.println(doc.asXML());

		Element rootElement = doc.getRootElement();
		List selectNodes = rootElement.selectNodes("/s:Envelope/s:Header");

		List<Element> elements = rootElement.elements();
		for (Element e : elements) {

			System.out.println(e.getName());
		}

	}
}
