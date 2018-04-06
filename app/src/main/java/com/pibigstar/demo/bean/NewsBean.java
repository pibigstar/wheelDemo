package com.pibigstar.demo.bean;

import java.util.List;

/**
 * Created by pibigstar on 2018/2/28.
 */

public class NewsBean {


    /**
     * code : 1
     * message : success
     * result : {"items":[{"detail":"","href":"http://www.oschina.net/news/79650/2017-top-programming-languages","id":79650,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_048424e4-a8c3-41e8-91ef-aa009e3fc559.jpg","name":"2017 年热门编程语言排行榜","pubDate":"2016-12-06 11:51:24","type":6},{"detail":"","href":"https://www.oschina.net/question/2720166_2210842","id":2210842,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_eb9137ea-efb2-49aa-99fd-025a221dcfe7.jpg","name":"高手问答 | MySQL 开发和运维规范","pubDate":"2016-12-06 15:48:10","type":2},{"detail":"","href":"http://www.oschina.net/news/79757/tiobe-12","id":79757,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_70ceba24-eb96-4710-99ec-c1cb5a26a3d6.jpg","name":"C 语言为何一蹶不振？","pubDate":"2016-12-08 15:18:20","type":6},{"detail":"","href":"https://www.oschina.net/news/79732/firebug-stop-develope-and-maintain","id":79732,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_16e9be1b-2a6b-453f-bafa-442fd043024b.jpg","name":"Firebug 宣布不再维护，讲不出再见！","pubDate":"2016-12-08 10:56:47","type":6},{"detail":"","href":"http://www.oschina.net/news/79673/the-founder-of-cm-was-fired","id":79673,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_63725513-45e4-4fb2-a0bf-c7940a7a87bc.jpg","name":"Cyanogen 之父被踢出局","pubDate":"2016-12-06 11:48:43","type":6}],"nextPageToken":"61AF0C190D6BD629","prevPageToken":"3EA621243546C8A5","requestCount":5,"responseCount":5,"totalResults":5}
     * time : 2016-12-13 10:56:41
     */

    private int code;
    private String message;
    private ResultBean result;
    private String time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class ResultBean {
        /**
         * items : [{"detail":"","href":"http://www.oschina.net/news/79650/2017-top-programming-languages","id":79650,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_048424e4-a8c3-41e8-91ef-aa009e3fc559.jpg","name":"2017 年热门编程语言排行榜","pubDate":"2016-12-06 11:51:24","type":6},{"detail":"","href":"https://www.oschina.net/question/2720166_2210842","id":2210842,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_eb9137ea-efb2-49aa-99fd-025a221dcfe7.jpg","name":"高手问答 | MySQL 开发和运维规范","pubDate":"2016-12-06 15:48:10","type":2},{"detail":"","href":"http://www.oschina.net/news/79757/tiobe-12","id":79757,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_70ceba24-eb96-4710-99ec-c1cb5a26a3d6.jpg","name":"C 语言为何一蹶不振？","pubDate":"2016-12-08 15:18:20","type":6},{"detail":"","href":"https://www.oschina.net/news/79732/firebug-stop-develope-and-maintain","id":79732,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_16e9be1b-2a6b-453f-bafa-442fd043024b.jpg","name":"Firebug 宣布不再维护，讲不出再见！","pubDate":"2016-12-08 10:56:47","type":6},{"detail":"","href":"http://www.oschina.net/news/79673/the-founder-of-cm-was-fired","id":79673,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_63725513-45e4-4fb2-a0bf-c7940a7a87bc.jpg","name":"Cyanogen 之父被踢出局","pubDate":"2016-12-06 11:48:43","type":6}]
         * nextPageToken : 61AF0C190D6BD629
         * prevPageToken : 3EA621243546C8A5
         * requestCount : 5
         * responseCount : 5
         * totalResults : 5
         */

        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * detail :
             * href : http://www.oschina.net/news/79650/2017-top-programming-languages
             * id : 79650
             * img : https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_048424e4-a8c3-41e8-91ef-aa009e3fc559.jpg
             * name : 2017 年热门编程语言排行榜
             * pubDate : 2016-12-06 11:51:24
             * type : 6
             */

            private String detail;
            private String href;
            private int id;
            private String img;
            private String name;
            private String pubDate;
            private int type;

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
