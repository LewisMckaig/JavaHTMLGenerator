
package oodbproject;

    /**
     * Declares all of the tags that will be used in the program.
     */
public class Tag {

    /**
     *
     */
    protected static String closeHtml,
    body,closeBody,backBtn;
    
    
    public Tag(){
       closeHtml  = "</html>";
       body = "\n<body>";
       closeBody = "</body>";
       backBtn = "<button onclick=\"window.location.href='index.html'\">back to home</button>";
    }
    
    /**
     * creates a variable that is an open body tag and returns the string.
     * @return 
     */
    static String openBody(){
        return body;
    }
    
    /**
     * creates a String variable that is a close body tag and returns the string.
     * @return 
     */
    static String closeBody(){
        return closeBody;
    }
    
    /**
     * Generates a back button that links to the home page and returns the string.
     * @return 
     */
    static String backBtn(){
        return backBtn;
    }
    
    /**
     * Creates the <a> tags that link to a specific user page. This method recieves the users id and html to create the <a> tag and add it to the html.
     * @param text
     * @param id
     * @return 
     */
    static String pageLink(String text, String id){
        String html;
        html = "<a href =\"" + id +".html\"> "; 
        html = html + text + "</a><br> \n"; 
        return html;
    }
    
    /**
     * Returns a Closing Html Tag.
     * @return 
     */
    static String closePage(){
        return closeHtml;
    }
    
    /**
     * Generates a <p> tag from a string received.
     * @param txt
     * @return 
     */
    static String para(String txt){
        String html = ""; 
        html = html + "<P>" + txt + " </p>\n ";
        return html;
    }
}
