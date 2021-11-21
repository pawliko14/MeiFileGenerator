public class BaseXML {

    private static String scoreDef = "                    <scoreDef meter.count=\"4\" meter.unit=\"4\" system.leftline=\"false\">\n" +
            "                        <staffGrp>\n" +
            "                            <staffDef n=\"1\" clef.line=\"2\" clef.shape=\"G\" lines=\"5\"/>\n" +
            "                        </staffGrp>\n" +
            "                    </scoreDef>";

    public static String baseXMLFirstPart = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<?xml-model href=\"https://music-encoding.org/schema/4.0.0/mei-all.rng\" type=\"application/xml\" schematypens=\"http://relaxng.org/ns/structure/1.0\"?>\n" +
            "<?xml-model href=\"https://music-encoding.org/schema/4.0.0/mei-all.rng\" type=\"application/xml\" schematypens=\"http://purl.oclc.org/dsdl/schematron\"?>\n" +
            "<mei xmlns=\"http://www.music-encoding.org/ns/mei\" meiversion=\"4.0.0\">\n" +
            "    <meiHead>\n" +
            "        <fileDesc>\n" +
            "            <titleStmt>\n" +
            "                <respStmt />\n" +
            "            </titleStmt>\n" +
            "            <pubStmt><availability>\n" +
            "            </availability>\n" +
            "                <date isodate=\"2021-06-04\" type=\"encoding-date\">2021-06-04</date>\n" +
            "            </pubStmt>\n" +
            "        </fileDesc>\n" +
            "    </meiHead>\n" +
            "    <music>\n" +
            "        <body>\n" +
            "            <mdiv xml:id=\"mubx173\">\n" +
            "                <score xml:id=\"seo3m9l\">\n" +
            ""    +scoreDef + "\n" +
            "                    <section xml:id=\"svuye9t\">";

public static String BaseXMlSecondPart = "                    </section>\n" +
        "                </score>\n" +
        "            </mdiv>\n" +
        "        </body>\n" +
        "    </music>\n" +
        "</mei>";
}
