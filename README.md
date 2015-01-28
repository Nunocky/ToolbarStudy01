
[AndroidのToolBar（新しいActionBar）メモ](http://qiita.com/kobakei/items/f17019f8b0a88c8e57f4)を実装してみた

- MainActivity
 - SecondActivity ・・・ナビゲーションの表示
 - ThirdActivity ・・・カスタムビューの表示
 - ActionViewActivity ・・・アクションビューの表示


ナビゲーションの画像は [Action Bar Icon Pack](https://developer.android.com/intl/ja/design/downloads/index.html)より。

影を付ける方法がうまくいかなかったので、[別の方法(影を自作する)](http://qiita.com/tomoima525/items/d361d05adf6807e85ccd)を試した。

ActionViewはActionBarのときと同じ使い方で良い。Viewの幅が狭くなる問題も同じ方法で解決できる。

