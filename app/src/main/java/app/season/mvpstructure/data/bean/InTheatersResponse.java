package app.season.mvpstructure.data.bean;

import java.util.List;

/**
 * Created by Season on 2016/3/25.
 */
public class InTheatersResponse {

    /**
     * count : 20
     * start : 0
     * total : 24
     * subjects : [{"rating":{"max":10,"average":9.3,"stars":"50","min":0},"genres":["喜剧","动作","动画"],"title":"疯狂动物城",
     * "casts":[{"alt":"http://movie.douban.com/celebrity/1017930/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/4815.jpg","large":"https://img3.doubanio.com/img/celebrity/large/4815.jpg",
     * "medium":"https://img3.doubanio.com/img/celebrity/medium/4815.jpg"},"name":"金妮弗·古德温","id":"1017930"},
     * {"alt":"http://movie.douban.com/celebrity/1013760/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/18772.jpg","large":"https://img1.doubanio.com/img/celebrity/large/18772.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/18772.jpg"},"name":"杰森·贝特曼","id":"1013760"},
     * {"alt":"http://movie.douban.com/celebrity/1049501/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/1410696326.11.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1410696326
     * .11.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1410696326.11.jpg"},"name":"伊德里斯·艾尔巴",
     * "id":"1049501"}],"collect_count":244376,"original_title":"Zootopia","subtype":"movie",
     * "directors":[{"alt":"http://movie.douban.com/celebrity/1286985/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1457505519.94.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1457505519
     * .94.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1457505519.94.jpg"},"name":"拜伦·霍华德",
     * "id":"1286985"},{"alt":"http://movie.douban.com/celebrity/1324037/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1456810684.78.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1456810684
     * .78.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1456810684.78.jpg"},"name":"瑞奇·摩尔",
     * "id":"1324037"},{"alt":"http://movie.douban.com/celebrity/1304069/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/1456810614.66.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1456810614
     * .66.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1456810614.66.jpg"},"name":"杰拉德·布什",
     * "id":"1304069"}],"year":"2016","images":{"small":"https://img1.doubanio
     * .com/view/movie_poster_cover/ipst/public/p2315672647.jpg","large":"https://img1.doubanio
     * .com/view/movie_poster_cover/lpst/public/p2315672647.jpg","medium":"https://img1.doubanio
     * .com/view/movie_poster_cover/spst/public/p2315672647.jpg"},"alt":"http://movie.douban.com/subject/25662329/",
     * "id":"25662329"},{"rating":{"max":10,"average":7.9,"stars":"40","min":0},"genres":["动作","科幻","奇幻"],
     * "title":"蝙蝠侠大战超人：正义黎明","casts":[{"alt":"http://movie.douban.com/celebrity/1044713/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/36357.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/36357.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/36357.jpg"},
     * "name":"亨利·卡维尔","id":"1044713"},{"alt":"http://movie.douban.com/celebrity/1054417/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/7622.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/7622.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/7622.jpg"},
     * "name":"本·阿弗莱克","id":"1054417"},{"alt":"http://movie.douban.com/celebrity/1022563/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/23782.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/23782.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/23782.jpg"},
     * "name":"艾米·亚当斯","id":"1022563"}],"collect_count":3283,"original_title":"Batman v Superman: Dawn of Justice",
     * "subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1031904/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/23346.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/23346.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/23346.jpg"},
     * "name":"扎克·施奈德","id":"1031904"}],"year":"2016","images":{"small":"https://img3.doubanio
     * .com/view/movie_poster_cover/ipst/public/p2316834186.jpg","large":"https://img3.doubanio
     * .com/view/movie_poster_cover/lpst/public/p2316834186.jpg","medium":"https://img3.doubanio
     * .com/view/movie_poster_cover/spst/public/p2316834186.jpg"},"alt":"http://movie.douban.com/subject/24750534/",
     * "id":"24750534"},{"rating":{"max":10,"average":3.7,"stars":"20","min":0},"genres":["动作","爱情","武侠"],
     * "title":"喜乐长安","casts":[{"alt":"http://movie.douban.com/celebrity/1339958/","avatars":{"small":"https://img3
     * .doubanio.com/img/celebrity/small/z78D12LQKVEcel_avatar_uploaded1398232275.41.jpg","large":"https://img3
     * .doubanio.com/img/celebrity/large/z78D12LQKVEcel_avatar_uploaded1398232275.41.jpg","medium":"https://img3
     * .doubanio.com/img/celebrity/medium/z78D12LQKVEcel_avatar_uploaded1398232275.41.jpg"},"name":"张天阳",
     * "id":"1339958"},{"alt":"http://movie.douban.com/celebrity/1328277/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1409068232.48.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1409068232
     * .48.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1409068232.48.jpg"},"name":"何泓姗",
     * "id":"1328277"},{"alt":"http://movie.douban.com/celebrity/1350240/","avatars":{"small":"https://img1.doubanio
     * .com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png",
     * "large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity
     * -default-large.png","medium":"https://img1.doubanio
     * .com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"万仓",
     * "id":"1350240"}],"collect_count":130,"original_title":"喜乐长安","subtype":"movie",
     * "directors":[{"alt":"http://movie.douban.com/celebrity/1327481/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1368521523.3.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1368521523.3
     * .jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1368521523.3.jpg"},"name":"竹卿",
     * "id":"1327481"}],"year":"2016","images":{"small":"https://img1.doubanio
     * .com/view/movie_poster_cover/ipst/public/p2323300602.jpg","large":"https://img1.doubanio
     * .com/view/movie_poster_cover/lpst/public/p2323300602.jpg","medium":"https://img1.doubanio
     * .com/view/movie_poster_cover/spst/public/p2323300602.jpg"},"alt":"http://movie.douban.com/subject/25924268/",
     * "id":"25924268"},{"rating":{"max":10,"average":7,"stars":"35","min":0},"genres":["喜剧","爱情","剧情"],"title":"缘份",
     * "casts":[{"alt":"http://movie.douban.com/celebrity/1003494/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/67.jpg","large":"https://img1.doubanio.com/img/celebrity/large/67.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/67.jpg"},"name":"张国荣","id":"1003494"},
     * {"alt":"http://movie.douban.com/celebrity/1274231/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/793.jpg","large":"https://img1.doubanio.com/img/celebrity/large/793.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/793.jpg"},"name":"张曼玉","id":"1274231"},
     * {"alt":"http://movie.douban.com/celebrity/1047976/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/6677.jpg","large":"https://img1.doubanio.com/img/celebrity/large/6677.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/6677.jpg"},"name":"梅艳芳","id":"1047976"}],
     * "collect_count":6864,"original_title":"緣份","subtype":"movie","directors":[{"alt":"http://movie.douban
     * .com/celebrity/1322476/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1455792502.78.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/1455792502.78.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1455792502.78.jpg"},"name":"黄泰来","id":"1322476"}],"year":"1984",
     * "images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2325329438.jpg",
     * "large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2325329438.jpg","medium":"https://img1
     * .doubanio.com/view/movie_poster_cover/spst/public/p2325329438.jpg"},"alt":"http://movie.douban
     * .com/subject/1304961/","id":"1304961"},{"rating":{"max":10,"average":5.4,"stars":"30","min":0},
     * "genres":["剧情"],"title":"半熟少女","casts":[{"alt":"http://movie.douban.com/celebrity/1347985/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/BrbnU9r7uewcel_avatar_uploaded1423890664.7
     * .jpg","large":"https://img1.doubanio.com/img/celebrity/large/BrbnU9r7uewcel_avatar_uploaded1423890664.7.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/BrbnU9r7uewcel_avatar_uploaded1423890664.7.jpg"},
     * "name":"黄灿灿","id":"1347985"},{"alt":"http://movie.douban.com/celebrity/1315837/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/37266.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/37266.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/37266.jpg"},
     * "name":"敖犬","id":"1315837"},{"alt":"http://movie.douban.com/celebrity/1339697/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1406737170.56.jpg","large":"https://img3
     * .doubanio.com/img/celebrity/large/1406737170.56.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/1406737170.56.jpg"},"name":"南笙","id":"1339697"}],"collect_count":390,
     * "original_title":"半熟少女","subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1274272/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1369212463.55.jpg","large":"https://img3
     * .doubanio.com/img/celebrity/large/1369212463.55.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/1369212463.55.jpg"},"name":"阿牛","id":"1274272"},{"alt":"http://movie.douban
     * .com/celebrity/1320916/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1454162187.92.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/1454162187.92.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1454162187.92.jpg"},"name":"赵宇","id":"1320916"},{"alt":"http://movie.douban
     * .com/celebrity/1340717/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1402659545.4.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/1402659545.4.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1402659545.4.jpg"},"name":"陈立谦","id":"1340717"}],"year":"2016",
     * "images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2326378603.jpg",
     * "large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2326378603.jpg","medium":"https://img1
     * .doubanio.com/view/movie_poster_cover/spst/public/p2326378603.jpg"},"alt":"http://movie.douban
     * .com/subject/26345159/","id":"26345159"},{"rating":{"max":10,"average":7.9,"stars":"40","min":0},
     * "genres":["剧情","惊悚","冒险"],"title":"荒野猎人","casts":[{"alt":"http://movie.douban.com/celebrity/1041029/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/470.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/470.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/470.jpg"},
     * "name":"莱昂纳多·迪卡普里奥","id":"1041029"},{"alt":"http://movie.douban.com/celebrity/1049489/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/5110.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/5110.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/5110.jpg"},
     * "name":"汤姆·哈迪","id":"1049489"},{"alt":"http://movie.douban.com/celebrity/1313116/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1361026097.22.jpg","large":"https://img1
     * .doubanio.com/img/celebrity/large/1361026097.22.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1361026097.22.jpg"},"name":"多姆纳尔·格里森","id":"1313116"}],"collect_count":102699,
     * "original_title":"The Revenant","subtype":"movie","directors":[{"alt":"http://movie.douban
     * .com/celebrity/1054403/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/570.jpg",
     * "large":"https://img3.doubanio.com/img/celebrity/large/570.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/570.jpg"},"name":"亚利桑德罗·冈萨雷斯·伊纳里多","id":"1054403"}],"year":"2015",
     * "images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2323258429.jpg",
     * "large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2323258429.jpg","medium":"https://img1
     * .doubanio.com/view/movie_poster_cover/spst/public/p2323258429.jpg"},"alt":"http://movie.douban
     * .com/subject/5327268/","id":"5327268"},{"rating":{"max":10,"average":4.2,"stars":"25","min":0},"genres":["惊悚",
     * "恐怖"],"title":"恐怖将映","casts":[{"alt":"http://movie.douban.com/celebrity/1329038/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1455700183.29.jpg","large":"https://img1
     * .doubanio.com/img/celebrity/large/1455700183.29.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1455700183.29.jpg"},"name":"谢容儿","id":"1329038"},{"alt":"http://movie.douban
     * .com/celebrity/1341513/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1455700298.14.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/1455700298.14.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1455700298.14.jpg"},"name":"Mik Thongraya","id":"1341513"},{"alt":"http://movie
     * .douban.com/celebrity/1329039/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1455700402
     * .17.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1455700402.17.jpg","medium":"https://img1
     * .doubanio.com/img/celebrity/medium/1455700402.17.jpg"},"name":"杨杏","id":"1329039"}],"collect_count":160,
     * "original_title":"恐怖将映","subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1329037/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1456122805.33.jpg","large":"https://img1
     * .doubanio.com/img/celebrity/large/1456122805.33.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1456122805.33.jpg"},"name":"张洋","id":"1329037"}],"year":"2016",
     * "images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2326393841.jpg",
     * "large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2326393841.jpg","medium":"https://img3
     * .doubanio.com/view/movie_poster_cover/spst/public/p2326393841.jpg"},"alt":"http://movie.douban
     * .com/subject/26370966/","id":"26370966"},{"rating":{"max":10,"average":7,"stars":"35","min":0},
     * "genres":["剧情"],"title":"白毛女","casts":[{"alt":null,"avatars":null,"name":"赵路","id":null},{"alt":"http://movie
     * .douban.com/celebrity/1043190/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/49998.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/49998.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/49998.jpg"},"name":"陈强","id":"1043190"},{"alt":"http://movie.douban
     * .com/celebrity/1181025/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/14645.jpg",
     * "large":"https://img3.doubanio.com/img/celebrity/large/14645.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/14645.jpg"},"name":"田华","id":"1181025"}],"collect_count":2852,
     * "original_title":"白毛女","subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1309857/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/22848.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/22848.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/22848.jpg"},
     * "name":"王滨","id":"1309857"},{"alt":"http://movie.douban.com/celebrity/1039338/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/9658.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/9658.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/9658.jpg"},
     * "name":"水华","id":"1039338"}],"year":"1950","images":{"small":"https://img1.doubanio
     * .com/view/movie_poster_cover/ipst/public/p2046294083.jpg","large":"https://img1.doubanio
     * .com/view/movie_poster_cover/lpst/public/p2046294083.jpg","medium":"https://img1.doubanio
     * .com/view/movie_poster_cover/spst/public/p2046294083.jpg"},"alt":"http://movie.douban.com/subject/1432825/",
     * "id":"1432825"},{"rating":{"max":10,"average":6.8,"stars":"35","min":0},"genres":["动作","奇幻","冒险"],
     * "title":"神战：权力之眼","casts":[{"alt":"http://movie.douban.com/celebrity/1076051/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1368693740.25.jpg","large":"https://img3
     * .doubanio.com/img/celebrity/large/1368693740.25.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/1368693740.25.jpg"},"name":"尼古拉·科斯特-瓦尔道","id":"1076051"},{"alt":"http://movie.douban
     * .com/celebrity/1325896/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1410910563.02.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/1410910563.02.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1410910563.02.jpg"},"name":"布伦顿·思韦茨","id":"1325896"},{"alt":"http://movie.douban
     * .com/celebrity/1040500/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/406.jpg",
     * "large":"https://img3.doubanio.com/img/celebrity/large/406.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/406.jpg"},"name":"杰拉德·巴特勒","id":"1040500"}],"collect_count":13463,
     * "original_title":"Gods of Egypt","subtype":"movie","directors":[{"alt":"http://movie.douban
     * .com/celebrity/1027346/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/9385.jpg",
     * "large":"https://img3.doubanio.com/img/celebrity/large/9385.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/9385.jpg"},"name":"亚历克斯·普罗亚斯","id":"1027346"}],"year":"2016",
     * "images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2324130130.jpg",
     * "large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2324130130.jpg","medium":"https://img3
     * .doubanio.com/view/movie_poster_cover/spst/public/p2324130130.jpg"},"alt":"http://movie.douban
     * .com/subject/26662345/","id":"26662345"},{"rating":{"max":10,"average":6.5,"stars":"35","min":0},
     * "genres":["剧情","传记","动作"],"title":"叶问3","casts":[{"alt":"http://movie.douban.com/celebrity/1025194/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/10695.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/10695.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/10695.jpg"},
     * "name":"甄子丹","id":"1025194"},{"alt":"http://movie.douban.com/celebrity/1009368/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/27423.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/27423.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/27423.jpg"},
     * "name":"迈克·泰森","id":"1009368"},{"alt":"http://movie.douban.com/celebrity/1318005/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1436092731.86.jpg","large":"https://img3
     * .doubanio.com/img/celebrity/large/1436092731.86.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/1436092731.86.jpg"},"name":"张晋","id":"1318005"}],"collect_count":48009,
     * "original_title":"叶问3","subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1274472/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1357216202.15.jpg","large":"https://img3
     * .doubanio.com/img/celebrity/large/1357216202.15.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/1357216202.15.jpg"},"name":"叶伟信","id":"1274472"}],"year":"2015",
     * "images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2322954776.jpg",
     * "large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2322954776.jpg","medium":"https://img3
     * .doubanio.com/view/movie_poster_cover/spst/public/p2322954776.jpg"},"alt":"http://movie.douban
     * .com/subject/11598977/","id":"11598977"},{"rating":{"max":10,"average":4.8,"stars":"25","min":0},
     * "genres":["喜剧","爱情"],"title":"女汉子真爱公式","casts":[{"alt":"http://movie.douban.com/celebrity/1275620/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1423139667.58.jpg","large":"https://img1
     * .doubanio.com/img/celebrity/large/1423139667.58.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1423139667.58.jpg"},"name":"赵丽颖","id":"1275620"},{"alt":"http://movie.douban
     * .com/celebrity/1031500/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/39883.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/39883.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/39883.jpg"},"name":"张翰","id":"1031500"},{"alt":"http://movie.douban
     * .com/celebrity/1320526/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/49339.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/49339.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/49339.jpg"},"name":"童菲","id":"1320526"}],"collect_count":3554,
     * "original_title":"女汉子真爱公式","subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1352793/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1451286288.54.jpg","large":"https://img1
     * .doubanio.com/img/celebrity/large/1451286288.54.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1451286288.54.jpg"},"name":"郭大雷","id":"1352793"}],"year":"2016",
     * "images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2324372895.jpg",
     * "large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2324372895.jpg","medium":"https://img3
     * .doubanio.com/view/movie_poster_cover/spst/public/p2324372895.jpg"},"alt":"http://movie.douban
     * .com/subject/26345736/","id":"26345736"},{"rating":{"max":10,"average":8.1,"stars":"40","min":0},
     * "genres":["剧情","喜剧","传记"],"title":"飞鹰艾迪","casts":[{"alt":"http://movie.douban.com/celebrity/1340497/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1427190401.6.jpg","large":"https://img3
     * .doubanio.com/img/celebrity/large/1427190401.6.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/1427190401.6.jpg"},"name":"塔伦·埃格顿","id":"1340497"},{"alt":"http://movie.douban
     * .com/celebrity/1010508/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/22036.jpg",
     * "large":"https://img3.doubanio.com/img/celebrity/large/22036.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/22036.jpg"},"name":"休·杰克曼","id":"1010508"},{"alt":"http://movie.douban
     * .com/celebrity/1053574/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/519.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/519.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/519.jpg"},"name":"克里斯托弗·沃肯","id":"1053574"}],"collect_count":4294,
     * "original_title":"Eddie the Eagle","subtype":"movie","directors":[{"alt":"http://movie.douban
     * .com/celebrity/1007028/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/8696.jpg",
     * "large":"https://img3.doubanio.com/img/celebrity/large/8696.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/8696.jpg"},"name":"德克斯特·弗莱彻","id":"1007028"}],"year":"2016",
     * "images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2322216899.jpg",
     * "large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2322216899.jpg","medium":"https://img1
     * .doubanio.com/view/movie_poster_cover/spst/public/p2322216899.jpg"},"alt":"http://movie.douban
     * .com/subject/3072064/","id":"3072064"},{"rating":{"max":10,"average":7.2,"stars":"40","min":0},"genres":["喜剧",
     * "爱情","奇幻"],"title":"美人鱼","casts":[{"alt":"http://movie.douban.com/celebrity/1274235/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/805.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/805.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/805.jpg"},
     * "name":"邓超","id":"1274235"},{"alt":"http://movie.douban.com/celebrity/1274317/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/3083.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/3083.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/3083.jpg"},
     * "name":"罗志祥","id":"1274317"},{"alt":"http://movie.douban.com/celebrity/1274494/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/47020.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/47020.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/47020.jpg"},
     * "name":"张雨绮","id":"1274494"}],"collect_count":271977,"original_title":"美人鱼","subtype":"movie",
     * "directors":[{"alt":"http://movie.douban.com/celebrity/1048026/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/47421.jpg","large":"https://img3.doubanio.com/img/celebrity/large/47421.jpg",
     * "medium":"https://img3.doubanio.com/img/celebrity/medium/47421.jpg"},"name":"周星驰","id":"1048026"}],
     * "year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2316177058
     * .jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2316177058.jpg",
     * "medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2316177058.jpg"},"alt":"http://movie
     * .douban.com/subject/19944106/","id":"19944106"},{"rating":{"max":10,"average":5.1,"stars":"25","min":0},
     * "genres":["喜剧","家庭"],"title":"洛杉矶捣蛋计划","casts":[{"alt":"http://movie.douban.com/celebrity/1041082/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/48774.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/48774.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/48774.jpg"},
     * "name":"夏雨","id":"1041082"},{"alt":"http://movie.douban.com/celebrity/1324173/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1391090025.93.jpg","large":"https://img1
     * .doubanio.com/img/celebrity/large/1391090025.93.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1391090025.93.jpg"},"name":"宋祖儿","id":"1324173"},{"alt":"http://movie.douban
     * .com/celebrity/1314124/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1417797081.77.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/1417797081.77.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1417797081.77.jpg"},"name":"杨紫","id":"1314124"}],"collect_count":520,
     * "original_title":"洛杉矶捣蛋计划","subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1355008/",
     * "avatars":{"small":"https://img1.doubanio
     * .com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png",
     * "large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity
     * -default-large.png","medium":"https://img1.doubanio
     * .com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"郑潇",
     * "id":"1355008"}],"year":"2016","images":{"small":"https://img1.doubanio
     * .com/view/movie_poster_cover/ipst/public/p2323980819.jpg","large":"https://img1.doubanio
     * .com/view/movie_poster_cover/lpst/public/p2323980819.jpg","medium":"https://img1.doubanio
     * .com/view/movie_poster_cover/spst/public/p2323980819.jpg"},"alt":"http://movie.douban.com/subject/26729533/",
     * "id":"26729533"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","喜剧","爱情"],
     * "title":"一夜危机","casts":[{"alt":"http://movie.douban.com/celebrity/1337187/","avatars":{"small":"https://img1
     * .doubanio.com/img/celebrity/small/1457601273.32.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/1457601273.32.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1457601273.32.jpg"},"name":"萧浩冉","id":"1337187"},{"alt":"http://movie.douban
     * .com/celebrity/1355486/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1457601049.94.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/1457601049.94.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1457601049.94.jpg"},"name":"徐熙遥","id":"1355486"},{"alt":"http://movie.douban
     * .com/celebrity/1274652/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/5993.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/5993.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/5993.jpg"},"name":"姜超","id":"1274652"}],"collect_count":22,"original_title":"一夜危机",
     * "subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1328733/",
     * "avatars":{"small":"https://img1.doubanio
     * .com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png",
     * "large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity
     * -default-large.png","medium":"https://img1.doubanio
     * .com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"苗述",
     * "id":"1328733"}],"year":"2016","images":{"small":"https://img1.doubanio
     * .com/view/movie_poster_cover/ipst/public/p2323872469.jpg","large":"https://img1.doubanio
     * .com/view/movie_poster_cover/lpst/public/p2323872469.jpg","medium":"https://img1.doubanio
     * .com/view/movie_poster_cover/spst/public/p2323872469.jpg"},"alt":"http://movie.douban.com/subject/26742358/",
     * "id":"26742358"},{"rating":{"max":10,"average":7.9,"stars":"40","min":0},"genres":["喜剧","动作","动画"],
     * "title":"功夫熊猫3","casts":[{"alt":"http://movie.douban.com/celebrity/1049492/","avatars":{"small":"https://img1
     * .doubanio.com/img/celebrity/small/35722.jpg","large":"https://img1.doubanio.com/img/celebrity/large/35722
     * .jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/35722.jpg"},"name":"杰克·布莱克","id":"1049492"},
     * {"alt":"http://movie.douban.com/celebrity/1054447/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1592.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1592.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/1592.jpg"},"name":"安吉丽娜·朱莉","id":"1054447"},
     * {"alt":"http://movie.douban.com/celebrity/1054427/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/604.jpg","large":"https://img1.doubanio.com/img/celebrity/large/604.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/604.jpg"},"name":"达斯汀·霍夫曼","id":"1054427"}],
     * "collect_count":113629,"original_title":"Kung Fu Panda 3","subtype":"movie","directors":[{"alt":"http://movie
     * .douban.com/celebrity/1301570/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/27153.jpg",
     * "large":"https://img1.doubanio.com/img/celebrity/large/27153.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/27153.jpg"},"name":"吕寅荣","id":"1301570"},{"alt":"http://movie.douban
     * .com/celebrity/1351289/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1453889524.61.jpg",
     * "large":"https://img3.doubanio.com/img/celebrity/large/1453889524.61.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/1453889524.61.jpg"},"name":"亚历山德罗·卡罗尼","id":"1351289"}],"year":"2016",
     * "images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2306653420.jpg",
     * "large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2306653420.jpg","medium":"https://img3
     * .doubanio.com/view/movie_poster_cover/spst/public/p2306653420.jpg"},"alt":"http://movie.douban
     * .com/subject/11589036/","id":"11589036"},{"rating":{"max":10,"average":0,"stars":"00","min":0},
     * "genres":["戏曲"],"title":"白毛女","casts":[{"alt":null,"avatars":null,"name":"雷佳","id":null},{"alt":null,
     * "avatars":null,"name":"张英席","id":null},{"alt":null,"avatars":null,"name":"高鹏","id":null}],"collect_count":21,
     * "original_title":"白毛女","subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1325604/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1355121149.54.jpg","large":"https://img1
     * .doubanio.com/img/celebrity/large/1355121149.54.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1355121149.54.jpg"},"name":"侯克明","id":"1325604"}],"year":"2015",
     * "images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2309622277.jpg",
     * "large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2309622277.jpg","medium":"https://img1
     * .doubanio.com/view/movie_poster_cover/spst/public/p2309622277.jpg"},"alt":"http://movie.douban
     * .com/subject/26708775/","id":"26708775"},{"rating":{"max":10,"average":7.3,"stars":"40","min":0},
     * "genres":["剧情","传记","历史"],"title":"地心营救","casts":[{"alt":"http://movie.douban.com/celebrity/1022582/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/8832.jpg","large":"https://img1.doubanio
     * .com/img/celebrity/large/8832.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/8832.jpg"},
     * "name":"安东尼奥·班德拉斯","id":"1022582"},{"alt":"http://movie.douban.com/celebrity/1016677/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/45471.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/45471.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/45471.jpg"},
     * "name":"朱丽叶·比诺什","id":"1016677"},{"alt":"http://movie.douban.com/celebrity/1022622/",
     * "avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1382882466.42.jpg","large":"https://img1
     * .doubanio.com/img/celebrity/large/1382882466.42.jpg","medium":"https://img1.doubanio
     * .com/img/celebrity/medium/1382882466.42.jpg"},"name":"罗德里格·桑托罗","id":"1022622"}],"collect_count":7248,
     * "original_title":"The 33","subtype":"movie","directors":[{"alt":"http://movie.douban.com/celebrity/1319550/",
     * "avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/47406.jpg","large":"https://img3.doubanio
     * .com/img/celebrity/large/47406.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/47406.jpg"},
     * "name":"派翠西亚·里根","id":"1319550"}],"year":"2015","images":{"small":"https://img3.doubanio
     * .com/view/movie_poster_cover/ipst/public/p2316133145.jpg","large":"https://img3.doubanio
     * .com/view/movie_poster_cover/lpst/public/p2316133145.jpg","medium":"https://img3.doubanio
     * .com/view/movie_poster_cover/spst/public/p2316133145.jpg"},"alt":"http://movie.douban.com/subject/10568385/",
     * "id":"10568385"},{"rating":{"max":10,"average":2.8,"stars":"15","min":0},"genres":["惊悚","恐怖"],"title":"床下有人3",
     * "casts":[{"alt":"http://movie.douban.com/celebrity/1340984/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1403756298.69.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1403756298
     * .69.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1403756298.69.jpg"},"name":"殷果儿",
     * "id":"1340984"},{"alt":"http://movie.douban.com/celebrity/1353663/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1451208109.64.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1451208109
     * .64.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1451208109.64.jpg"},"name":"姜文轩",
     * "id":"1353663"},{"alt":"http://movie.douban.com/celebrity/1353664/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1451208264.72.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1451208264
     * .72.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1451208264.72.jpg"},"name":"苗青",
     * "id":"1353664"}],"collect_count":460,"original_title":"床下有人3","subtype":"movie",
     * "directors":[{"alt":"http://movie.douban.com/celebrity/1319241/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/1405653986.06.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1405653986
     * .06.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1405653986.06.jpg"},"name":"尚永峰",
     * "id":"1319241"}],"year":"2015","images":{"small":"https://img3.doubanio
     * .com/view/movie_poster_cover/ipst/public/p2323866935.jpg","large":"https://img3.doubanio
     * .com/view/movie_poster_cover/lpst/public/p2323866935.jpg","medium":"https://img3.doubanio
     * .com/view/movie_poster_cover/spst/public/p2323866935.jpg"},"alt":"http://movie.douban.com/subject/26694681/",
     * "id":"26694681"},{"rating":{"max":10,"average":7,"stars":"35","min":0},"genres":["喜剧","动作"],"title":"厨子戏子痞子",
     * "casts":[{"alt":"http://movie.douban.com/celebrity/1000572/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/43.jpg","large":"https://img1.doubanio.com/img/celebrity/large/43.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/43.jpg"},"name":"刘烨","id":"1000572"},
     * {"alt":"http://movie.douban.com/celebrity/1274319/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/49047.jpg","large":"https://img1.doubanio.com/img/celebrity/large/49047.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/49047.jpg"},"name":"张涵予","id":"1274319"},
     * {"alt":"http://movie.douban.com/celebrity/1274242/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/1656.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1656.jpg",
     * "medium":"https://img3.doubanio.com/img/celebrity/medium/1656.jpg"},"name":"黄渤","id":"1274242"}],
     * "collect_count":165897,"original_title":"厨子戏子痞子","subtype":"movie","directors":[{"alt":"http://movie.douban
     * .com/celebrity/1274919/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/8171.jpg",
     * "large":"https://img3.doubanio.com/img/celebrity/large/8171.jpg","medium":"https://img3.doubanio
     * .com/img/celebrity/medium/8171.jpg"},"name":"管虎","id":"1274919"}],"year":"2013",
     * "images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p1903751875.jpg",
     * "large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p1903751875.jpg","medium":"https://img3
     * .doubanio.com/view/movie_poster_cover/spst/public/p1903751875.jpg"},"alt":"http://movie.douban
     * .com/subject/6011806/","id":"6011806"}]
     * title : 正在上映的电影-北京
     */

