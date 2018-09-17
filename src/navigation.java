public class navigation {

    public static void main(String[] args){
        for(int i=0; i<=40; i++){
            System.out.println("<navigation id=\"pcp" + i + "\" label=\"Domain Registrars\">\n" +
                    "\t\t<item id=\"no-view" + i + "\" label=\"Domain Registrars\">\n" +
                    "\t\t<plugs-to id=\"http://www.parallels.com/poa/pcp/services\"/>\n" +
                    "\t\t<view id=\"list_plugins" + i + "\" label=\"Domain Registrars\">\n" +
                    "\t\t</view>\n" +
                    "\t\t</item>\n" +
                    "\t\t</navigation>");
        }

    }


}
