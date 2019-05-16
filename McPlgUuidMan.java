import java.util.HashMap;

//////////////////////////////////////////////////////////////////
// 自作 McPlgUuidManクラス
// UUID と Boolean を管理する
// 例
//   +--------------------------------------+------+
//   | UUID                                 | Bool |
//   +--------------------------------------+------+
//   | 12345678-5930-0873-b064-49c40d70da88 | true |
//   | 12345678-cf03-403a-901d-e1477de86701 | false|
//   +--------------------------------------+------+
//////////////////////////////////////////////////////////////////
public class McPlgUuidMan{
    //////////////////////////////////////////////////////////////////
    // private
    //////////////////////////////////////////////////////////////////

    // HashMap インスタンスを利用した管理テーブル
    private HashMap<String, Boolean> _hashmap;

    // このクラスに唯一のインスタンス
    private static McPlgUuidMan instance = new McPlgUuidMan();

    // private コンストラクタ(初期化)
    private McPlgUuidMan(){
	_hashmap = new HashMap<String, Boolean>();
    }

    //////////////////////////////////////////////////////////////////
    // 以下本クラスで提供するメソッド (public)
    //////////////////////////////////////////////////////////////////
    // インスタンス取得メソッド
    public static McPlgUuidMan getInstance() {
	return instance;
    }

    // 登録/変更メソッド
    public void put(String uuid, Boolean bo)
    {
	// HashMapクラスのputメソッドはuuidが存在しなれば追加/存在すれば変更となる
	_hashmap.put(uuid,bo);
    }

    // 削除メソッド (uuid指定)
    public void remove(String uuid)
    {
	_hashmap.remove(uuid);
    }

    // 全削除メソッド
    public void clear()
    {
	_hashmap.clear();
    }

    // 参照メソッド (uuid をキーにbooleanを返却)
    public Boolean get(String uuid)
    {
	return _hashmap.get(uuid);	
    }

    // 表示メソッド(uuid指定)
    public void print(String uuid)
    {
	Boolean bo = get(uuid);
	if(null == bo){
	    System.out.println("値[" + uuid + "]:" + "見つかりません");
	}
	else{
	    System.out.println("値[" + uuid + "]:" + bo);
	}
    }

    // 表示メソッド(ALL)
    public void printAll()
    {
	System.out.println("ALL UUID List");
	for (String key : _hashmap.keySet()) {
	    System.out.println("\t[" + key + "]:" + get(key));
        }
    }
}
