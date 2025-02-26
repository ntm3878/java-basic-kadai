package kadai_021;
import java.util.HashMap;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Dictionary_Chapter21のインスタンス
		Dictionary_Chapter21 dictionaryInstance = new Dictionary_Chapter21();

		//dictionaryMapへのアクセス
		HashMap<String,String> dictionaryMap = dictionaryInstance.getDictionaryMap();
		
		//出力したいkeyを配列に格納
		String[] keysToPrint = {"apple", "banana", "grape", "orange"};
		
		//指定したkeyの値を出力
		for (String key : keysToPrint) {
			if (dictionaryMap.containsKey(key)) {
				System.out.println(key + ": " + dictionaryMap.get(key));
			} else {
				System.out.println(key + "　は存在しません。");
			}
		}
	
	}

}