    private int count;
    private int start;
    private int total;
    private String title;
    /**
     * rating : {"max":10,"average":9.3,"stars":"50","min":0}
     * genres : ["喜剧","动作","动画"]
     * title : 疯狂动物城
     * casts : [{"alt":"http://movie.douban.com/celebrity/1017930/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/4815.jpg","large":"https://img3.doubanio.com/img/celebrity/large/4815.jpg",
     * "medium":"https://img3.doubanio.com/img/celebrity/medium/4815.jpg"},"name":"金妮弗·古德温","id":"1017930"},
     * {"alt":"http://movie.douban.com/celebrity/1013760/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/18772.jpg","large":"https://img1.doubanio.com/img/celebrity/large/18772.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/18772.jpg"},"name":"杰森·贝特曼","id":"1013760"},
     * {"alt":"http://movie.douban.com/celebrity/1049501/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/1410696326.11.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1410696326
     * .11.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1410696326.11.jpg"},"name":"伊德里斯·艾尔巴",
     * "id":"1049501"}]
     * collect_count : 244376
     * original_title : Zootopia
     * subtype : movie
     * directors : [{"alt":"http://movie.douban.com/celebrity/1286985/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1457505519.94.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1457505519
     * .94.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1457505519.94.jpg"},"name":"拜伦·霍华德",
     * "id":"1286985"},{"alt":"http://movie.douban.com/celebrity/1324037/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/1456810684.78.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1456810684
     * .78.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1456810684.78.jpg"},"name":"瑞奇·摩尔",
     * "id":"1324037"},{"alt":"http://movie.douban.com/celebrity/1304069/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/1456810614.66.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1456810614
     * .66.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1456810614.66.jpg"},"name":"杰拉德·布什",
     * "id":"1304069"}]
     * year : 2016
     * images : {"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2315672647.jpg",
     * "large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2315672647.jpg","medium":"https://img1
     * .doubanio.com/view/movie_poster_cover/spst/public/p2315672647.jpg"}
     * alt : http://movie.douban.com/subject/25662329/
     * id : 25662329
     */

