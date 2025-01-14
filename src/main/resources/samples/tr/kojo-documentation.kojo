val sayfaBiçimi = "color:black;background-color:#aaddFF; margin:15px;font-size:small;"
val ortalamaBiçimi = "text-align:center;"

val sayfa = Page(
    name = "",
    body =
        <body style={ sayfaBiçimi + ortalamaBiçimi }>
      { for (i <- 1 to 5) yield { <br/> } }
      <h3>Kojo'ya hoşgeldin!</h3>
      Kojo diye yazılıyor ama Koco diye okunuyor bu kolay öğrenim ortamının adı.<br/>
      Kojo'yla bilgisayar programlamayı öğrenmek için şu sayfaya bakabilirsin:<br/>
        <a href="http://docs.kogics.net">Kojo Kullanma Kılavuzu</a><br/>
      http://docs.kogics.net
        <p>Ne yazık ki henüz İngilizce'ye çevrilmedi İnternet'teki bu büyük kılavuz.</p>
      <p>Ama <b>Örnekler</b>, <b>Sergi</b> ve <b>Araçlar</b> menülerindeki yazılımlara göz atarak epey çok şey öğrenmek mümkün.</p>
      <p>Bir de <b>Yardım</b> menüsündeki <b>Scala'ya Giriş</b> kılavuzunu okuyarak bilgini epey artırabilirsin.</p>
      <p><b>Sevgiler</b> ve <b>başarılar</b>!</p>
      </body>
)

val öykü = Story(sayfa)
stClear() // öyküyü temizle
stPlayStory(öykü) // öyküyü anlatmaya başla
