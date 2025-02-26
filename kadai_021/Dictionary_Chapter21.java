package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {

HashMap<String,String> dictionaryMap = new HashMap<String,String>();

 public Dictionary_Chapter21() {

  dictionaryMap.put("apple","りんご");
  dictionaryMap.put("peach","桃");
  dictionaryMap.put("banana","バナナ");
  dictionaryMap.put("lemon","レモン");
  dictionaryMap.put("pear","梨");
  dictionaryMap.put("kiwi","キウィ");
  dictionaryMap.put("strawberry","いちご");
  dictionaryMap.put("grape","ぶどう");
  dictionaryMap.put("muscat","マスカット");
  dictionaryMap.put("cherry","さくらんぼ");
}

 public HashMap<String,String> getDictionaryMap() {
	return dictionaryMap;
 }

}
