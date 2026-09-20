package generic_utilities;

public class PropertyUtility {

  public String readPropertyFile(String key){
    FileInputStream fis = new FileInputStream();
    Properties p= new Properties();
    p.load(fis);
    return p.getProperty(key);
  }

}
