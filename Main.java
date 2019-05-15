////////////////////////////////////////////////////////////////////////
// 自作 McPlgUuidMan 利用イメージ
////////////////////////////////////////////////////////////////////////
public class Main{
    public static void main(String[] args){
	// 自作クラスMcPlgUuidManのインスタンス作成
	McPlgUuidMan mcUuid = new McPlgUuidMan(); 

	// putメソッドで登録
        mcUuid.put("12345678-5930-0873-b064-49c40d70da88", true); 
        mcUuid.put("UUID-01", false);
        mcUuid.put("UUID-02", true);

	// printメソッドで確認のため表示
        mcUuid.print("12345678-5930-0873-b064-49c40d70da88");
        mcUuid.print("UUID-01");
        mcUuid.print("UUID-02");
        mcUuid.print("UUID-03");
	// printALLメソッドで確認のため表示
	mcUuid.printAll();

	// UUID-01 を、エントリから削除
	// remove メソッドを使用
        System.out.println("remove UUID-01");
        mcUuid.remove("UUID-01");

	// printメソッドで確認のため表示
        mcUuid.print("12345678-5930-0873-b064-49c40d70da88");
        mcUuid.print("UUID-01");
        mcUuid.print("UUID-02");
        mcUuid.print("UUID-03");
	// printALLメソッドで確認のため表示
	mcUuid.printAll();

	// 12345678-5930-0873-b064-49c40d70da88 を、false へ変更
	// put メソッドを使用
        System.out.println("false 12345678-5930-0873-b064-49c40d70da88");
        mcUuid.put("12345678-5930-0873-b064-49c40d70da88",false);

	// printメソッドで確認のため表示
        mcUuid.print("12345678-5930-0873-b064-49c40d70da88");
        mcUuid.print("UUID-01");
        mcUuid.print("UUID-02");
        mcUuid.print("UUID-03");
	// printALLメソッドで確認のため表示
	mcUuid.printAll();

	// clearメソッドで全クリア
        mcUuid.clear();
	// printALLメソッドで確認のため表示
	mcUuid.printAll();
    }
}

/* 実行イメージ

値[12345678-5930-0873-b064-49c40d70da88]:true
値[UUID-01]:false
値[UUID-02]:true
値[UUID-03]:見つかりません
ALL UUID List
        [UUID-01]:false
        [UUID-02]:true
        [12345678-5930-0873-b064-49c40d70da88]:true
remove UUID-01
値[12345678-5930-0873-b064-49c40d70da88]:true
値[UUID-01]:見つかりません
値[UUID-02]:true
値[UUID-03]:見つかりません
ALL UUID List
        [UUID-02]:true
        [12345678-5930-0873-b064-49c40d70da88]:true
false 12345678-5930-0873-b064-49c40d70da88
値[12345678-5930-0873-b064-49c40d70da88]:false
値[UUID-01]:見つかりません
値[UUID-02]:true
値[UUID-03]:見つかりません
ALL UUID List
        [UUID-02]:true
        [12345678-5930-0873-b064-49c40d70da88]:false
ALL UUID List

 */