    private List<SubjectsEntity> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsEntity> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsEntity> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsEntity {
        /**
         * max : 10
         * average : 9.3
         * stars : 50
         * min : 0
         */

        private RatingEntity rating;
        private String title;
        private int collect_count;
        private String original_title;
        private String subtype;
        private String year;
        /**
         * small : https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2315672647.jpg
         * large : https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2315672647.jpg
         * medium : https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2315672647.jpg
         */

        private ImagesEntity images;
        private String alt;
        private String id;
        private List<String> genres;
        /**
         * alt : http://movie.douban.com/celebrity/1017930/
         * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/4815.jpg","large":"https://img3.doubanio
         * .com/img/celebrity/large/4815.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/4815.jpg"}
         * name : 金妮弗·古德温
         * id : 1017930
         */

        private List<CastsEntity> casts;
        /**
         * alt : http://movie.douban.com/celebrity/1286985/
         * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/1457505519.94.jpg","large":"https://img1
         * .doubanio.com/img/celebrity/large/1457505519.94.jpg","medium":"https://img1.doubanio
         * .com/img/celebrity/medium/1457505519.94.jpg"}
         * name : 拜伦·霍华德
         * id : 1286985
         */

        private List<DirectorsEntity> directors;

        public RatingEntity getRating() {
            return rating;
        }

        public void setRating(RatingEntity rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesEntity getImages() {
            return images;
        }

        public void setImages(ImagesEntity images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsEntity> getCasts() {
            return casts;
        }

        public void setCasts(List<CastsEntity> casts) {
            this.casts = casts;
        }

        public List<DirectorsEntity> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsEntity> directors) {
            this.directors = directors;
        }

        public static class RatingEntity {
            private int max;
            private double average;
            private String stars;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public double getAverage() {
                return average;
            }

            public void setAverage(double average) {
                this.average = average;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesEntity {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class CastsEntity {
            private String alt;
            /**
             * small : https://img3.doubanio.com/img/celebrity/small/4815.jpg
             * large : https://img3.doubanio.com/img/celebrity/large/4815.jpg
             * medium : https://img3.doubanio.com/img/celebrity/medium/4815.jpg
             */

            private AvatarsEntity avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsEntity getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsEntity avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsEntity {
                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }

        public static class DirectorsEntity {
            private String alt;
            /**
             * small : https://img1.doubanio.com/img/celebrity/small/1457505519.94.jpg
             * large : https://img1.doubanio.com/img/celebrity/large/1457505519.94.jpg
             * medium : https://img1.doubanio.com/img/celebrity/medium/1457505519.94.jpg
             */

            private AvatarsEntity avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsEntity getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsEntity avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsEntity {
                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}
