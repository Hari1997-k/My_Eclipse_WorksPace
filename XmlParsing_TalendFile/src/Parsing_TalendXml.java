
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 *
 * @author HariKuntrapakam
 */
public class Parsing_TalendXml {

	public static void main(String[] args) {
		String setData = " ";
		String lable = " ";
		String withLable = " ";
		String withOutLable = " ";

		HashSet<String> hSet = new HashSet<String>();
		List<String> colData = new ArrayList<String>();
		HashMap<String, List<String>> Hmap = new HashMap<String, List<String>>();

		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = builder.parse("C:\\Users\\Yashoda\\Downloads\\GET_ETL_JOB_RUN_ID_0.1.item");
			XPathFactory pathfactory = XPathFactory.newInstance();
			XPath xpath = pathfactory.newXPath();

//HASHMAP(Value(An ArrayList Of String)):
			System.out.println("ColumnName @ SourceType (From Metadata) : ");
			System.out.println("========================================");
			NodeList nlist = doc.getElementsByTagName("metadata");

			for (int i = 0; i < nlist.getLength(); i++) {
				String data = doc.getElementsByTagName("column").item(i).getAttributes().getNamedItem("name")
						.getNodeValue() + " @ "
						+ doc.getElementsByTagName("column").item(i).getAttributes().getNamedItem("sourceType")
								.getNodeValue();
				colData.add(data);
			}
			for (String ss : colData) {
				System.out.println(ss);
			}
			System.out.println("====================================================");

//HASHMAP(KEY(Component Unique Value)):      

			System.out.println("Componenent_UmiqueName_Lable Name(From Component) : ");
			System.out.println("===================================================");
			String expression_1 = "//node//elementParameter[@name='UNIQUE_NAME' and  @name !='LABEL']";
			String expression_2 = "//node//elementParameter[ @name ='LABEL']";
			XPathExpression xexp_1 = xpath.compile(expression_1);
			XPathExpression xexp_2 = xpath.compile(expression_2);

			Object result_1 = xexp_1.evaluate(doc, XPathConstants.NODESET);
			Object result_2 = xexp_2.evaluate(doc, XPathConstants.NODESET);

			NodeList nlist_2 = (NodeList) result_1;
			NodeList nlist_3 = (NodeList) result_2;

			System.out.println(nlist_2.getLength());

			for (int j = 0; j < nlist_3.getLength(); j++) {
				lable = nlist_3.item(j).getAttributes().getNamedItem("value").getNodeValue();
			}

			for (int i = 0; i < nlist_2.getLength(); i++) {
				if (i < 1) {

					withLable = nlist_2.item(i).getAttributes().getNamedItem("name").getNodeValue() + "__"
							+ nlist_2.item(i).getAttributes().getNamedItem("value").getNodeValue() + "(" + lable + ")";
					Hmap.put(withLable, colData);

				} else {

					withOutLable = nlist_2.item(i).getAttributes().getNamedItem("name").getNodeValue() + "__"
							+ nlist_2.item(i).getAttributes().getNamedItem("value").getNodeValue() + "(" + ")";
					Hmap.put(withOutLable, colData);

				}

			}

			System.out.println("===================================================");

//**HASHSET :
			System.out.println("Source__Target__UniqueName_Value(From COnnection) : ");
			System.out.println("===================================================");
			NodeList nlist_1 = doc.getElementsByTagName("connection");
			String expression = "//connection//elementParameter[@name='UNIQUE_NAME']";
			XPathExpression xexp = xpath.compile(expression);
			Object result = xexp.evaluate(doc, XPathConstants.NODESET);
			NodeList nlist_key = (NodeList) result;

			for (int i = 0; i < nlist_1.getLength(); i++) {
//                System.out.println(nlist_1.item(i).getAttributes().getNamedItem("source").getNodeValue() + "__" + nlist_1.item(i).getAttributes().getNamedItem("target").getNodeValue() + "__" + nlist_key.item(i).getAttributes().getNamedItem("name").getNodeValue() + "__" + nlist_key.item(i).getAttributes().getNamedItem("value").getNodeValue());
				setData = nlist_1.item(i).getAttributes().getNamedItem("source").getNodeValue() + "__"
						+ nlist_1.item(i).getAttributes().getNamedItem("target").getNodeValue() + "__"
						+ nlist_key.item(i).getAttributes().getNamedItem("name").getNodeValue() + "__"
						+ nlist_key.item(i).getAttributes().getNamedItem("value").getNodeValue();
				hSet.add(setData);
			}

			for (String ss : hSet) {
				System.out.println(ss);
			}

			System.out.println("===================================================");
			System.out.println(Hmap.size());
			System.out.println(Hmap.keySet());
			System.out.println(Hmap.values());
			System.out.println(Hmap.get("UNIQUE_NAME__tMap_1()"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
