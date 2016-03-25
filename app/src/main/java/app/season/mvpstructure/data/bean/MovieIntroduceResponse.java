package app.season.mvpstructure.data.bean;

import java.util.List;

/**
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-03-25
 * Time: 15:12
 * FIXME
 */
public class MovieIntroduceResponse {

    /**
     * max : 10
     * average : 9.3
     * stars : 50
     * min : 0
     */

    private RatingEntity rating;
    /**
     * rating : {"max":10,"average":9.3,"stars":"50","min":0}
     * reviews_count : 1886
     * wish_count : 28718
     * douban_site :
     * year : 2016
     * images : {"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2315672647.jpg",
     * "large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2315672647.jpg","medium":"https://img1
     * .doubanio.com/view/movie_poster_cover/spst/public/p2315672647.jpg"}
     * alt : http://movie.douban.com/subject/25662329/
     * id : 25662329
     * mobile_url : http://movie.douban.com/subject/25662329/mobile
     * title : 疯狂动物城
     * do_count : null
     * share_url : http://m.douban.com/movie/subject/25662329
     * seasons_count : null
     * schedule_url : http://movie.douban.com/subject/25662329/cinema/
     * episodes_count : null
     * countries : ["美国"]
     * genres : ["喜剧","动作","动画"]
     * collect_count : 245043
     * casts : [{"alt":"http://movie.douban.com/celebrity/1017930/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/4815.jpg","large":"https://img3.doubanio.com/img/celebrity/large/4815.jpg",
     * "medium":"https://img3.doubanio.com/img/celebrity/medium/4815.jpg"},"name":"金妮弗·古德温","id":"1017930"},
     * {"alt":"http://movie.douban.com/celebrity/1013760/","avatars":{"small":"https://img1.doubanio
     * .com/img/celebrity/small/18772.jpg","large":"https://img1.doubanio.com/img/celebrity/large/18772.jpg",
     * "medium":"https://img1.doubanio.com/img/celebrity/medium/18772.jpg"},"name":"杰森·贝特曼","id":"1013760"},
     * {"alt":"http://movie.douban.com/celebrity/1049501/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/1410696326.11.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1410696326
     * .11.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1410696326.11.jpg"},"name":"伊德里斯·艾尔巴",
     * "id":"1049501"},{"alt":"http://movie.douban.com/celebrity/1230973/","avatars":{"small":"https://img3.doubanio
     * .com/img/celebrity/small/52166.jpg","large":"https://img3.doubanio.com/img/celebrity/large/52166.jpg",
     * "medium":"https://img3.doubanio.com/img/celebrity/medium/52166.jpg"},"name":"珍妮·斯蕾特","id":"1230973"}]
     * current_season : null
     * original_title : Zootopia
     * summary : 故事发生在一个所有哺乳类动物和谐共存的美好世界中，兔子朱迪（金妮弗·古德温 Ginnifer Goodwin
     * 配音）从小就梦想着能够成为一名惩恶扬善的刑警，凭借着智慧和努力，朱迪成功的从警校中毕业进入了疯狂动物城警察局，殊不知这里是大型肉食类动物的领地，作为第一只，也是唯一的小型食草类动物，朱迪会遇到怎样的故事呢？
     近日里，城中接连发生动物失踪案件，就在全部警员都致力于调查案件真相之时，朱迪却被局长（伊德瑞斯·艾尔巴 Idris Elba 配音）发配成为了一名无足轻重的交警。某日，正在执勤的兔子遇见了名为尼克（杰森·贝特曼 Jason
     Bateman 配音）的狐狸，两人不打不相识，之后又误打误撞的接受了寻找失踪的水獭先生的任务，如果不能在两天之内找到水獭先生，朱迪就必须自愿离开警局。朱迪找到了尼克，两人联手揭露了一个隐藏在疯狂动物城之中的惊天秘密。©豆瓣
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
     * comments_count : 108043
     * ratings_count : 229937
     * aka : ["优兽大都会(港)","动物方城市(台)","动物乌托邦","动物大都会","Zootropolis"]
     */

    private int reviews_count;
    private int wish_count;
    private String douban_site;
    private String year;
    /**
     * small : https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2315672647.jpg
     * large : https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2315672647.jpg
     * medium : https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2315672647.jpg
     */

    private ImagesEntity images;
    private String alt;
    private String id;
    private String mobile_url;
    private String title;
    private Object do_count;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private Object episodes_count;
    private int collect_count;
    private Object current_season;
    private String original_title;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<String> countries;
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
     * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/1457505519.94.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1457505519.94.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1457505519.94.jpg"}
     * name : 拜伦·霍华德
     * id : 1286985
     */

    private List<DirectorsEntity> directors;
    private List<String> aka;

    public RatingEntity getRating() {
        return rating;
    }

    public void setRating(RatingEntity rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
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

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
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

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
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
