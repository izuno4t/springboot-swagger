# SpringFox on SpringBoot

## Swagger UI

http://localhost:8080/swagger-ui.html

### XSS

クエリストリング url に Swagger ファイルを指定するとその内容で Swagger UI が動作する

    http://localhost:8080/swagger-ui.html?url=http://example.com/foo.yaml

例えば以下の場合、xss.yamlで指定された内容の画面が表示される。これはそもそもこのような機能なので、これを脆弱性として判断するのは不適切。

このような機能を（IPアドレスで制限しているとはいえ）アプリケーションで公開する考え方がおかしい。

    http://localhost:8080/swagger-ui.html?url=http://localhost:8080/xss.yaml

## refs

- [Spring BootのREST APIにSwaggerを導入する](https://qiita.com/YutaKase6/items/52ea048c5352c77330eb)
- [SpringFox導入時のNullPointerException回避](https://qiita.com/kannna5296/items/aa28bad96e6a91f8ee78)
- [SwaggerUI url parameter](https://github.com/swagger-api/swagger-ui/security/advisories/GHSA-qrmm-w75w-3wpx)

## update

- 2系は設定ファイルが必要だったが、3系は設定ファイル不要
- 
